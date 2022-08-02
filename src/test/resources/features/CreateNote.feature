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

 # @Regression
  Scenario: Create a note with title, body and photo attached
    Given I launch the note application
    When I tap on create note
    And I fill the title
    And I fill the body with text
    And I add an image to the note
    And I tap on save note
    Then the information should be stored with the photo

  #@Regression
  Scenario: Create note with title only
    Given I launch the note application
    When I tap on create note
    And I fill the title
    And I tap on save note
    Then the note should be saved with title only

  #Regression
  Scenario: Create note with body only
    Given I launch the note application
    When I tap on create note
    And I fill the body with text
    And I tap on save note
    Then the note should be save with body only

  #@Regression
  Scenario: Create note without any content
    Given I launch the note application
    When I tap on create note
    And I tap on save note
    Then the note should not be saved






