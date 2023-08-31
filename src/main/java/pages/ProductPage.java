package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;

public class ProductPage {
    private WebDriver driver;
    private By addToCart = By.xpath("//a[@onclick=\"addToCart(8)\" and text()=\"Add to cart\"]");
    private By goToCart = By.id("cartur");

    public ProductPage(WebDriver driver){
        this.driver = driver;
    }

    public CartPage addProductToCart() throws InterruptedException {
        driver.findElement(addToCart).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        return new CartPage(driver);
    }

    public CartPage goToCart(){
        driver.findElement(goToCart).click();
        return new CartPage(driver);
    }



}
