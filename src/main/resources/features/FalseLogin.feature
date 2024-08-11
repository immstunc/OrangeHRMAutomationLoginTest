Feature: OrangeHRM Invalid Login

  Scenario: User lands on the OrangeHRM login page and successfully logs in
    Given the OrangeHRM login page is displayed
    When invalid username is entered
    And invalid password is entered
    And the login button is clicked by user
    Then the "Invalid credentials" warning showed up