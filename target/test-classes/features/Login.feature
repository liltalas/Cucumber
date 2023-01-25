Feature: To Test Login Functionality
  Developer
  Tester

#  Here we write all scenarios
Background:
  Given user open website
  And verify user is on login page

  Scenario: Verify User Can Login Into Application
    When user enter the valid credentials
    Then verify home page is displayed
#    Given user open website - u can re use the code as many times as u can

  Scenario: Verify User Cannot Login with Invalid Credentials
    When user enter the invalid credentials
    Then verify invalid login error message is displayed
    And close browser