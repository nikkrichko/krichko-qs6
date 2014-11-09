package hotlineTest.functionalTest;

import hotlineTest.HotlinePages.GoodsPage;
import hotlineTest.HotlinePages.MainPage;
import hotlineTest.HotlinePages.ProductPage;
import hotlineTest.utils.Log4Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by никита on 09.11.2014.
 */
public class ProductPrice extends FunctionalTest{
    WebDriver webDriver;
    String product = "iPhone";
    MainPage mainPage;
    GoodsPage goodsPage;
    ProductPage productPage;

    @BeforeClass
    public void initDriver(){
        webDriver = FunctionalTest.webDriver;
        mainPage = new MainPage(webDriver);
        Log4Test.info("start test " + getClass().getName());
    }

    @BeforeMethod
    public void initTest(){
        mainPage.getMainPage();
        mainPage.serchProduct(product);
    }

    @Test
    public void OneThanOnePrice(){
        Log4Test.info("positive check that one than one price");
        goodsPage = new GoodsPage(webDriver);
        goodsPage.productPrice();
        productPage = new ProductPage(webDriver);
        Assert.assertTrue(productPage.isMoreThanOnePrice());
    }
}
