package com.angamer.uitests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class HomePage {
    
    PageContext context;
    
    public HomePage( PageContext context) {
      this.context = context;
    }

    public void clickSearchButton() {
        context.getDriver().findElement(By.xpath("//div[@title='Go']//i[1]")).click();        
    }
    
    public String addNormalProductToCartAndGetName() {
    	context.getDriver().findElement(By.xpath("//*[text()='Featured']/ancestor::div/div/div/descendant::a[@title='Add to Cart']")).click();
    	return context.getDriver().findElement(By.xpath("//*[text()='Featured']/ancestor::div/div/div/descendant::a[@title='Add to Cart']/ancestor::div/descendant::div/a[@class='prdocutname']")).getText();
    }
    
    public String getNormalProductPrice() {
    	return context.getDriver().findElement(By.xpath("//*[text()='Featured']/ancestor::div/div/div/descendant::a[@title='Add to Cart']/ancestor::div/descendant::div[@class='oneprice']")).getText();
    }
    
    public String addSaleProductToCartAndGetName() {    	
    	context.getDriver().findElement(By.xpath("//*[text()='Specials']/parent::*/parent::div/descendant::span[@class='sale']/parent::div/descendant::a[@title='Add to Cart']")).click();
    	return context.getDriver().findElement(By.xpath("//*[text()='Specials']/parent::*/parent::div/descendant::span[@class='sale']/parent::div/parent::div/descendant::a[@class='prdocutname']")).getText();
    }
    
    public String getSaleProductPrice() {
    	return context.getDriver().findElement(By.xpath("//*[text()='Specials']/parent::*/parent::div/descendant::span[@class='sale']/parent::div/parent::div/descendant::div[@class='pricenew']")).getText();
    }
    
    public void openCartPage() {
    	context.getDriver().findElement(By.xpath("(//i[@class='fa fa-shopping-cart']/following-sibling::span)[1]")).click();
    }
    
    public void theCartBadgeShouldGetUpdated() {
        WebElement snackBar = context.getDriver().findElement(By.tagName("snack-bar-container"));
        context.getWait().until(ExpectedConditions.visibilityOf(snackBar));
        context.getWait().until(ExpectedConditions.invisibilityOf(snackBar));
        String text =
                context.getDriver().findElement(By.cssSelector("#mat-badge-content-0")).getText();
        System.out.println("No.of books in cart: "+text);
        Assert.assertEquals(Integer.parseInt(text) > 0, true);
    }
}