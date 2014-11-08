package hotlineTest.functionalTest;

import hotlineTest.HotlinePages.MainPage;
import hotlineTest.HotlinePages.RegisterPage;
import hotlineTest.HotlinePages.User;
import hotlineTest.HotlinePages.WelcomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Register {
    WebDriver webDriver;
    MainPage mainPage;
    RegisterPage registerPage;
    WelcomePage welcomePage;
    User user;


    @BeforeClass
    public void startBrowser() {
        webDriver = new FirefoxDriver();
        user = new User();
    }

    @AfterClass
    public void closeBrowser() {
        webDriver.quit();
    }

    @BeforeMethod
    public void setup() {
        mainPage = new MainPage(webDriver);
    }

//    @AfterMethod
//    public void theEnd(){
//        webDriver.close();
//    }

    @Test(priority = 1)
    public void reisterTest() {
        mainPage.getMainPage();
        mainPage.pressRegisterLink();
        registerPage = new RegisterPage(user, webDriver);
        registerPage.register();
        welcomePage = new WelcomePage(webDriver);
        Assert.assertTrue(welcomePage.WELCOME_PAGE_FIRST_NAME.isDisplayed());
        Assert.assertTrue(welcomePage.WELCOME_PAGE_SECOND_NAME.isDisplayed());
    }

    @Test(priority = 2)
    public void doubleRegister() {

        mainPage.getMainPage();
//        webDriver.navigate().refresh();
        mainPage.pressRegisterLink();
        registerPage = new RegisterPage(user, webDriver);
        registerPage.register();
        Assert.assertTrue(registerPage.getProof().isDisplayed());
    }

}
