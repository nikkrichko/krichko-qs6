package homeworks.homework_06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class RegisterTest {
    WebDriver webDriver;
    MainPage mainPage;
    RegisterPage registerPage;
    WelcomePage welcomePage;
    User user;

    @BeforeClass
    public void startBrowser(){
        webDriver = new FirefoxDriver();
        user = new User();
    }

    @AfterClass
    public void closeBrowser(){
        webDriver.close();


    }

    @BeforeMethod
    public void setup(){
        mainPage = new MainPage(webDriver);
        registerPage = new RegisterPage(user, webDriver);
        welcomePage = new WelcomePage(webDriver);
    }

    @AfterMethod
    public void theEnd(){
        webDriver.close();
    }

    @Test
    public void reisterTest(){
        mainPage.getMainPage();
        mainPage.pressRegisterLink();
        registerPage.register();
        Assert.assertTrue(welcomePage.WELCOME_PAGE_FIRST_NAME.isEnabled());
        Assert.assertTrue(welcomePage.WELCOME_PAGE_SECOND_NAME.isEnabled());
    }

    @Test
    public void doubleRegister(){
        mainPage.getMainPage();
        mainPage.pressRegisterLink();
        registerPage.register();
        Assert.assertTrue(registerPage.ERROR_PROFF.isEnabled());
    }

}
