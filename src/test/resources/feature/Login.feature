Feature: Login Functionality
  Background:
    Given user is on login page
@Valid
  Scenario: Valid login TC_01

    When user enters valid credentials and click on login
    And user can verify the logout link

  @Invalid
  Scenario: Invalid login TC_02

    When user enters invalid credentials and click on login
    And user can verify error message