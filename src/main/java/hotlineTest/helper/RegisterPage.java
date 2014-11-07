package hotlineTest.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
    private User user;
    private WebDriver webDriver;

    public WebElement EMAIL_FIELD;
    public WebElement USER_NAME_FIELD;
    public WebElement PASSWORD_FIELD;
    public WebElement CONFIRM_PASWORD_FIELD;
    public WebElement REGISTER_BUTTON;
    public WebElement ERROR_PROFF;

    public RegisterPage(User user, WebDriver webDriver) {
        this.user = user;
        this.webDriver = webDriver;
        initElements();
    }

   public void register(){
        EMAIL_FIELD.sendKeys(user.getUserEmail());
        USER_NAME_FIELD.sendKeys(user.getUserName());
        PASSWORD_FIELD.sendKeys(user.getPassword());
        CONFIRM_PASWORD_FIELD.sendKeys(user.getPassword());
        REGISTER_BUTTON.submit();
   }

    private void initElements(){
        EMAIL_FIELD =  webDriver.findElement(By.name("email"));
        USER_NAME_FIELD = webDriver.findElement(By.name("nick"));
        PASSWORD_FIELD = webDriver.findElement(By.name("password"));
        CONFIRM_PASWORD_FIELD = webDriver.findElement(By.name("password2"));
        REGISTER_BUTTON =  webDriver.findElement(By.className("line-form-button")).findElement(By.className("blue-button"));

    }

    public WebElement getProof(){
        return ERROR_PROFF = webDriver.findElement(By.name("email"));
    }


}
