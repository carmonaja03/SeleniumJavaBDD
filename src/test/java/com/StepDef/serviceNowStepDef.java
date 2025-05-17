package com.StepDef;


import java.io.IOException;

import UtilityMethods.APIUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.vimalselvam.cucumber.listener.Reporter;

import UtilityMethods.UtilMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class serviceNowStepDef extends APIUtilities {

    static GlobalHooks hooks=new GlobalHooks();
    static String screenShotName = new Exception().getStackTrace()[0].getMethodName();


//    @Given("^I want to launch CRM Application \"(.*)\"$")
//    public static void i_want_to_CRM_Application(String browser) throws IOException
//    {
//        ExtentTest logg=null;
//        try {
//            logger=extent.createTest(Scenario.class, hooks.getScenarioName()).createNode(Feature.class, GlobalHooks.featureName)
//                    .createNode(Scenario.class, hooks.getScenarioName());
//            logg= logger.createNode(new GherkinKeyword("Given"), "I want to launch CRM Application");
//            openBrowser();
//            LaunchApp();
//            logg.log(Status.PASS, "Application launched successfully");
//            System.out.println("screenshot name: "+screenShotName);
//        } catch (Exception e) {
//
//            logg.log(Status.FAIL, "Not able to launch browse: "+e.getMessage());
//            e.printStackTrace();
//        }
//    }

//    @When("^User enters field \"(.*)\" as \"(.*)\" in text field$")
//    public void enterTextinTextField(String fieldName, String value) throws IOException, ClassNotFoundException {
//        ExtentTest logg=null;
//        logg= logger.createNode(new GherkinKeyword("When"), "User enters "+value+" as "+fieldName+" in text field");
//        String xpath = "//*[normalize-space(text())='" + fieldName + "']/following::input[1]";
//        if(driver.findElement(By.xpath(xpath)).isDisplayed()) {
//            driver.findElement(By.xpath(xpath)).clear();
//            driver.findElement(By.xpath(xpath)).sendKeys(value);
//
//            logg.log(Status.PASS, "User sucessfuly entered: "+value+" in "+fieldName+" textbox");
//            String screenshot=UtilMethods.captureScreenShot(driver, fieldName.replace(":", ""));
//            logg.addScreenCaptureFromPath(screenshot);
//
//        }else {
//            String screenshot=UtilMethods.captureScreenShot(driver, fieldName.replace(":", ""));
//            logg.log(Status.FAIL, fieldName+ "Element not found to enter "+value);
//            logg.addScreenCaptureFromPath(screenshot);
//        }
//
//    }

    @Given("Test endpoint")
    public void testEndpoint() {
        System.out.println("my test");
    }

    @When("User makes a {string} call to the endpoint")
    public void userMakesACallToTheEndpoint(String arg0) {
        System.out.println("Vinay please");
    }

    @Then("The API call returns {int}")
    public void theAPICallReturns(int arg0) {
        System.out.println(arg0);
    }

    @And("Check API response is not null")
    public void checkAPIResponseIsNotNull() {
        System.out.println("AND condition");
    }

    @And("{string} is returned")
    public void isReturned(String arg0) {
        System.out.println("Last step");
    }
}
