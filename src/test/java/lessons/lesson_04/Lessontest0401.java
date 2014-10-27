package lessons.lesson_04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Objects;


public class Lessontest0401 {

    public static WebDriver driver;

    @DataProvider(name = "dataproviders")
    public Object[][] dataproviders(){
        return new Object[][] {
                new Object[] {"http://testng.org"},
                new Object[] {"http://ya.ru"},
                new Object[] {"http://google.com"},
                new Object[] {"http://terrasoft.ru"},
        };
    }

    @BeforeMethod
    public void initianalization(){
        driver = new HtmlUnitDriver();
        System.out.println("initianalization");
    }

    @Test(dataProvider = "dataproviders")
    public void sometest(String site){
        driver.get(site);
        System.out.println("onsite: " + site);
    }

    @AfterMethod
    public void finalization(){
        if (driver !=null) {
            driver.quit();
        }
        System.out.println("finalization");
    }
}
