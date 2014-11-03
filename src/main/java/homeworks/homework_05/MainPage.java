package homeworks.homework_05;

import org.openqa.selenium.WebDriver;

public class MainPage {

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebDriver webDriver;

    public LoginForm EnterOnSite(){
        return new LoginForm(webDriver);
    }

    public static RegisterPage openRegisterForm(){
        return new RegisterPage();
    }
}
