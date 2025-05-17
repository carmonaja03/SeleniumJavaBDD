package com.StepDef;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.Status;

import UtilityMethods.UtilMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class GenericStepdefCopyForExtentReport extends UtilMethods{
	/*static GlobalHooks hooks=new GlobalHooks();
	static String screenShotName = new Exception().getStackTrace()[0].getMethodName();
	
	
	@And("User selects \"(.*)\" from \"(.*)\" dropdown")
	public void user_Selects_Dropdown_Value(String value, String dropdownLabel) throws IOException {
		ExtentTest logg=null;
		try {
			logg= logger.createNode(new GherkinKeyword("And"), "User selects "+value+" from "+dropdownLabel+" dropdown");
			selectValueFromDropdown(value, dropdownLabel);
			logg.log(Status.PASS, "User successfully selected: "+value+" from "+dropdownLabel+" dropdown:"+dropdownLabel);
		} catch (Exception e) {
			String screenshot=UtilMethods.captureScreenShot(driver, dropdownLabel);
			logg.log(Status.FAIL, dropdownLabel+ " Element not found to select "+value+" :"+e.getMessage());
			logg.addScreenCaptureFromPath(screenshot);
		}
		
	}
	
	@And("User click on \"(.*)\" label")
	public void user_click_on_Label(String label) throws IOException, ClassNotFoundException {
		ExtentTest logg=null;
		try {
			logg= logger.createNode(new GherkinKeyword("And"), "User click on "+label+" label");
			clickOnLabel(label);
			String xpath = "//*[normalize-space(text())='" + label + "']|//*[@name='" + label + "']";
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
			WebElement element = driver.findElement(By.xpath(xpath));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
			logg.log(Status.PASS, "User successfully clicked on "+label);
		} catch (Exception e) {
			String screenshot=UtilMethods.captureScreenShot(driver, label.replace(":", ""));
			logg.log(Status.FAIL, "Unable to click on:"+label+" :"+e.getMessage());
			logg.addScreenCaptureFromPath(screenshot);
		}
		
	}
	
	@Then("^Verify visibility of labels in the page as per below Datatable$")
	public void verifyVisibilityOfLabels(DataTable labels) throws Exception {
		ExtentTest logg=null;
		try {
			logg= logger.createNode(new GherkinKeyword("Then"), 
					"Verify visibility of labels in the page as per below Datatable");
			List<String> list=labels.asList(String.class);
			for(String label: list) {
				String xpath = "//*[normalize-space(text())='" + label + "']|//*[@name='" + label + "']";
				String labelUI=driver.findElement(By.xpath(xpath)).getText().trim();
				if(labelUI.contains(label)) {
					logg.log(Status.PASS, "Successfully verified label in the page. Actual: "+labelUI+" Expected: "+label);
				}
			}
			
		} catch (Exception e) {
			String screenshot=UtilMethods.captureScreenShot(driver, "label");
			logg.log(Status.FAIL, "Label not visible in the page: "+e.getMessage());
			logg.addScreenCaptureFromPath(screenshot);
		}
		
	}
	
	@And("^i switch my cursor to frame \"(.*)\"$")
	public void switchingframeByName(String frameName) throws Exception {
		ExtentTest logg=null;
		try {
			logg= logger.createNode(new GherkinKeyword("And"), 
					"i switch my cursor to frame "+frameName);
			switchFrameByName(frameName);
			logg.log(Status.PASS, "Successfully switched to frame: "+frameName);
			
		} catch (Exception e) {
			String screenshot=UtilMethods.captureScreenShot(driver, "frame");
			logg.log(Status.FAIL, "Unable to switch to frame: "+e.getMessage());
			logg.addScreenCaptureFromPath(screenshot);
		}
		
	}
	
	@And("Enter values and in text field as per below header and value")
	public void enterTestInTextBoxAsPerHeaderAndValue(DataTable data) throws IOException{
		enteringTextAsPerHeaderAndVal(data);
	}
	
	@And("i switch to Alert and click on accept")
	public void switchToAlert() throws Exception {
		ExtentTest logg=null;
		try {
			logg= logger.createNode(new GherkinKeyword("And"), 
					"i switch to Alert and click on accept");
			alertAccept();
			logg.log(Status.PASS, "Successfully switched to alert and clicked on accept");
			
		} catch (Exception e) {
			String screenshot=UtilMethods.captureScreenShot(driver, "Alert");
			logg.log(Status.FAIL, "Unable to switch to Alert: "+e.getMessage());
			logg.addScreenCaptureFromPath(screenshot);
		}
		
	}
	
	@And("^i capture message from alert and verify \"(.*)\"$")
	public void verifyAlertMessage(String message) throws Exception {
		ExtentTest logg=null;
		try {
			logg= logger.createNode(new GherkinKeyword("And"), 
					"i capture message from alert and verify "+message);
			Alert alert = driver.switchTo().alert();
			if(alert.getText().trim().equals(message)) {
				logg.log(Status.PASS, "i capture message from alert and verify "+message);
			}else {
				String screenshot=UtilMethods.captureScreenShot(driver, "Alert");
				logg.log(Status.FAIL, "Unable to verify Alert message ");
				logg.addScreenCaptureFromPath(screenshot);
			}
			
			
		} catch (Exception e) {
			String screenshot=UtilMethods.captureScreenShot(driver, "Alert");
			logg.log(Status.FAIL, "Unable to verify Alert message "+e.getMessage());
			logg.addScreenCaptureFromPath(screenshot);
		}
		
	}
	
	@And("^i switch my cursor to default content$")
	public void switchToDefaultFrame() throws IOException {
		ExtentTest logg=null;
		try {
			logg= logger.createNode(new GherkinKeyword("And"), 
					"i switch Deafult frame");
			switchToDefault();
			logg.log(Status.PASS, "Successfully switched to default content");
			
		} catch (Exception e) {
			String screenshot=UtilMethods.captureScreenShot(driver, "Alert");
			logg.log(Status.FAIL, "Unable to switch to default content "+e.getMessage());
			logg.addScreenCaptureFromPath(screenshot);
		}
		
	}
	
	@Then("wait for \"(.*)\" seconds to synch page")
	public void waitForSeconds(String time) throws IOException {
		ExtentTest logg=null;
		try {
			logg= logger.createNode(new GherkinKeyword("Then"), 
					"wait for "+time+" seconds to synch page");
			waitTimeToSynch(time);;
			logg.log(Status.PASS, "wait for "+time+" seconds to synch page");
			String screenshot=UtilMethods.captureScreenShot(driver, "Alert");
			logg.addScreenCaptureFromPath(screenshot);
			
		} catch (Exception e) {
			String screenshot=UtilMethods.captureScreenShot(driver, "Alert");
			logg.log(Status.FAIL, "wait for seconds to synch page");
			logg.addScreenCaptureFromPath(screenshot);
		}
		
	}
	
	@And("User enters field \"(.*)\" as \"(.*)\" in text field and press enter")
	public void enterTextAndPressEnter(String fieldName, String value) throws IOException {
		ExtentTest logg=null;
		try {
			logg= logger.createNode(new GherkinKeyword("When"), "User enters "+value+" as "+fieldName+" in text field");
			String xpath = "//*[normalize-space(text())='" + fieldName + "']/following::input[1]";
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
			if(driver.findElement(By.xpath(xpath)).isDisplayed()) {
			driver.findElement(By.xpath(xpath)).clear();
			driver.findElement(By.xpath(xpath)).sendKeys(value, Keys.ENTER);
			logg.log(Status.PASS, "User sucessfuly entered: "+value+" in "+fieldName+" textbox");
			String screenshot=UtilMethods.captureScreenShot(driver, fieldName.replace(":", "TextBox"));
			logg.addScreenCaptureFromPath(screenshot);
			}else {
				String screenshot=UtilMethods.captureScreenShot(driver, fieldName.replace(":", "TextBox"));
				logg.log(Status.FAIL, fieldName+ "Element not found to enter "+value);
				logg.addScreenCaptureFromPath(screenshot);
			}
		} catch (Exception e) {
			String screenshot=UtilMethods.captureScreenShot(driver, fieldName.replace(":", "TextBox"));
			logg.log(Status.FAIL, fieldName+ "Element not found to enter "+value+" : "+e.getMessage());
			logg.addScreenCaptureFromPath(screenshot);
			e.printStackTrace();
		}
		
	}
*/
}


