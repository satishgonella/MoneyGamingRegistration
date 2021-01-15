@RegisterUser
Feature: Validate the user registration
  As a new moneygaming.com player
  I want to be able to register using my full details
  So that I can play online casino games

  Scenario Outline:
    Given I am on a Money Gaming Landing Page
    When I clicked on JOIN NOW button
    And I enter the following details "<Title>", "<FirstName>", "<Surname>"
    And I select the checkbox and click on JoinNow button
    Then verify field level error message is displayed

    Examples:
    | Title | FirstName | Surname |
    | Mr    | Jagadish  | Rajanala|