package homeworks.homework_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    WebDriver webDriver;

    public WebElement REGISTER_LINK = webDriver.findElement(By.className("reg"));
    public WebElement LOGIN_LINK = webDriver.findElement(By.className("open-lightbox"));
    public String WebSiteName;


    public MainPage(WebDriver webDriver, String WebSiteName) {
        this.webDriver = webDriver;
        this.WebSiteName = WebSiteName;
    }

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.WebSiteName = "http://hotline.ua/";
    }

    public void pressRegisterLink(){
        REGISTER_LINK.click();
    }

    public void pressLoginLink(){
        LOGIN_LINK .click();
    }

    public void getMainPage(){
        webDriver.get(WebSiteName);
    }

}
