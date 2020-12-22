Feature: Calculate Total Bill Amount
  Scenario Outline: Calculate bill amount of restaurant
    Given User gets the bill
    When Bill amount is '<billAmount>'
    And Tax amount is '<taxAmount>'
    Then Total amount is '<totalAmount>'

    Examples:
      | billAmount | taxAmount | totalAmount |
      | 100 | 10 | 110 |
      | 100 | 10.5 | 110.5 |
      | 10.5 | 110 | 120.5 |
