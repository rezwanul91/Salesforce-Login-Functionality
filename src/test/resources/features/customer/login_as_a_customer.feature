Feature: Login Salesforce as a Customer
  Scenario: Verify Salesforce Login functionality
    Given I want to go to salesforce landing page
    When I mouse hover in login menu
    Then I click in salesforce menu
    And I logged in as a customer
    |userName               |password|
    |rezwanul0091@gmail.com |salesforce2023|
    Then I verify I am in salesforce landing page