package com.webdriverManager;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	
	private static WebDriver driver;
	
//	public static WebDriver getDriver() {
//		return driver;
//	}

	

	public static WebDriver getDriver() {
		if(driver==null) {
			WebDriverManager.chromedriver().setup();
			WebDriverManager.edgedriver().setup();
			String downloadFilepath = System.getProperty("user.dir")+"\\src\\TestScenarios";
			HashMap<String, Object> browserPref = new HashMap<String, Object>();
			browserPref.put("profile.default_content_settings.popups", 0);
			browserPref.put("download.default_directory", downloadFilepath);
			EdgeOptions options = new EdgeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.NONE);
			options.setExperimentalOption("prefs", browserPref);
//			options.addArguments("-inprivate");
			options.addArguments("--remote-allow-origins=*");
			options.setExperimentalOption("prefs", browserPref);
			options.addArguments("--disable-infobars");
			options.addArguments("force-device-scale-factor=1");
			driver = new EdgeDriver(options);
			driver.manage().window().maximize();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		return driver;
		
	}
	
	

}
