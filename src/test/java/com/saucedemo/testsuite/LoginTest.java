package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductPage;
import com.saucedemo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    ProductPage productPage = new ProductPage();

    //method to login with successful credentials
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //enter username
        loginPage.sendTextToUsernameField("standard_user");
        //enter password
        loginPage.sendTextToPasswordField("secret_sauce");
        //login
        loginPage.clickOnLoginButton();
        String expectedProductsText = "Products";
        String actualProductsText = String.valueOf(productPage.getProductsText());
        //verify whether products text is displayed
        Assert.assertEquals(actualProductsText, expectedProductsText, "Products text not displayed");
    }

}

