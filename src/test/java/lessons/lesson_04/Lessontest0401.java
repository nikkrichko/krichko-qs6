package lessons.lesson_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Lessontest0401 {

    public static WebDriver driver;

    @DataProvider
    public Object[][] dataProviders(){
        return new Object[][] {
                new Object[] {"http://testng.org/doc/index.html", "TestNG"},
                new Object[] {"http://ya.ru", "найти"},
                new Object[] {"http://google.com", "найти"},
                new Object[] {"http://terrasoft.ru", "bpmonline"},
        };
    }

    @BeforeMethod
    public void initianalization(){
        driver = new HtmlUnitDriver();
        System.out.println("initianalization");
    }

    @Test(dataProvider = "dataProviders")
    public void sometest(String Url, String text){
        driver.get(Url);
        Assert.assertTrue(driver.findElements(By.linkText(text)).size() != 1);
        System.out.println("onsite: " + Url + " have  - " + text);
    }



    @AfterMethod
    public void finalization(){
        if (driver !=null) {
            driver.quit();
        }
        System.out.println("finalization");
    }
}
