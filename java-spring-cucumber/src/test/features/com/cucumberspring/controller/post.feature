#! Author: Erick J. Vallejo
Feature: post functionality

  Background:
    Given as user can create a new post
    And i have sent to post to be created with post id 1, title "My Title" and content "<h1>Hola</>"

  Scenario Outline: As a Customer I want to create a new post
    Given as user can create a new post
    And i sending post to be created with post id <post_id>, title <title> and content <content>
    Then i should be able to see my newly created post <post_id>, title <title> and content <content>
    Examples:
      | post_id | title         | content              |
      | 1       | "New title 1" | "New Post Content 1" |
      | 2       | "New title 2" | "New Post Content 2" |


  Scenario: search a post by different criteria
    Then i want to find by id 1
    And i should be able to see the title "My Title"
    And i see too the content "<h1>Hola</>"

#  Scenario: update a post
#    When i want to update the post id 1234
#    And ""
#    Then i should be able to see the title "My Title"
#    And i see too the content "<h1>Hola</>"

