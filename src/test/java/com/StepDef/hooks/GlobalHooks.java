package com.StepDef.hooks;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import UtilityMethods.UtilMethods;
import io.cucumber.java.Scenario;
//import io.cucumber.messages.types.Scenario;
//import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

// QE_Framework_SeleniumJava_BDD_Framework

public class GlobalHooks extends UtilMethods {

	public static ExtentTest test;
	public Scenario scenario;
	public static String currentScenario;
	public static String featureName;

	public static ExtentReports extent = null;
	private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();


	@Before
	public void setUp(Scenario scenario) {

		try {
			this.scenario = scenario;
			currentScenario = scenario.getName();
//			String rawFeatureName = scenario.getId().split(";")[0].replace("_", " ");
//			featureName = rawFeatureName.substring(0, 1).toUpperCase() + rawFeatureName.substring(1);
//			System.out.println(" Feature file name" + featureName);
//			featureName = featureName.trim();
			// Extract feature name from scenario.getUri()
			String featureFilePath = scenario.getUri().getPath();
			String rawFeatureName = featureFilePath.substring(featureFilePath.lastIndexOf("/") + 1, featureFilePath.lastIndexOf("."));
			rawFeatureName = rawFeatureName.replace("-", " ").replace("_", " ");
			featureName = rawFeatureName.substring(0, 1).toUpperCase() + rawFeatureName.substring(1);

			System.out.println("Feature file name: " + featureName);
			featureName = featureName.trim();
			extent = extentReportSetup();
		} catch (Exception e) {
			System.err.println("Error in setUp: " + e.getMessage());
			// TODO: handle exception
		}

	}

	public String getScenarioName() {
		return currentScenario;
	}



	@After
	public void flushBrowser(Scenario scenario) {
		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "failure-screenshot.png");
		}
		if (driver != null) {
			driver.quit();
		}
		extent.flush();
	}

}
