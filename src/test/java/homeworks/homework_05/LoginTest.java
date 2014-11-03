package homeworks.homework_05;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {
    MainPage mainPage;
    LoginForm loginForm;

    @BeforeMethod
    public void setup(){
        mainPage = new MainPage();
        loginForm = mainPage.EnterOnSite();
    }

    @AfterMethod
    public void tearDown(){

    }

    @Test(dataProvider = "userData")
    public void LoginWirthpasswordTest(String login, String password){
        try {
            loginForm.EnterWithPassword(login, password);
        } catch (Exception e) {
            Assert.assertFalse(false);
        }
    }

    @Test
    public void LoginWithVkontakteTest(){
        try {
            loginForm.EnterWithVkontekte();
        } catch (Exception e) {
            Assert.assertFalse(false);
        }
    }

    @Test
    public void LoginWithFaceBookTest(){
        try {
            loginForm.EnterWithFacebook();
        } catch (Exception e) {
            Assert.assertFalse(false);
        }
    }

    @Test
    public void LoginWithGooglePlusTest(){
        try {
            loginForm.EnterWithGooglePlus();
        } catch (Exception e) {
            Assert.assertFalse(false);
        }
    }

    @Test
    public void LoginWithTwitterTest(){
        try {
            loginForm.EnterWithTwitter();
        } catch (Exception e) {
            Assert.assertFalse(false);
        }
    }


    @DataProvider(name = "userData")
    public Object[][] userData(){
        return new Object[][]{
                new Object[]{"Login", "Password"}
        };
    }
}
