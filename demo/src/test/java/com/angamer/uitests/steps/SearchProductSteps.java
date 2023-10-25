package com.angamer.uitests.steps;

import org.testng.Assert;

import com.angamer.uitests.pages.HomePage;
import com.angamer.uitests.pages.PageContext;
import com.angamer.uitests.pages.ProductDetailsPage;
import com.angamer.uitests.pages.SearchPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SearchProductSteps {
	HomePage homePage;
	SearchPage searchPage;
	ProductDetailsPage productDetailsPage;
	String productName;
	PageContext pageContext;
	
	public SearchProductSteps(PageContext pageContext){
		this.pageContext = pageContext;
		this.homePage = new HomePage(this.pageContext);
		this.searchPage = new SearchPage(this.pageContext);
		this.productDetailsPage = new ProductDetailsPage(this.pageContext);
	}
	 
	@Given("Clicking the search button on the home page")
	public void clickingTheSearchButtonOnTheHomePage() {		
		this.homePage.clickSearchButton();
	}

	@Given("entering the {string} and choosing the {string} in search page")
	public void enteringTheAndChoosingTheInSearchPage(String productName, String categoryName) {
		this.productName = productName;
		this.searchPage.enterSearchTerm(productName)
		.selectCategory(categoryName);				
	}

	@Given("clicking on the search button")
	public void clickingOnTheSearchButton() {
		this.searchPage.clickSearchButton();
	}

	@Then("the product page should display the product details")
	public void theProductPageShouldDisplayTheProductDetails() {
		Assert.assertEquals(productDetailsPage.getProductTitle().toLowerCase(),this.productName.toLowerCase());
		Assert.assertTrue(productDetailsPage.isAddToCartButtonDisplayed());
		Assert.assertTrue(productDetailsPage.isDescriptionDisplayed());		
		Assert.assertTrue(productDetailsPage.isQuantityDisplayed());
		Assert.assertTrue(productDetailsPage.isPriceDisplayed());
	}
}
