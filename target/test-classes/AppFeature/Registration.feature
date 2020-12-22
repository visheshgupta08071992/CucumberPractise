Feature: User Registration
  Scenario: User Registration with different data
    Given User is on Registration Page
    When User enters following Data
      |Vishesh | Gupta | vishesh.gupta@appdirect.com|7020873788|
      |Sandesh | Gupta | sandesh.gupta@appdirect.com|7020873787|
    Then Registration is successful

  Scenario: User Registration with different data with columns
    Given User is on Registration Page
    When User enters following Data with columns
      |firstName | lastName | emailAddress|PhoneNo|
      |Vishesh | Gupta | vishesh.gupta@appdirect.com|7020873788|
      |Sandesh | Gupta | sandesh.gupta@appdirect.com|7020873787|
    Then Registration is successful
