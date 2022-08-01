Feature: Create Note

  As a User
  I want to be able to create a note
  So I can save information I need

@Regression
  Scenario: Create a note with title and body
    Given I launch the note application
    When I tap on create note
    And I fill the title
    And I fill the body with text
    And I tap on save note
    Then the information should be stored