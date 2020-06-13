Feature: Hear shot

  Background:
    Given Lucy is located {int} metres from Sean
      |10 |
      |12 |
      |15 |

  Scenario: Listener is within range
    When Sean shouts "free bagels at Sean's"
    Then Lucy hears Sean's message

  Scenario: Listener hears a differents messages
    When Sean shouts message below
      | "Free coffee!"      |
      | "Free Cokes!"       |
      | "Free Chocolates!"  |
      | "Free Sandwiches!"  |
    Then Lucy hears Sean's message

  Scenario Template: Listener hears a different message
    Given Lucy is located <distance> metres from Sean
    When Sean shouts <message>
    Then Lucy hears Sean's message
    Examples:
      | distance | message        |
      | 15       | "Free coffee!" |
      | 10       | "Free Cokes!" |
      | 12       | "Free Chocolates!" |
      | 13       | "Free Sandwiches!" |

