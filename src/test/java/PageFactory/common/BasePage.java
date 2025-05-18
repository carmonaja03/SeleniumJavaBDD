package PageFactory.common;

import UtilityMethods.UtilMethods;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;

public class BasePage extends UtilMethods {



    public static WebDriver navigateToPage() {
        String browserName = init_properties().getProperty("browser");
        if (browserName.equalsIgnoreCase("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            WebDriverManager.edgedriver().setup();
            String downloadFilepath = System.getProperty("user.dir")+"/src/TestScenarios";
            HashMap<String, Object> edgePref = new HashMap<String, Object>();
            edgePref.put("profile.default_content_settings.popups", 0);
            edgePref.put("download.default_directory", downloadFilepath);
            ChromeOptions options = new ChromeOptions();
            options.setPageLoadStrategy(PageLoadStrategy.NONE);
            options.setExperimentalOption("prefs", edgePref);
//			options.addArguments("incognito");
            options.addArguments("--remote-allow-origins=*");
            options.setExperimentalOption("prefs", edgePref);
            options.addArguments("--disable-infobars");
            options.addArguments("force-device-scale-factor=1");
            driver = new ChromeDriver(options);
        } else if (browserName.equalsIgnoreCase("IE")) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        } else if (browserName.equalsIgnoreCase("EDGE")) {
            WebDriverManager.edgedriver().setup();
            String downloadFilepath = System.getProperty("user.dir")+"/src/TestScenarios";
            HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
            chromePrefs.put("profile.default_content_settings.popups", 0);
            chromePrefs.put("download.default_directory", downloadFilepath);
            EdgeOptions options = new EdgeOptions();
            options.setPageLoadStrategy(PageLoadStrategy.NONE);
            options.setExperimentalOption("prefs", chromePrefs);
//			options.addArguments("-inprivate");
            options.addArguments("--remote-allow-origins=*");
            options.setExperimentalOption("prefs", chromePrefs);
            options.addArguments("--disable-infobars");
            options.addArguments("force-device-scale-factor=1");
            driver = new EdgeDriver(options);
        }
        driver.manage().window().maximize();
        return driver;
    }

    public static void launchWikipediaPage() {
        driver.get(init_properties().getProperty("wikiURL"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
    }
}
