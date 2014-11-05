package homeworks.homework_06;

import lessons.FunctionalTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class RegisterTest  {
    WebDriver webDriver;
    MainPage mainPage;
    RegisterPage registerPage;
    WelcomePage welcomePage;
    User user;




    @BeforeClass
    public  void startBrowser(){
        webDriver = new FirefoxDriver();
        user = new User();
    }

    @AfterClass
    public void closeBrowser(){
        webDriver.quit();
    }

    @BeforeMethod
    public void setup(){
        mainPage = new MainPage(webDriver);
    }

//    @AfterMethod
//    public void theEnd(){
//        webDriver.close();
//    }

    @Test (priority=1)
    public void reisterTest(){

        mainPage.getMainPage();
        mainPage.pressRegisterLink();
        registerPage = new RegisterPage(user, webDriver);
        registerPage.register();
        welcomePage = new WelcomePage(webDriver);
        Assert.assertTrue(welcomePage.WELCOME_PAGE_FIRST_NAME.isDisplayed());
        Assert.assertTrue(welcomePage.WELCOME_PAGE_SECOND_NAME.isDisplayed());
    }

    @Test (priority=2)
    public void doubleRegister(){

        mainPage.getMainPage();
        webDriver.navigate().refresh();
        mainPage.pressRegisterLink();
        registerPage = new RegisterPage(user, webDriver);
        registerPage.register();
        Assert.assertTrue(registerPage.getProof().isDisplayed());
    }

}
