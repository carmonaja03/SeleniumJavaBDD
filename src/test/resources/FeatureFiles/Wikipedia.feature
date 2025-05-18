Feature: Wikipedia testing
  I want to use this template for my feature file

  @TestWiki
  Scenario: This is a test to open wikipedia
    Given user navigates to wikipedia home page
    And user "wikiUser" input "search_text" on the search field
    Then user validates that "Hello" is displayed