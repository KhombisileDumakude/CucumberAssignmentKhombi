@createGroup @Regression @Sanity
Feature: Create Group

  Scenario Outline: as a user i want to login to ndosi website
    Given i am on the login page
    And i enter email <email>
    And i enter password <password>
    When i click login button
    Then  i should be successfully logged in
    And i click on the menu button
    And i click on the admin panel
    And i click on the groups tab
    And i click on the create group button
    And i enter group name <groupName>
    And i enter group description <groupDescription>
    And i enter year <year>
    And i enter maximum capacity <maxCapacity>
    And i enter start date <startDate>
    And i enter end date <endDate>
    Then i should see the group created successfully


    Examples:
      | email            | password  | groupName | groupDescription | year | maxCapacity | startDate  | endDate    |
      | admin@gmail.com | @12345678 | my group  | my description   | 2026 | 10          | 2026/10/19 | 2026/10/21 |