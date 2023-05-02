package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductPage;
import com.saucedemo.propertyreader.PropertyReader;
import com.saucedemo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductTest extends BaseTest {
    //method to verify six products are displayed per page

    LoginPage loginPage = new LoginPage();
    ProductPage productPage = new ProductPage();

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {

            loginPage.sendTextToUsernameField("standard_user");
            //enter password
            loginPage.sendTextToPasswordField("secret_sauce");
            //login
            loginPage.clickOnLoginButton();
            String productPerPage = "6";
            Assert.assertEquals(productPage.getProductsPerPage(), productPerPage);
        }
    }


