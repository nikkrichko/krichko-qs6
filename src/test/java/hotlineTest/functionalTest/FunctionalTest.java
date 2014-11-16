package hotlineTest.functionalTest;

import hotlineTest.selenium.WebDriverFactory;
import hotlineTest.selenium.WebDriverWraper;
import hotlineTest.utils.Log4Test;
import hotlineTest.utils.PropertyLoader;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * Created by bionic on 11/5/14.
 */
public class FunctionalTest {


    public static WebDriverWraper webDriver;
//    public static WebDriver webDriver;
    @BeforeSuite
    public static void startBrowser(){

        Log4Test.info("browser start");
        Log4Test.info("*************");
        webDriver = WebDriverFactory.initDriver(PropertyLoader.loadProperty("browser.name"));
//        webDriver = new FirefoxDriver();
    }

    @AfterSuite
    public static void closeDriver(){
        Log4Test.info("*************");
        Log4Test.info("browser close");
        webDriver.quit();
    }
}
