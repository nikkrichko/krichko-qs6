package hotlineTest.functionalTest;

import hotlineTest.selenium.WebDriverFactory;
import hotlineTest.selenium.WebDriverWraper;
import hotlineTest.utils.Log4Test;
import hotlineTest.utils.PropertyLoader;
import hotlineTest.utils.ScreenShotMaker;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

/**
 * Created by bionic on 11/5/14.
 */
public class FunctionalTest {


    public static WebDriverWraper webDriver;
    public static ScreenShotMaker screenShotMaker;

    @BeforeSuite
    public static void startBrowser(){

        Log4Test.info("browser start");
        Log4Test.info("*************");
        webDriver = WebDriverFactory.initDriver(PropertyLoader.loadProperty("browser.name"));
        screenShotMaker = new ScreenShotMaker(webDriver);
        webDriver.manage().window().maximize();
    }

    @BeforeMethod
    public void logStartTest(){
        Log4Test.startTest(getClass());
    }

    @AfterMethod
    public void takeScreenShot(ITestResult result) {
        if (result.getStatus() == ITestResult.SUCCESS){
            Log4Test.info("SUCCESS");
        }
        if (result.getStatus() == ITestResult.FAILURE) {
            Log4Test.error("FAILED :" + getClass().getName().toString());
            System.out.println("Taking screenshot");
            screenShotMaker.takeScreenShot(getClass().getName().toString()+ " is failed");
        }
    }

    @AfterSuite
    public static void closeDriver(){
        Log4Test.info("*************");
        Log4Test.info("browser close");
        webDriver.quit();
    }
}
