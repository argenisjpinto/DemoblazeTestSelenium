package purchase;

import base.BaseTests;

import org.testng.annotations.Test;
import pages.*;


import static org.testng.Assert.assertEquals;

public class PurchaseTests extends BaseTests {

    @Test (priority = 1)
    public void testSignUpUser() throws InterruptedException{
        SignUpPage signUpPage = homePage.clickSignUp();
        Thread.sleep(2000);
        signUpPage.setInputUsername("ArgenisPintoTester");
        signUpPage.setInputPassword("abcdef");
        signUpPage.clickButtonSignUp();
        Thread.sleep(1000);
    }

    @Test (priority = 2)
    public void testLoginUser() throws InterruptedException{
        LoginPage loginPage = homePage.clickLogin();
        Thread.sleep(2000);
        loginPage.setLoginUsername("ArgenisPintoTester");
        loginPage.setLoginPassword("abcdef");
        loginPage.clickButtonLogin();
        Thread.sleep(1000);
        // Assert
        assertEquals(loginPage.getStatusLogin(),"Welcome ArgenisPintoTester");
    }

    @Test (priority = 3)
    public void testPurchaseLaptop() throws InterruptedException {
        ProductPage productPage = homePage.clickCategoryLaptop();
        Thread.sleep(2000);
        productPage = homePage.clickLaptopI5();
        Thread.sleep(2000);
        CartPage cartPage = productPage.addProductToCart();
        cartPage = productPage.goToCart();
        PlaceOrder placeOrder = cartPage.placeOrder();
        Thread.sleep(2000);
        placeOrder.setInputName("Argenis Pinto");
        placeOrder.setCountryName("Argentina");
        placeOrder.setCityName("Buenos Aires");
        placeOrder.setCardName("123456789");
        placeOrder.setMonthDate("Agosto");
        placeOrder.setYearDate("2023");
        Thread.sleep(3000);
        placeOrder.clickPurchase();
        // Assert
        assertEquals(placeOrder.clickPurchase().getStatusPurchase(),"Thank you for your purchase!");
    }
}
