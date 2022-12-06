package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends Utility {
By productsTitle = By.xpath("//div/span[text()='Products']");
By listOfProducts = By.className("inventory_item");

    public String getErrorMessage(){
        return getTextFromElement(productsTitle);

    }
    public int getProductList(){
        List<WebElement> list = driver.findElements(listOfProducts);
        int actualNumber = list.size();
        return actualNumber;
    }


}
