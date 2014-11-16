package hotlineTest.functionalTest;

import hotlineTest.HotlinePages.GoodsPage;
import hotlineTest.HotlinePages.MainPage;
import hotlineTest.utils.Log4Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by никита on 16.11.2014.
 */
public class CompareRefrigerator extends FunctionalTest {
    WebDriver webDriver;
    MainPage mainPage;
    GoodsPage goodsPage;

    @BeforeClass
    public void initDriver() {
        webDriver = FunctionalTest.webDriver.getOriginalDriver();
        Log4Test.info("###start test " + getClass().getName());
    }

    @BeforeMethod
    public void setup() {
        mainPage = new MainPage(webDriver);
    }

    @Test(priority = 5)
    public void comprateTwoPrices(){
        mainPage.getMainPage();

        mainPage.closeOtherElements();
        mainPage.choseCategory(mainPage.getBt());
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        mainPage.pressRefrigeratorLink();
        goodsPage = new GoodsPage(webDriver);

        webDriver.findElement(By.className("op_all")).click();
        moveMouseDown();

        ((JavascriptExecutor)webDriver).executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);",
                webDriver.findElement(By.className("jspPane")), "style", "padding: 0px 20px 0px 0px; width: 185px; top: -688px;");



        webDriver.findElement(By.xpath("//*[@id='filters']//a[contains(text(),'West')]")).click();

        Assert.assertTrue(true);

    }

    public void moveMouseDown()    {
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        robot.setAutoDelay(900);
        robot.mouseWheel(-10);
    }

}
