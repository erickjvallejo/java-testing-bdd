Feature: the version can be retrieved
  Scenario: client makes call to GET /api/version
    Given we have a restful service
    When the client calls "/api/version"
    Then the client receives status code of 200
    And the client receives server version "1.0"
