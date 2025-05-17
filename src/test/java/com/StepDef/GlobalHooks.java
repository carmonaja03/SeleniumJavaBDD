package com.StepDef;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import UtilityMethods.UtilMethods;
import io.cucumber.core.api.Scenario;
//import io.cucumber.messages.types.Scenario;
//import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

// QE_Framework_SeleniumJava_BDD_Framework

public class GlobalHooks extends UtilMethods {

	public static ExtentTest test;
	public Scenario scenario;
	public static String currentScenario;
	public static String featureName;

	public static ExtentReports extent = null;

	@Before
	public void setUp(Scenario scenario) {

		try {
			this.scenario = scenario;
			currentScenario = scenario.getName();
			String rawFeatureName = scenario.getId().split(";")[0].replace("_", " ");
			featureName = rawFeatureName.substring(0, 1).toUpperCase() + rawFeatureName.substring(1);
			System.out.println(" Feature file name" + featureName);
			featureName = featureName.trim();
			extent = extentReportSetup();
		} catch (Exception e) {
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
			scenario.embed(screenshot, "image/png");
		}
		if (driver != null) {
			driver.quit();
		}
		extent.flush();
	}

}
