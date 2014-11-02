package homeworks.homework_05;

public class RegisterPage extends LoginRegisterPage {

    public void register(String email, String userName, String password, String confirmPassword){
        enterEmail(email);
        enterUsername(userName);
        enterPassword(password);
        confirmPassword(confirmPassword);
        pressRegister();
    }

    public boolean showPassword(){
        return false;
    }

    private void enterEmail(String UserName){

    }

    private void confirmPassword(String Password){

    }

    private void pressRegister(){

    }
}
