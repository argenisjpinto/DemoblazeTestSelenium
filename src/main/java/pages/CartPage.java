package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;
    private By placeOrderButton = By.xpath("//button[contains(text(),'Place Order')]");

    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    public PlaceOrder placeOrder(){
        driver.findElement(placeOrderButton).click();
        return new PlaceOrder(driver);
    }
}
