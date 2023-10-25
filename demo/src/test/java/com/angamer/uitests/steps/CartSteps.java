package com.angamer.uitests.steps;

import org.testng.Assert;

import com.angamer.uitests.pages.CartPage;
import com.angamer.uitests.pages.HomePage;
import com.angamer.uitests.pages.PageContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CartSteps {
	PageContext pageContext;
	HomePage homePage;
	CartPage cartPage;
	String normalProductName;
	String normalProductPrice;
	String saleProductName;
	String saleProductPrice;
	
	public CartSteps(PageContext pageContext) {
		this.pageContext = pageContext;
		this.homePage = new HomePage(this.pageContext);
		this.cartPage = new CartPage(this.pageContext);
	}
	
	@Given("Clicking the add cart button on the normal product")
	public void clickingTheAddCartButtonOnTheNormalProduct() {
		this.normalProductName = this.homePage.addNormalProductToCartAndGetName();
		this.normalProductPrice = this.homePage.getNormalProductPrice();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// Wait failed
			e.printStackTrace();
		}		
	}

	@Given("clicking the sale product on the home page")
	public void clickingTheSaleProductOnThehomePage() {
		this.saleProductName = this.homePage.addSaleProductToCartAndGetName();
		this.saleProductPrice = this.homePage.getSaleProductPrice();	
	}

	@Given("opening the cart page")
	public void openingTheCartPage() {
		this.homePage.openCartPage();		
	}

	@Then("cart page should display added product details")
	public void cartPageShouldDisplayAddedProductDetails() {
		boolean isNormalProductAddedSuccessfuly = this.cartPage.isItemAddedWithPrice(normalProductName, normalProductPrice);
		boolean isSaleProductAddedSuccessfuly = this.cartPage.isItemAddedWithPrice(saleProductName, saleProductPrice);
		Assert.assertTrue(isNormalProductAddedSuccessfuly);
		Assert.assertTrue(isSaleProductAddedSuccessfuly);
	}

	@Given("increasing the quantity")
	public void increasingTheQuantity() {
		this.cartPage.updateCartQuantity();
	}

	@Then("the price details of the latest quantity should be displayed")
	public void thePriceDetailsOfTheLatestQuantityShouldBeDisplayed() {
		this.cartPage.hasAmountDoubled(this.normalProductPrice);
	}	
}
