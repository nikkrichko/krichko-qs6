package hotlineTest.functionalTest;

import hotlineTest.HotlinePages.GoodsPage;
import hotlineTest.HotlinePages.MainPage;
import hotlineTest.utils.Log4Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by bionic on 11/5/14.
 */
public class FindProduct extends FunctionalTest {

    WebDriver webDriver;
    MainPage mainPage;
    GoodsPage goodsPage;
    String product = "iPhone";
    String noneProduct = "yablophone";

    @BeforeClass
    public void initDriver() {
        webDriver = FunctionalTest.webDriver;
        Log4Test.info("###start test " + getClass().getName());
    }



    @BeforeMethod
    public void setup() {
        mainPage = new MainPage(webDriver);
    }

    @Test
    public void findProduct() {
        Log4Test.info("positive findProduct " + product);
        mainPage.getMainPage();
        mainPage.serchProduct(product);
        goodsPage = new GoodsPage(webDriver);
        Assert.assertTrue(goodsPage.getGoods(product).isDisplayed());
        Log4Test.info("SUCCESS");
    }

    @Test
    public void findProductNegative() {
        Log4Test.info("negative findProduct " + noneProduct);
        mainPage.getMainPage();
        mainPage.serchProduct(noneProduct);
        goodsPage = new GoodsPage(webDriver);
//        Assert.assertTrue(goodsPage.getNoGoods(noneProduct));
        Assert.assertFalse(goodsPage.isElementPresent(noneProduct));
        Log4Test.info("SUCCESS");
    }
}
