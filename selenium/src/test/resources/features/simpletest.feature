Feature: this is a simple test to check how it works the Web driver for Google chrome
  Scenario: open and close the browser
    Given I have a Google page  browser
    When I refresh it 5 times
    Then I want to close it
