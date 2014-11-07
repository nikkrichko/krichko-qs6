package hotlineTest.HotlinePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WelcomePage {

    WebDriver webDriver;
    public WebElement WELCOME_PAGE_FIRST_NAME;
    public WebElement WELCOME_PAGE_SECOND_NAME;

    public WelcomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        WELCOME_PAGE_FIRST_NAME = webDriver.findElement(By.name("first_name"));
        WELCOME_PAGE_SECOND_NAME = webDriver.findElement(By.name("last_name"));
    }


}
