//package com.StepDef;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.PageFactory;
//
//import cucumber.api.java.en.When;
//
//public class HomePage {
//	 WebDriver driver;
//	Hooks hook;
//	public HomePage(WebDriver driver) {
//        super();
//        hook=new Hooks();
//        driver=hook.getDriver();
//    }
//	    
//
//	    public void gotoGoogleHomePage() {
//	    	hook.getDriver().get("https://demoqa.com/text-box");
//	    	hook.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//	    }
//	    
//	    public void enteringText() {
//	    	hook.getDriver().findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys("Testing");
//			
//		}
//	    
//	   
//		public void enterInput(String str) {
//			hook.getDriver().findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys(str);
//			
//		}
//		
//		public void email(String email) {
//			hook.getDriver().findElement(By.id("userEmail")).sendKeys(email);
//		}
//
//}
