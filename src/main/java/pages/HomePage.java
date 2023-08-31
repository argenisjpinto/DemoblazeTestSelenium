package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By linkCategoryLaptop = By.xpath("//a[@onclick=\"byCat('notebook')\"]");
    private By linkLaptopI5 = By.xpath("//a[.=\"Sony vaio i5\"]");
    private By linkSignUp = By.id("signin2");
    private By linkLogin = By.id("login2");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public SignUpPage clickSignUp(){
        driver.findElement(linkSignUp).click();
        return new SignUpPage(driver);
    }

    public LoginPage clickLogin(){
        driver.findElement(linkLogin).click();
        return new LoginPage(driver);
    }

    public ProductPage clickCategoryLaptop(){
        driver.findElement(linkCategoryLaptop).click();
        return new ProductPage(driver);
    }

    public ProductPage clickLaptopI5(){
        driver.findElement(linkLaptopI5).click();
        return new ProductPage(driver);
    }


}
