Feature: Database Tests
  Scenario: Save users from API to database
    Given database connection is established
    When I get 3 users from API
    And I save users to database
    Then users should be stored in database

    Scenario: Read users from database

      Given database connection is established
      When I read users from database
      Then all users are printed