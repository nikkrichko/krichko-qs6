package hotlineTest.HotlinePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;

/**
 * Created by bionic on 11/5/14.
 */
public class GoodsPage {

    WebDriver webDriver;
    private WebElement good;
    private WebElement priceButton;


    public GoodsPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebElement getGoods(String goodName) {
        return good = webDriver.findElement(By.xpath("//*[.='" + goodName + "']"));
    }

    public boolean getNoGoods(String goodName) {
        return webDriver.findElements(By.xpath("//*[.='" + goodName + "']")).isEmpty() ;
    }

    public void productPrice(){
        priceButton = webDriver.findElement(By.className("price"))
                .findElement(By.className("but-box"));
        priceButton.click();
    }

    public boolean isElementPresent(String goodName) {
        try {
            webDriver.findElement(By.xpath("//*[.='" + goodName + "']"));
            return true;
        } catch (Exception e) {
            return false;
        }
    }




}
