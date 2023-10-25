package com.angamer.uitests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchPage {
    
    PageContext context;
    
    public SearchPage( PageContext context) {
      this.context = context;
    }

    public SearchPage enterSearchTerm(String productName) {
        context.getDriver().findElement(By.id("keyword")).sendKeys(productName);
        return this;
    }
    
    public SearchPage selectCategory(String categoryName) {    	
    	WebElement category = context.getDriver().findElement(By.id("category_id"));
    	Select categorySelect = new Select(category);
    	categorySelect.selectByIndex(4);
        return this;
    }
    
    public void clickSearchButton() {
    	context.getDriver().findElement(By.id("search_button")).click();
    }    
}