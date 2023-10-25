package com.angamer.uitests.pages;

import org.openqa.selenium.By;

public class CartPage {

	PageContext context;

	public CartPage(PageContext context) {
		this.context = context;
	}

	public boolean isItemAddedWithPrice(String itemName,String price) {
		String productLinkXPath = "//*[@id='cart']/descendant::a//text()[contains(translate(.,'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'),'"+itemName.toLowerCase()+"')]/parent::*";
    	boolean isItemPresent = context.getDriver().findElement(By.xpath(productLinkXPath)).isDisplayed();
    	boolean isPricePresent = context.getDriver().findElement(By.xpath(productLinkXPath+"/parent::td/following-sibling::td[contains(text(),'"+price+"')]")).isDisplayed();
    	return isItemPresent && isPricePresent;
    }

	public void updateCartQuantity() {
		this.context.getDriver().findElement(By.id("cart_quantity50")).clear();
		this.context.getDriver().findElement(By.id("cart_quantity50")).sendKeys("2");
		this.context.getDriver().findElement(By.xpath("//button[@title='Update']")).click();
	}

	public boolean hasAmountDoubled(String unitPrice) {
		Float price = Float.parseFloat(unitPrice.replace("$", ""));
		String expectedPrice = String.format("$%f",price*2).substring(0,6);
		return this.context.getDriver().findElement(By.xpath("//td[text()='"+expectedPrice+"']")).isDisplayed();		
	}
}