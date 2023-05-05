Feature: Google Test

  Scenario: Google search for Cucumber
    Given User opens "https://www.google.com/"
    When User searches for "Cucumber"
    Then First search result is "Cucumber: BDD Testing & Collaboration Tools for Teams"