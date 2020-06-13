#Feature: Guess the word
#  # The first example has two steps
#  Scenario: Maker starts a game
#    When the Maker starts a game
#    Then the Maker waits for a Breaker to join
#
#  # The second example has three steps
#  Scenario: Breaker joins a game
#    # Pre-condition or setup
#    Given the Maker has started a game with the word "silky"
#    # Action
#    When the Breaker joins the Maker's game
#    # Assert
#    Then the Breaker must guess a word with 5 characters
#
#  Scenario: Simple scenario
#    Given my account has a balance of £430
#    Then my account should have a balance of £430
#
#  Example: Multiple Givens
#    Given one thing
#    And another thing
#    And yet another thing
#    When I open my eyes
#    Then I should see something
#    But I shouldn't see something else
#
#  Scenario: All done
#    Given I am out shopping
#    * I have eggs
#    * I have milk
#    * I have butter
#    When I check my list
#    Then I don't need anything
#
#  Scenario Outline: eating
#    Given there are <start> cucumbers
#    When I eat <eat> cucumbers
#    Then I should have <left> cucumbers
#
#    Examples:
#      | start | eat | left |
#      | 12    | 5   | 7    |
#      | 20    | 5   | 15   |
#
#    Scenarios:
#
#  Scenario: Doc String
#    Given a blog post named "Random" with Markdown body
#  """
#  Some Title, Eh?
#  ===============
#  Here is the first paragraph of my blog post. Lorem ipsum dolor sit amet,
#  consectetur adipiscing elit.
#  """
#    Then I need to read a lot
#
#  Scenario: Describe behaviour
#    Given I visit "/login"
#    When I enter "Bob" in the "user name" field
#    And I enter "tester" in the "password" field
#    And I press the "login" button
#    Then I should see the "welcome" page
#
#
#Feature: Subscribers see different sets of stock images based on their subscription level
#
#  Scenario: Free subscribers see only the free articles
#    Given users with a free subscription can access "FreeArticle1" but not "PaidArticle1"
#    When I type "freeFrieda@example.com" in the email field
#    And I type "validPassword123" in the password field
#    And I press the "Submit" button
#    Then I see "FreeArticle1" on the home page
#    And I do not see "PaidArticle1" on the home page
#
#  Scenario: Subscriber with a paid subscription can access "FreeArticle1" and "PaidArticle1"
#    Given I am on the login page
#    When I type "paidPattya@example.com" in the email field
#    And I type "validPassword123" in the password field
#    And I press the "Submit" button
#    Then I see "FreeArticle1" and "PaidArticle1" on the home page
#
#    #Better
#Feature: Subscribers see different sets of stock images based on their subscription level
#
#  Scenario: Free subscribers see only the free articles
#    Given Free Frieda has a free subscription
#    When Free Frieda logs in with her valid credentials
#    Then she sees a Free article on the home page
#
#  Scenario: Subscriber with a paid subscription can access both free and paid articles
#    Given Paid Patty has a basic-level paid subscription
#    When Paid Patty logs in with her valid credentials
#    Then she sees a Free article and a Paid article on the home page