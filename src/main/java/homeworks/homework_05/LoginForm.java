package homeworks.homework_05;

public class LoginForm extends LoginRegisterPage{

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
