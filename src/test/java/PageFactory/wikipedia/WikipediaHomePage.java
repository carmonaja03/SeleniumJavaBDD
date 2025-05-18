package PageFactory.wikipedia;

import PageFactory.common.BasePage;
import UtilityMethods.UtilMethods;
import com.StepDef.hooks.GlobalHooks;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;

public class WikipediaHomePage extends BasePage {
    static GlobalHooks hooks=new GlobalHooks();
    static String screenShotName = new Exception().getStackTrace()[0].getMethodName();

    private By searchTextBox = By.xpath("//input[@id='searchInput']");

    public void navigateToURL() throws ClassNotFoundException {
        ExtentTest logg=null;
        try {
        logger=extent.createTest(Scenario.class, hooks.getScenarioName()).createNode(Feature.class, GlobalHooks.featureName)
                .createNode(Scenario.class, hooks.getScenarioName());
        logg= logger.createNode(new GherkinKeyword("Given"), "I want to navigate to URL");
        navigateToPage();
        launchWikipediaPage();
        logg.log(Status.PASS, "Application launched successfully");
        System.out.println("screenshot name: "+screenShotName);
       } catch (Exception e) {

        logg.log(Status.FAIL, "Not able to launch browser: "+e.getMessage());
        e.printStackTrace();
     }
    }

    public void inputTextOnSearchBox(String text) throws ClassNotFoundException, IOException {
        ExtentTest logg = null;
        logg = logger.createNode(new GherkinKeyword("When"), "inputs text");
        if (driver.findElement(searchTextBox).isDisplayed()) {
            driver.findElement(searchTextBox).sendKeys(text);
            driver.findElement(searchTextBox).sendKeys(Keys.ENTER);
            logg.log(Status.PASS, "Test pass");
            String screenshot = UtilMethods.captureScreenShot(driver, "pass");
            logg.addScreenCaptureFromPath(screenshot);

        } else {
            String screenshot = UtilMethods.captureScreenShot(driver, "fail");
            logg.log(Status.FAIL, "test failed");
            logg.addScreenCaptureFromPath(screenshot);
        }
    }

}
