Feature: Test login functionality
  Scenario Outline: Verify login for incorrect credentials
    Given User is on Login Page
    When User enters username '<Username>'
    And User enters password '<Password>'
    Then Error message should be displayed

    Examples:
      | Username | Password |
      |incorrectUsername|  12345 |
      |vishesh|  incorrectpassword |
      |incorrectUsername| incorrectPassword |


    Scenario: Checking
      Given Not using Scenario Out


