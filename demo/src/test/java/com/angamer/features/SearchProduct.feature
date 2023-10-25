Feature: Search product feature

  Scenario Outline: We are able to search product based on product name and category
    Given Clicking the search button on the home page
    And entering the "<productName>" and choosing the "<category>" in search page
    And clicking on the search button
    Then the product page should display the product details

    Examples: 
      | productName             | category  |
      | ACQUA DI GIO POUR HOMME | Fragrance |
