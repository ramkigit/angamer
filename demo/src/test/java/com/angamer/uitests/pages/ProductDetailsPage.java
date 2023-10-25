package com.angamer.uitests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductDetailsPage {
    
    PageContext context;
    
    public ProductDetailsPage( PageContext context) {
      this.context = context;
    }

    public String getProductTitle() {
        return context.getDriver().findElement(By.xpath("//h1[@class='productname']")).getText();
    }
    
    public boolean isAddToCartButtonDisplayed() {
        return context.getDriver().findElement(By.xpath("//a[contains(.,'Add to Cart')]")).isDisplayed();
    }

    public boolean isQuantityDisplayed() {
        return context.getDriver().findElement(By.id("product_quantity")).isDisplayed();
    }
    
    public boolean isPriceDisplayed() {    	
        return context.getDriver().findElement(By.xpath("//span[contains(text(),'$')]")).isDisplayed();
    }
    
    public boolean isDescriptionDisplayed() {
        return context.getDriver().findElement(By.xpath("//a[contains(text(),'Description')]")).isDisplayed();
    }
    
    public ProductDetailsPage waitForPageLoaded() {
    	this.context.getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Description')]")));
    	return this;
    }
}