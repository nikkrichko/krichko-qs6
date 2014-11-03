package homeworks.homework_05;

import org.openqa.selenium.WebDriver;

public class LoginForm extends LoginRegisterPage{

    public LoginForm(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebDriver webDriver;

    public void EnterWithPassword(String userName, String password){
        enterUsername(userName);
        enterPassword(password);
        pressEnter();
    }

    public void ForgotPassword(){

    }

    public RegisterPage OpenregisterForm(){
        return MainPage.openRegisterForm();
    }



    public void closeForm(){

    }


    private void pressEnter(){

    }

}
