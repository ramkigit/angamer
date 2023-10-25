Feature: Cart feature

  Scenario: We are able to add normal and sale products to the cart
    Given Clicking the add cart button on the normal product
    And clicking the sale product on the home page
    And opening the cart page
    Then cart page should display added product details

  Scenario: We are able to update cart based on changes on cart page
    Given Clicking the add cart button on the normal product
    And opening the cart page
    And increasing the quantity
    Then the price details of the latest quantity should be displayed
