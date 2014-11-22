package hotlineTest.HotlinePages;

import hotlineTest.utils.Log4Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.util.List;

public class ProductPage {
    private WebDriver webDriver;
    private List<WebElement> webElements;

    public ProductPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public boolean isMoreThanOnePrice(){
        Log4Test.info("find more than one price");
        return webDriver.findElements(By.className("box")).size() > 1;
    }



}
