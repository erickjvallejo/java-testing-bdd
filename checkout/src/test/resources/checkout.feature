Feature: Checkout
  Scenario: Checkout a banana
    Given the price of a "banana" is 40
    When I checkout 1 "banana"
    Then the total price should be 40

  Scenario Outline: Checkout bananas
    Given the price of a "banana" is 40
    When I checkout <count> "banana"
    Then the total price should be <total>
    Examples:
      | count | total |
      | 1     | 40    |
      | 2     | 80    |

  Scenario: Two bananas scanned separately
    Given the price of a "banana" is 40
    When I checkout 1 "banana"
    And I checkout 1 "banana"
    Then the total price should be 80

  Scenario: A banana and an apple
    Given the price of a "banana" is 40
    And the price of a "apple" is 25
    When I checkout 1 "banana"
    And I checkout 1 "apple"
    Then the total price should be 65