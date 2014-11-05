package homeworks.homework_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
    private User user;
    private WebDriver webDriver;

    public WebElement EMAIL_FIELD =  webDriver.findElement(By.name("email"));
    public WebElement USER_NAME_FIELD = webDriver.findElement(By.name("nick"));
    public WebElement PASSWORD_FIELD = webDriver.findElement(By.name("password"));
    public WebElement CONFIRM_PASWORD_FIELD = webDriver.findElement(By.name("password2"));
    public WebElement REGISTER_BUTTON =  webDriver.findElement(By.className("line-form-button")).findElement(By.className("blue-button"));
    public WebElement ERROR_PROFF = webDriver.findElement(By.name("email"));

    public RegisterPage(User user, WebDriver webDriver) {
        this.user = user;
        this.webDriver = webDriver;
    }

   public void register(){
        EMAIL_FIELD.sendKeys(user.getUserEmail());
        USER_NAME_FIELD.sendKeys(user.getUserName());
        PASSWORD_FIELD.sendKeys(user.getPassword());
        CONFIRM_PASWORD_FIELD.sendKeys(user.getPassword());
        REGISTER_BUTTON.submit();
   }


}
