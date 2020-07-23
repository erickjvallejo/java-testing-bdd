@all
Feature: myself as Math user
         I want to make math operations in a calculator app
         to avoid do formulas in a paper.
  @sum
  Scenario: Sum two number
    Given I have a calculator
    When I add 1 plus 2
    Then the result should be 3

  @sum
  Scenario: Sum two number, one is negative
    Given I have a calculator
    When I add -1 plus 2
    Then the result should be 1

  @sum
  Scenario: Sum two equal numbers
    Given I have a calculator
    When I add 30 plus 30
    Then the result should be 60

  @subtract
  Scenario: Subtract two number
    Given I have a calculator
    When I subtract 1 and  2
    Then the result should be -1

  @subtract
  Scenario: Subtract two equals numbers
    Given I have a calculator
    When I subtract 3 and  3
    Then the result should be 0

  @multiplication
  Scenario: Multiply two numbers
    Given I have a calculator
    When I multiply 2 and 2
    Then the result should be 4

  @multiplication
  Scenario: Multiply two different numbers
    Given I have a calculator
    When I multiply 3 and 2
    Then the result should be 6

  @division
  Scenario: divide two numbers
    Given I have a calculator
    When I divide 6 in 2
    Then the result should be 3

  @division
  Scenario: divide two numbers
    Given I have a calculator
    When I divide 10 in 2
    Then the result should be 5



