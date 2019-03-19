import Pages.*;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import helpers.ScreenShots;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public abstract class Oblig1BaseTest {
    private String url = "https://itera-qa.azurewebsites.net/";
    protected WebDriver driver;
    protected static ExtentReports report;
    protected static ExtentTest test;

    protected IteraBasePage iteraBasePage;
    protected IteraHomePage iteraHomePage;
    protected IteraRegisterUserPage iteraRegisterUserPage;
    protected IteraLoginPage iteraLoginPage;
    protected IteraDashboardPage iteraDashboardPage;
    protected IteraCreateNewCustomerPage iteraCreateNewCustomerPage;
    protected IteraEditCustomerPage iteraEditCustomerPage;
    protected IteraConfirmDeletePage iteraConfirmDeletePage;

    abstract String getTestNumber();

    @BeforeTest
    public void init() {
        driver = new ChromeDriver();


        /**
         * Test report will be generated to below path
         * This path (C:\\Reports\\IN3240\\Task1.html) for Windows.
         * For Mac/Linux you need to change path
         */
        report = new ExtentReports("C:\\Reports\\IN3240\\Task" + getTestNumber() + ".html");

        test = report.startTest("Task" + getTestNumber());
        test.log(LogStatus.INFO, "Browser started");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to(url);

        iteraBasePage = new IteraBasePage(driver);
        iteraHomePage = new IteraHomePage(driver);
        iteraRegisterUserPage = new IteraRegisterUserPage(driver);
        iteraLoginPage = new IteraLoginPage(driver);
        iteraDashboardPage = new IteraDashboardPage(driver);
        iteraCreateNewCustomerPage = new IteraCreateNewCustomerPage(driver);
        iteraEditCustomerPage = new IteraEditCustomerPage(driver);
        iteraConfirmDeletePage = new IteraConfirmDeletePage(driver);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
        report.flush();
    }


    //Take a screenShots if test fail
    @AfterMethod
    public void tearDown(ITestResult testResult) throws IOException {
        if (testResult.getStatus() == ITestResult.FAILURE) {
            String path = ScreenShots.takeScreenshot(driver, testResult.getName());
            String imagePath = test.addScreenCapture(path);
            test.log(LogStatus.FAIL, "TASK " + getTestNumber() + " - FAILED", imagePath);
        }
    }

    //Take a screenShots if test pass
    @AfterMethod
    public void Summary(ITestResult summary) throws IOException {
        if (summary.getStatus() == ITestResult.SUCCESS) {
            String path = ScreenShots.takeScreenshot(driver, summary.getName());
            String imagePath = test.addScreenCapture(path);
            test.log(LogStatus.PASS, "TASK " + getTestNumber() + " PASSED", imagePath);
        }
    }

    public void waitForElementToEqual(final By locator, String value) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, value));
    }

    public void waitForUrlToEqual(String url) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlToBe(url));
    }
}
