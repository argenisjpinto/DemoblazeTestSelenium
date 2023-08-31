package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlaceOrder {
    private WebDriver driver;
    private By inputName = By.id("name");
    private By countryName = By.id("country");
    private By cityName = By.id("city");
    private By cardNumber = By.id("card");
    private By monthDate = By.id("month");
    private By yearDate = By.id("year");
    private By purchaseButton = By.xpath("//button[contains(text(),'Purchase')]");
    private By okButtonPurchase = By.xpath("//button[contains(text(),'OK')]");
    private By closePurchaseButton = By.xpath("//button[contains(text(),'Purchase')]");

    public PlaceOrder(WebDriver driver){
        this.driver = driver;
    }

    public Purchase setInputName(String name){
        driver.findElement(inputName).sendKeys(name);
        return new Purchase(driver);
    }
    public Purchase setCountryName(String country) {
        driver.findElement(countryName).sendKeys(country);
        return new Purchase(driver);
    }
    public Purchase setCityName(String city) {
        driver.findElement(cityName).sendKeys(city);
        return new Purchase(driver);
    }

    public Purchase setCardName(String card) {
        driver.findElement(cardNumber).sendKeys(card);
        return new Purchase(driver);
    }

    public Purchase setMonthDate(String month) {
        driver.findElement(monthDate).sendKeys(month);
        return new Purchase(driver);
    }
    public Purchase setYearDate(String year) {
        driver.findElement(yearDate).sendKeys(year);
        return new Purchase(driver);
    }

    public Purchase clickPurchase(){
        driver.findElement(purchaseButton).click();
        return new Purchase(driver);
    }


}
