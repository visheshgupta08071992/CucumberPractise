Feature: Book a Cab Using Uber

  @Regression
  Scenario: Book a Cab Sedan
    When I book a cab of type 'Sedan'
    Then Cab of type 'Sedan' arrives
    And driver starts the journey
    And driver completes the journey
    Then I pay 10000 USD

  @Smoke @Regression
  Scenario: Book a Cab SUV
    When I book a cab of type 'SUV'
    Then Cab of type 'SUV' arrives
    And driver starts the journey
    And driver completes the journey
    Then I pay 10000 USD

  @UAT
  Scenario: Book a Cab HatchBack
    When I book a cab of type 'HatchBack'
    Then Cab of type 'HatchBack' arrives
    And driver starts the journey
    And driver completes the journey
    Then I pay 10000 USD
