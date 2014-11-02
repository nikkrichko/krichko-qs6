package homeworks.homework_05;

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
        registerPage.register(email,userName, password, confirmPassword);
    }

    @Test
    public void LoginWithVkontakteTest(){
        registerPage.EnterWithVkontekte();
    }

    @Test
    public void LoginWithFaceBookTest(){
        registerPage.EnterWithFacebook();
    }

    @Test
    public void LoginWithGooglePlusTest(){
        registerPage.EnterWithGooglePlus();
    }

    @Test
    public void LoginWithTwitterTest(){
        registerPage.EnterWithTwitter();
    }


    @DataProvider(name = "userData")
    public Object[][] userData(){
        return new Object[][]{
                new Object[]{"email", "userName", "password", "confirmPassword"}
        };
    }
}
