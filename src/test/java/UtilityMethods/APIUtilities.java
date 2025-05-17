package UtilityMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
//import com.relevantcodes.extentreports.ExtentTest;

import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;
import microsoft.exchange.webservices.data.core.ExchangeService;
import microsoft.exchange.webservices.data.core.service.item.EmailMessage;
import microsoft.exchange.webservices.data.credential.ExchangeCredentials;
import microsoft.exchange.webservices.data.credential.WebCredentials;
import microsoft.exchange.webservices.data.property.complex.EmailAddress;
import microsoft.exchange.webservices.data.property.complex.MessageBody;

public class APIUtilities {

    public static WebDriver driver;
    public static String parentWindow = null;
    //	public ExtentTest logger;
    public String screenShotName = "Screenshots";
    public static Properties prop;

    // ****************************************
    public static ExtentHtmlReporter report;
    public static ExtentReports extent;
    public static ExtentTest logger;
//	static WebDriverWait wait = new WebDriverWait(driver, 20);
    // ****************************************

    public static WebDriver openbrowser(String browserName) {
        if (browserName.equalsIgnoreCase("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("IE")) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        } else if (browserName.equalsIgnoreCase("EDGE")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        return driver;
    }

    public static WebDriver openBrowser() {
        String browserName = init_properties().getProperty("browser");
        if (browserName.equalsIgnoreCase("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("IE")) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        } else if (browserName.equalsIgnoreCase("EDGE")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        return driver;
    }

    public static void enterUrl(String val) {
        driver.get(val);
    }

    public static void LaunchApp() {
        driver.get(init_properties().getProperty("url"));
    }

    public static void quit() {
        driver.close();
        driver.quit();
    }

    public static void waitTime(int time) throws InterruptedException {
        Thread.sleep(time);
    }

    public static void waitTimeToSynch(String time) throws InterruptedException {
        Thread.sleep(Integer.parseInt(time));
    }

    public static void enterText(String label, String val) {
        try {
            String xpath = "//*[normalize-space(text())='" + label + "']/following::input[1]";
            WebDriverWait wait1 = new WebDriverWait(driver, 20);
            wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            driver.findElement(By.xpath(xpath)).clear();
            driver.findElement(By.xpath(xpath)).sendKeys(val);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }

    public static void selectValueFromDropdown(String val, String label) {
        String xpath = "//*[normalize-space(text())='" + label + "']/following::select[1]";
        WebDriverWait wait1 = new WebDriverWait(driver, 20);
        wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        Select sel = new Select(driver.findElement(By.xpath(xpath)));
        sel.selectByVisibleText(val);
    }

    public static void clickOnLabel(String labels) {
        String xpath = "//*[normalize-space(text())='" + labels + "']|//*[@name='" + labels + "']";
        WebDriverWait wait1 = new WebDriverWait(driver, 20);
        wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        WebElement element = driver.findElement(By.xpath(xpath));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    public void enteringTextAsPerHeaderAndVal(DataTable data) throws IOException {
        ExtentTest logg = null;
        String textField = "";
        String value = "";
        try {

            logg = logger.createNode(new GherkinKeyword("And"),
                    "Enter values and in text field as per below header and value");
            List<Map<String, String>> list = data.asMaps(String.class, String.class);
            for (Map<String, String> map : list) {
                Set<String> mp = map.keySet();
                Iterator<String> it = mp.iterator();
                while (it.hasNext()) {
                    textField = it.next();
                    value = map.get(textField);
                    String xpath = "//*[normalize-space(text())='" + textField + "']/following::input[1]";
                    WebDriverWait wait1 = new WebDriverWait(driver, 20);
                    wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
                    driver.findElement(By.xpath(xpath)).clear();
                    driver.findElement(By.xpath(xpath)).sendKeys(value);
                    logg.log(Status.PASS, "User sucessfuly entered: " + value + " in " + textField + " textbox");

                }

            }
        } catch (Exception e) {
            String screenshot = UtilMethods.captureScreenShot(driver, textField.replace(":", ""));
            logg.log(Status.FAIL, textField + "Element not found to enter " + value + " : " + e.getMessage());
            logg.addScreenCaptureFromPath(screenshot);
        }

    }

    public static void scrollToViewAndClick(String label) {
        String xpath = "//*[normalize-space(text())='" + label + "']|//*[@name='" + label + "']";
        WebDriverWait wait1 = new WebDriverWait(driver, 20);
        wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        WebElement element = driver.findElement(By.xpath(xpath));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
        js.executeScript("arguments[0].click();", element);
    }

    public static void explicitWait(WebElement elementLocation) {
        WebDriverWait wait1 = new WebDriverWait(driver, 20);
        wait1.until(ExpectedConditions.visibilityOf(elementLocation));
    }

    public static void webelementlist(List<WebElement> element, String value) {
        List<WebElement> elementList = element;
        for (int j = 0; j < elementList.size(); j++)
            if (elementList.get(j).getText().contains(value)) {
                elementList.get(j).click();
            }
    }

    public static void switchWindow() {
        parentWindow = driver.getWindowHandle();
        System.out.println("parentWindow" + parentWindow);
        for (String handle : driver.getWindowHandles()) {

            driver.switchTo().window(handle);
        }
    }

    public void openNewWindow(String newUrl) {
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to(newUrl);
    }

    public void loacateRightOftheObjext() {
        WebElement element = driver.findElement(RelativeLocator.with(By.xpath("//input")).toRightOf(By.xpath("//span[1]")));
        element.click();

    }

    public void loacateLeftOftheObjext() {
        WebElement element = driver.findElement(RelativeLocator.with(By.xpath("//input")).toLeftOf(By.xpath("//span[1]")));
        element.click();

    }

    public void loacateAbovetheObjext(String label1, String label2) {
        WebElement ele1=driver.findElement(By.xpath("//*[normalize-space(text())='" + label1 + "']"));
        WebElement element = driver.findElement(RelativeLocator.with(By.xpath("//*[normalize-space(text())='" + label2 + "']")).above(ele1));
        element.click();

    }

    public static void switchDefaultWindow() {
        System.out.println("parentWindow" + parentWindow);
        driver.switchTo().window(parentWindow);
    }

    public static void getText(WebElement element) {
        String ActualValue = element.getText().toString().trim();
        System.out.println(ActualValue);

    }

    public static void selectDropdownByValue(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
    }

    public static void selectDropdownByIndex(WebElement element, String index) {
        Select select = new Select(element);
        select.selectByIndex(Integer.parseInt(index));
    }

    public static void alertAccept() {
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void alertDismiss() {
        try {
            Alert alert = driver.switchTo().alert();
            alert.dismiss();

        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    public static void JSClick(WebElement element) {
        try {
            if (element.isEnabled() && element.isDisplayed()) {
                System.out.println("Clicking on element with using java script click");

                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);

            } else {
                System.out.println("Unable to click on element");
            }
        } catch (StaleElementReferenceException e) {
            System.out.println("Element is not attached to the page document " + e.getStackTrace());
        } catch (NoSuchElementException e) {
            System.out.println("Element was not found in DOM " + e.getStackTrace());
        } catch (Exception e) {
            System.out.println("Unable to click on element " + e.getStackTrace());
        }
    }

    public static void switchFrameBy0() {
        try {
            driver.switchTo().frame(0);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    public static void switchFrameByName(String frameName) {
        try {
            driver.switchTo().frame(frameName);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    public static void switchFrame(WebElement element) {
        try {
            driver.switchTo().frame(element);

        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    public static void switchToDefault() {
        try {
            driver.switchTo().defaultContent();

        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    public static void scrollByCoordinates(WebElement element) {
        try {
            Point point = element.getLocation();

            int x_coordinate = point.getX();

            int y_coordinate = point.getY();

            JavascriptExecutor javScriptExecutor = (JavascriptExecutor) driver;

            javScriptExecutor.executeScript("window.scrollBy(" + x_coordinate + ", " + y_coordinate + ");");

        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    public static void mouseHover(WebElement element) {
        try {
            Actions act = new Actions(driver);
            act.moveToElement(element).build().perform();

        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }

    }

    public static void mouseHoverClick(WebElement element) {
        try {
            Actions act = new Actions(driver);
            act.moveToElement(element).click().build().perform();

        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    public static void elementPresent(WebElement element) {
        boolean isDisplayed = true;
        try {
            isDisplayed = element.isDisplayed();
        }

        catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    public static String timestamp() {
        return new SimpleDateFormat("MMddYYYYHHMMSS").format(new Date());
    }

    public static String captureScreenShot(WebDriver driver, String fileName) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        // take screenshot and store it as file
        File src = ts.getScreenshotAs(OutputType.FILE);

        // copy screenshot and desired location - FileUtils
        String dest = System.getProperty("user.dir") + "\\target\\Screenshots\\" + fileName + "_" + timestamp()
                + ".png";
//		String dest = System.getProperty("user.dir") + "\\src\\test\\resources\\Screenshots" + "\\" + fileName + "_"
//				+ timestamp() + ".png";
        FileUtils.copyFile(src, new File(dest));

        return dest;
    }

    public static void scrollToElement(WebElement element) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);

        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    public static void verifyText(WebElement element, String ExpectedValue) {
        String ActualValue = element.getText().toString().trim();
        if (ActualValue.equals(ExpectedValue)) {
            System.out.println("The value is same and verified");
        } else {
            System.out.println("The value is not  same and not equal");
        }

    }

    public static void clickEnter(WebElement we) {
        we.sendKeys(Keys.ENTER);
    }

    public static void enterText(WebElement element, String val) {
        element.sendKeys(val);
    }

    public static void click(WebElement element) {
        element.click();
    }

    public static void clear(WebElement element) {
        element.clear();
    }

    public static void tab(WebElement element) {
        element.sendKeys(Keys.TAB);
    }

    public static void keyup(WebElement element) {
        element.sendKeys(Keys.ARROW_UP);
    }

    public static void keydown(WebElement element) {
        element.sendKeys(Keys.ARROW_DOWN);
    }

    public static void keyleft(WebElement element) {
        element.sendKeys(Keys.ARROW_LEFT);
    }

    public static void keyright(WebElement element) {
        element.sendKeys(Keys.ARROW_RIGHT);
    }

    public static void scrollBottomPage() {
        JavascriptExecutor jsd = (JavascriptExecutor) driver;
        jsd.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public static void scrollTopPage() {
        JavascriptExecutor jst = (JavascriptExecutor) driver;
        jst.executeScript("window.scrollTo(document.body.scrollHeight,0)");
    }

    public static void scrollDown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-1000)", "");
    }

    public static void scrollUp() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1000)", "");
    }

    public static void close() {
        driver.close();
    }

    public static ExtentReports extentReportSetup() {

        UtilMethods util = new UtilMethods();
        String timestamp = new Timestamp(System.currentTimeMillis()).toString();
        timestamp = timestamp.substring(0, timestamp.length() - 6).replace(":", "");
        if (extent != null) {
            return extent;
        }
        System.out.println(
                System.getProperty("user.dir") + "\\src\\test\\resources\\Reports\\ExtentReport" + timestamp + ".html");
//		report = new ExtentHtmlReporter(
//				System.getProperty("user.dir") + "\\src\\test\\resources\\Reports\\ExtentReport" + timestamp + ".html");
        report = new ExtentHtmlReporter(
                System.getProperty("user.dir") + "\\target\\ExtentReport" + timestamp + ".html");
        report.config().setDocumentTitle("Application Report");
//		String env=
        String browser = util.init_properties().getProperty("browser");
        report.config().setReportName("CRMBDD_" + "browser");
        report.config().setTheme(Theme.DARK);
        report.config().setTimeStampFormat("MMM dd, yyyy hh:mm:ss");
        report.config().enableTimeline(true);
        report.start();
        extent = new ExtentReports();
        extent.attachReporter(report);

        return extent;
    }

    /*
     * Method to read key value pairs from property file
     */
    public static Properties init_properties() {

        prop = new Properties();
        try {

            File src = new File(
                    System.getProperty("user.dir") + "/src/test/java/com/utility/resources/Config.property");
            FileInputStream fs = new FileInputStream(src);

            prop.load(fs);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return prop;
    }

    /*
     * Method to trigger email with test report(extent report/excel report) as an
     * attachment through ESO mailbox
     */
    public static void sendEmail(String Subject, String Env, String Info) throws Exception {
        String username = "XXXX";
        String password = "XXX";
        String path = System.getProperty("user.dir") + "\\target\\ExtentReports\\ExtentReport.html";

        ExchangeService service = new ExchangeService();
        ExchangeCredentials credentials = new WebCredentials(username, password);
        service.setCredentials(credentials);
        java.net.URI uri = new java.net.URI("https://myemail.accenture.com/ews/exchange.asmx");
        service.setUrl(uri);
        try {
            EmailMessage replymessage = new EmailMessage(service);
            EmailAddress fromEmailAddress = new EmailAddress(username);
            replymessage.setFrom(fromEmailAddress);
            replymessage.getToRecipients().add("XXXX@accenture.com");
            replymessage.setSubject(Subject);
            replymessage.setBody(new MessageBody(
                    "<h2>Test Automation Execution Details :" + Info + "</h2>\r\n" + "<ul>Execution Environment Name : "
                            + "<b>" + Env + "</b>" + " </ul><p>Test Execution Report is Enclosed</p>"));

            replymessage.getAttachments().addFileAttachment(path);
            replymessage.send();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
