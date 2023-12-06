  Feature: Yahoo search functionality
  Agile story: As a user, when I am on the Yahoo search page
  I should be able to search anything and see relevant results

  Scenario Outline: Yahoo search result verification
    Given user is on the Yahoo search page
    When user searches for the "<term>" on Yahoo
    And user sees the "<term>" on the title
    And user clicks the first returned item on Yahoo
    Then user sees the "<term>" on the title
    Examples:
      | term |
      |Market|
      |Book  |
      |5     |
      |&     |

