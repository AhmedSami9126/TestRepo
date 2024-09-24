@Test

Feature: Changing temperature unit from C to F and validate this change in home screen
  Scenario: changing temperature and assert this change in home page
    Given click on temperature arrow
    When choosing F unit
    And click on done button
    And confirm privacy policy
    Then validate unit is F