package hotlineTest.HotlinePages;

import hotlineTest.utils.Log4Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;

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

    public void moveMouseDown(int i)    {
        Log4Test.info("move mouse");
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        robot.setAutoDelay(10000);
        robot.mouseWheel(i);
        robot.setAutoDelay(10000);
    }

    public void moveToMarkPanel(){
        Log4Test.info("search find all marks");
        webDriver.findElement(By.xpath("//*[@class='switcher to-full op_all']")).click();
        Log4Test.info("execute javaScript");
        ((JavascriptExecutor)webDriver).executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);",
                webDriver.findElement(By.className("jspPane")), "style", "padding: 0px 20px 0px 0px; width: 185px; top: -688px;");
        moveMouseDown(-3);
    }

    public void FilterMark(String mark){
        Log4Test.info("find current refrigerator mark");
        webDriver.findElement(By.xpath("//*[@id='filters']//a[contains(text(),'" + mark + "')]")).click();
    }

    public void sortBy(String sortType){
        webDriver.findElement(By.className("ddopener")).click();
        webDriver.findElement(By.xpath("//a[contains(text(),'" + sortType + "')]")).click();
    }

    public int priceGetter(WebElement element){
        Log4Test.info("get price");
        int value = 0;
        String stringValue = element.getText().substring(0,1) + element.getText().substring(2,5);
        return value = Integer.parseInt(stringValue);
    }

    public WebElement findFirstPrice(){
        Log4Test.info("find first price");
        WebElement element =  webDriver.findElement(By.xpath("//*[@class='orng']"));
        return element;
    }

    public WebElement findSecondPrice(){
        Log4Test.info("find second price");
        WebElement element =   webDriver.findElement(By.xpath("(//*[@class='orng'])[2]"));
        return element;
    }

    public boolean compareprice(){
        Log4Test.info("compare price");
        if(priceGetter(findFirstPrice()) < priceGetter(findSecondPrice())) return true;
        return false;
    }
}
