@Test

Feature: Changing Time Format from 24h to 12h and validate this change in home screen
  Scenario: changing time format and assert this change in home page
    Given click on time format arrow
    When choosing twelve format
    And confirm privacy policy
    Then validate format is AM and PM