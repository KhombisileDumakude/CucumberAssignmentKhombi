@login @Regression @Sanity
Feature: login

  Scenario Outline: as a admin user i want to login to ndosi website
    Given i am on the login page
    And i enter email <email>
    And i enter password <password>
    When i click login button
    Then  i should be successfully logged in
    And i click mobile automation
    Examples:
      | email            | password  |
      | admin@gmail.com  | @12345678 |
    #  | Ndosi@test.co.za | @12345678 |




