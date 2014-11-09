package hotlineTest.functionalTest;

import hotlineTest.HotlinePages.MainPage;
import hotlineTest.HotlinePages.RegisterPage;
import hotlineTest.HotlinePages.User;
import hotlineTest.HotlinePages.WelcomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Register extends FunctionalTest {
    WebDriver webDriver;
    MainPage mainPage;
    RegisterPage registerPage;
    WelcomePage welcomePage;
    User user;


    @BeforeClass
    public void initBrowser() {
        webDriver = FunctionalTest.webDriver;
        user = new User();
    }

    @AfterClass
    public void closeBrowser() {
    }

    @BeforeMethod
    public void setup() {
        mainPage = new MainPage(webDriver);
    }

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
        mainPage.pressRegisterLink();
        registerPage = new RegisterPage(user, webDriver);
        registerPage.register();
        Assert.assertTrue(registerPage.getProof().isDisplayed());
    }

}
