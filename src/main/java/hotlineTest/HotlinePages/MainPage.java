package hotlineTest.HotlinePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {


    public MainPage(WebDriver webDriver, String WebSiteName) {
        this.webDriver = webDriver;
        this.WebSiteName = WebSiteName;
    }

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.WebSiteName = "http://hotline.ua/";
    }

    public WebDriver webDriver;
    public WebElement REGISTER_LINK;
    public WebElement LOGIN_LINK;
    public WebElement SEARCH_STRING;
    public WebElement searchButton;
    public String WebSiteName;

    public void pressRegisterLink() {
        REGISTER_LINK = webDriver.findElement(By.className("reg"));
        REGISTER_LINK.click();
//        getREGISTER_LINK().click();
    }

    public void pressLoginLink() {
        getLOGIN_LINK().click();
    }

    public void serchProduct(String productName) {
        getSEARCH_STRING().sendKeys(productName);
        getSearchButton().submit();
    }

    public void getMainPage() {
        webDriver.get(WebSiteName);
    }

    public WebElement getREGISTER_LINK() {
        return REGISTER_LINK = webDriver.findElement(By.className("reg"));
    }

    public WebElement getLOGIN_LINK() {
        return LOGIN_LINK = webDriver.findElement(By.className("open-lightbox"));
    }

    public WebElement getSEARCH_STRING() {
        return SEARCH_STRING = webDriver.findElement(By.id("searchbox"));
    }

    public WebElement getSearchButton() {
        return searchButton = webDriver.findElement(By.id("doSearch"));


    }


}
