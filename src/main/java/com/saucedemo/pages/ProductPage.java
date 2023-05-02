package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

public class ProductPage extends Utility {
    By productsText = By.xpath("//div[@class='header_secondary_container']/span");
    By productsNum = By.xpath("//div[@class='inventory_item']");

    public String getProductsText() {
        return getTextFromElement(productsText);
    }

    public String getProductsPerPage() {
        List<WebElement> productElementList = driver.findElements(By.xpath("//div[@class='inventory_item']"));
        int size = productElementList.size();
        return String.valueOf(size);
    }
}

