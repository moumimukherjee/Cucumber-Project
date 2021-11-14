Feature: To Check To Do List

  Scenario: Check Login into Application Task Page
    Given User login into Task page
    When Task box is visible
    And click to Add
    Then List of Task added
