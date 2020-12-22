Feature: Amazon Search

  Scenario: Search a Product
    Given Search box is available on Amazon
    When I search a product named 'Apple Macbook' and price is 10000
    Then Product with Name 'Apple Macbook' should be displayed

  Scenario: Search a Product
    Given Search box is available on Amazon
    When I search a product named 'Apple Macbook' and price is 10000
    Then Product with Name 'Apple Macbook' should be displayed

