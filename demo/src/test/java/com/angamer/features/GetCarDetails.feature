Feature: Showroom Get car details

  Scenario Outline: Get car details based for valid car type
    Given "<carType>" is used as a query parameter
    And user performs get call on the get details api endpoint
    Then relevant car details must be returned successfully as response

    Examples: 
      | carType   |
      | hatchback |
      | SUV       |
      | saloon    |

  Scenario Outline: Get car details based for invalid car type
    Given "<carType>" is used as a query parameter
    And user performs get call on the get details api endpoint
    But no car details should not be displayed with status 404

    Examples: 
      | carType |
      | hatch   |
      |         |
