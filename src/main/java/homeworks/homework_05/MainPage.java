package homeworks.homework_05;

public class MainPage {
    public LoginForm EnterOnSite(){
        return new LoginForm();
    }

    public static RegisterPage openRegisterForm(){
        return new RegisterPage();
    }
}
