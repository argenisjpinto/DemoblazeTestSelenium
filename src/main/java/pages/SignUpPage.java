package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {

    private WebDriver driver;
    private By inputUsername = By.id("sign-username");
    private By inputPassword = By.id("sign-password");
    private By buttonSignUp = By.xpath("//button[@onclick=\"register()\"]");


    public SignUpPage(WebDriver driver){
        this.driver = driver;
    }

    public void setInputUsername(String username){
        driver.findElement(inputUsername).sendKeys(username);
    }

    public void setInputPassword(String password){
        driver.findElement(inputPassword).sendKeys(password);
    }

    public void clickButtonSignUp() throws InterruptedException {
        driver.findElement(buttonSignUp).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
    }

}
