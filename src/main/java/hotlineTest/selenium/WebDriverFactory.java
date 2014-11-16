package hotlineTest.selenium;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;

public class WebDriverFactory {
    public static final String FIREFOX = "firefox";
    public static final String HTML_UNIT = "htmlunit";

    public static WebDriverWraper initDriver(String driverName){
        WebDriverWraper driverWraper = null;
        if(driverName.equals(FIREFOX)){
            driverWraper =  new WebDriverWraper(new FirefoxDriver());
        }
        else if (driverName.equals(HTML_UNIT)){
            driverWraper = new WebDriverWraper(new HtmlUnitDriver());
        }else {
            Assert.fail("invalid driver configuration");

        }
        return driverWraper;
    }
}
