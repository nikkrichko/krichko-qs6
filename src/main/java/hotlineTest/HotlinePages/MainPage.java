package hotlineTest.HotlinePages;

import hotlineTest.utils.Log4Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private WebDriver webDriver;
    private WebElement REGISTER_LINK;
    private WebElement LOGIN_LINK;
    private WebElement SEARCH_STRING;
    private WebElement searchButton;
    private WebElement closeVisaBanner;
    private WebElement closeCity;
    private String WebSiteName;

    public MainPage(WebDriver webDriver, String WebSiteName) {
        this.webDriver = webDriver;
        this.WebSiteName = WebSiteName;
        Log4Test.info("get main page");
    }

    public MainPage(WebDriver webDriver) {
        Log4Test.info("get main page");
        this.webDriver = webDriver;
        this.WebSiteName = "http://hotline.ua/";

    }

    public void pressRegisterLink() {
        Log4Test.info("press registerlink");
        getREGISTER_LINK().click();
    }

    public void pressLoginLink() {
        Log4Test.info("press press Login Link");
        getLOGIN_LINK().click();
    }

    public void serchProduct(String productName) {
        Log4Test.info("type " + productName + "in serchField and find it");
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

//    public WebElement getCloseVisaBanner() {
//        closeVisaBanner = webDriver.findElement(By.id("lightbox-form")).findElement(By.tagName("span"));
//        return closeVisaBanner;
//    }
//
//    public WebElement getCloseCity() {
//        return closeCity = webDriver
//                .findElement(By.className("rgn-box sbj popup-box region-doubtfulness-popup"))
//                .findElement(By.className("close"));
//    }
//
//    public void closeOtherElements() {
//        if (getCloseVisaBanner().isDisplayed()) {
//            getCloseVisaBanner().click();
//        }
//        if (getCloseCity().isDisplayed()){getCloseCity().click();}
//    }
}
