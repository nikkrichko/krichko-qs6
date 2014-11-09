package hotlineTest.functionalTest;

import hotlineTest.utils.Log4Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * Created by bionic on 11/5/14.
 */
public class FunctionalTest {

    public static WebDriver webDriver;

    @BeforeSuite
    public static void startBrowser(){
        Log4Test.info("browser start");
        webDriver = new FirefoxDriver();

    }

    @AfterSuite
    public static void closeDriver(){
        Log4Test.info("browser close");
        webDriver.quit();
    }
}
