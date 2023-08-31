package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Purchase {
    private WebDriver driver;
    private By resultPurchase = By.xpath("//h2[contains(text(),'Thank you for your purchase!')]");



    public Purchase(WebDriver driver){
        this.driver = driver;
    }

    public String getStatusPurchase(){
        return driver.findElement(resultPurchase).getText();
    }




}
