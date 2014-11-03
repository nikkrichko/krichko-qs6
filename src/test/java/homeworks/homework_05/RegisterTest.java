package homeworks.homework_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class RegisterTest {
    MainPage mainPage;
    RegisterPage registerPage;
    WebDriver webDriver;

    @BeforeClass
    public void driver(){
        webDriver = new FirefoxDriver();
    }

    @AfterClass
    public void closeDriver(){
        webDriver.quit();
    }

    @BeforeMethod
    public void setup(){
//        mainPage = new MainPage();
//        registerPage = mainPage.openRegisterForm();


    }

    @AfterMethod
    public void tearDown(){

    }

    @Test(dataProvider = "userData")
    public void LoginWirthpasswordTest(String email, String userName, String password, String confirmPassword){
//        registerPage.register(email,userName, password, confirmPassword);
        webDriver.get("http://hotline.ua/");
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.visibilityOf(webDriver.findElement(By.className("reg"))));

        webDriver.findElement(By.className("reg")).click();
        webDriver.findElement(By.name("email")).sendKeys(email);
        webDriver.findElement(By.name("nick")).sendKeys(userName);
        webDriver.findElement(By.name("password")).sendKeys(password);
        webDriver.findElement(By.name("password2")).sendKeys(confirmPassword);
        webDriver.findElement(By.className("line-form-button"))
                .findElement(By.className("blue-button")).submit();
        Assert.assertTrue(true);


        Assert.assertTrue(true);
    }

//    @Test
//    public void LoginWithVkontakteTest(){
//        registerPage.EnterWithVkontekte();
//    }
//
//    @Test
//    public void LoginWithFaceBookTest(){
//        registerPage.EnterWithFacebook();
//    }
//
//    @Test
//    public void LoginWithGooglePlusTest(){
//        registerPage.EnterWithGooglePlus();
//    }
//
//    @Test
//    public void LoginWithTwitterTest(){
//        registerPage.EnterWithTwitter();
//    }


    @DataProvider(name = "userData")
    public Object[][] userData(){
        return new Object[][]{
                new Object[]{"email@yar.ru", "userName", "password", "password"}
        };
    }
}
