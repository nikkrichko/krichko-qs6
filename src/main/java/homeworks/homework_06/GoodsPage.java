package homeworks.homework_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by bionic on 11/5/14.
 */
public class GoodsPage {

    WebDriver webDriver;
    private WebElement goods;

    public GoodsPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebElement getGoods(String goodName) {
        return goods = webDriver.findElement(By.xpath("//*[.='" + goodName + "']"));
    }


}
