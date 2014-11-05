package homeworks.homework_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WelcomePage {

    WebDriver webDriver;

    public WelcomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebElement WELCOME_PAGE_FIRST_NAME = webDriver.findElement(By.name("first_name"));
    public WebElement WELCOME_PAGE_SECOND_NAME = webDriver.findElement(By.name("last_name"));
}
