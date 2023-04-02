Feature: Login Functionalities

  Scenario: Valid Admin login
    Given open the browser and launch HRMS application
    When  user enters valid email and valid Password
    And click on login button
    Then user is logged in successfully