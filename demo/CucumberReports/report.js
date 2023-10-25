$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\java\\com\\angamer\\features\\Cart.feature");
formatter.feature({
  "name": "Cart feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "We are able to add normal and sale products to the cart",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Clicking the add cart button on the normal product",
  "keyword": "Given "
});
formatter.match({
  "location": "CartSteps.clickingTheAddCartButtonOnTheNormalProduct()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicking the sale product on the home page",
  "keyword": "And "
});
formatter.match({
  "location": "CartSteps.clickingTheSaleProductOnThehomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "opening the cart page",
  "keyword": "And "
});
formatter.match({
  "location": "CartSteps.openingTheCartPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "cart page should display added product details",
  "keyword": "Then "
});
formatter.match({
  "location": "CartSteps.cartPageShouldDisplayAddedProductDetails()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "We are able to update cart based on changes on cart page",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Clicking the add cart button on the normal product",
  "keyword": "Given "
});
formatter.match({
  "location": "CartSteps.clickingTheAddCartButtonOnTheNormalProduct()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "opening the cart page",
  "keyword": "And "
});
formatter.match({
  "location": "CartSteps.openingTheCartPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "increasing the quantity",
  "keyword": "And "
});
formatter.match({
  "location": "CartSteps.increasingTheQuantity()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the price details of the latest quantity should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "CartSteps.thePriceDetailsOfTheLatestQuantityShouldBeDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "status": "passed"
});
});