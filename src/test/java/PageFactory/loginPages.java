package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import UtilityMethods.UtilMethods;

public  class loginPages extends UtilMethods {

	public  static WebElement searchText()  {
		return driver.findElement(By.name("q"));
	}
	
	public  static WebElement firstname()  {
		return driver.findElement(By.xpath("//input[@name=\"firstName\"]"));
	}
	
}
