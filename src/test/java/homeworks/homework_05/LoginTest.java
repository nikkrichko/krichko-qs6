package homeworks.homework_05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {
    MainPage mainPage;
    LoginForm loginForm;
    public static WebDriver webdriver;

    @BeforeMethod
    public void setup(){
        webdriver = new FirefoxDriver();
//        mainPage = new MainPage();
//        loginForm = mainPage.EnterOnSite();
    }

    @AfterMethod
    public void tearDown(){
        webdriver.close();
    }

//    @Test(dataProvider = "userData")
//    public void LoginWirthpasswordTest(String login, String password){
//       loginForm.EnterWithPassword(login, password);
//        Assert.assertTrue(true);
//
//    }

//    @Test
//    public void LoginWithVkontakteTest(){
//        loginForm.EnterWithVkontekte();
//    }
//
//    @Test
//    public void LoginWithFaceBookTest(){
//        loginForm.EnterWithFacebook();
//    }
//
//    @Test
//    public void LoginWithGooglePlusTest(){
//        loginForm.EnterWithGooglePlus();
//    }
//
//    @Test
//    public void LoginWithTwitterTest(){
//        loginForm.EnterWithTwitter();
//    }


    @DataProvider(name = "userData")
    public Object[][] userData(){
        return new Object[][]{
                new Object[]{"Login", "Password"}
        };
    }
}
