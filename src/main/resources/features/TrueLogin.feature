Feature: OrangeHRM Valid Login

  Scenario: User lands on the OrangeHRM login page and successfully logs in
    Given the OrangeHRM login page is displayed successfully
    When the username "Admin" is entered
    And the password "admin123" is entered
    And the login button is clicked
    Then the dashboard page should be visible