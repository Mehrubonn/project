Feature: Google search functionality
  Agile story: As a user, when I am on the Google search page
  I should be able to search anything and see relevant results

  Scenario Outline: Google search result verification
    Given user is on the Google search page
    When user searches for the "<term>" on Google
    And user sees the "<term>" on the title
    And user clicks the first returned item on Google
    Then user sees the "<term>" on the title
    Examples:
      | term |
      |Market|
      |Book  |
      |15    |
      |&     |
