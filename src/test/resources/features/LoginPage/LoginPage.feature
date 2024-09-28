Feature: OrangeHRM Login Page

	@smokeTest
  Scenario: Successful login with valid credentials
    Given I am on the OrangeHRM login page
    Then Orange HRM Login URL Verifed
    When I enter "Admin" as the username
    And I enter "admin123" as the password
    And I click on the Login button
    Then Close the Browser