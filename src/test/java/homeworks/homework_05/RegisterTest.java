package homeworks.homework_05;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterTest {
    MainPage mainPage;
    RegisterPage registerPage;

    @BeforeMethod
    public void setup(){
        mainPage = new MainPage();
        registerPage = mainPage.openRegisterForm();
    }

    @AfterMethod
    public void tearDown(){

    }

    @Test(dataProvider = "userData")
    public void LoginWirthpasswordTest(String email, String userName, String password, String confirmPassword){
        try {
            registerPage.register(email,userName, password, confirmPassword);
        } catch (Exception e) {
            Assert.assertFalse(false);
        }
    }

    @Test
    public void LoginWithVkontakteTest(){
        try {
            registerPage.EnterWithVkontekte();
        } catch (Exception e) {
            Assert.assertFalse(false);
        }
    }

    @Test
    public void LoginWithFaceBookTest(){
        try {
            registerPage.EnterWithFacebook();
        } catch (Exception e) {
            Assert.assertFalse(false);
        }
    }

    @Test
    public void LoginWithGooglePlusTest(){
        try {
            registerPage.EnterWithGooglePlus();
        } catch (Exception e) {
            Assert.assertFalse(false);
        }
    }

    @Test
    public void LoginWithTwitterTest(){
        try {
            registerPage.EnterWithTwitter();
        } catch (Exception e) {
            Assert.assertFalse(false);
        }
    }


    @DataProvider(name = "userData")
    public Object[][] userData(){
        return new Object[][]{
                new Object[]{"email", "userName", "password", "confirmPassword"}
        };
    }
}
