//package com.StepDef;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//import com.webdriverManager.DriverManager;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
//
//public class DemoQATextBox {
//public static WebDriver driver=Hooks.driver;
//	@Given("^I launch DemoQA website$")
//	public void launchApplication() {
//		
//		driver.get("https://demo.guru99.com/test/login.html");
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		System.out.println("Application launched");
//	}
//
//	@When("^i enter user name$")
//	public void enteringText() {
//		driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys("Testing");
//		
//	}
//	
//	
//	@When("^i enter \"(.*)\" as Full name$")
//	public void enterInput(String str) {
//		driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys(str);
//		
//		
//		
//	}
//	
//	@And("^i enter \"(.*)\" as email$")
//	public void email(String email) {
//		driver.findElement(By.id("userEmail")).sendKeys(email);
//		
//	}
//	
//
//
//}
