package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By loginUsername = By.id("loginusername");
    private By loginPassword = By.id("loginpassword");
    private By buttonLogin = By.xpath("//button[@onclick=\"logIn()\"]");
    private By userLogged = By.id("nameofuser");



    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setLoginUsername(String username){
        driver.findElement(loginUsername).sendKeys(username);
    }

    public void setLoginPassword(String password){
        driver.findElement(loginPassword).sendKeys(password);
    }

    public void clickButtonLogin() throws InterruptedException {
        driver.findElement(buttonLogin).click();
        Thread.sleep(3000);
    }

    public String getStatusLogin(){
        return driver.findElement(userLogged).getText();
    }
}
