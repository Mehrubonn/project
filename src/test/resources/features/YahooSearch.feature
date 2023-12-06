Feature: Bing search functionality
  Agile story: As a user, when I am on the Bing search page
  I should be able to search anything and see relevant results

  Scenario: Bing search result verification
    Given user is on the Bing search page
    When user searches for the term on Bing
    And user sees the term on the title
    And user clicks the first returned item on Bing
    Then user sees the term on the title