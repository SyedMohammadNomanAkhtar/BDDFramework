Feature: Reset functionality on login page of Application

  Scenario: Verification of Reset button

    Given Open the Chrome and launch the application

    When Enter the Username and Password

    And User Enters into the application

    And User Select a product randomly

    And User Click on cart icon and move to Checkout

    And Enter the firstname, lastname and postalcode

    And User Click continue

    Then  User Click on finish
