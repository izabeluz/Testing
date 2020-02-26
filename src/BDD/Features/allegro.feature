Feature: finding the right equipment
  Scenario: the user choosing the appropriate options receives the search result

    Given  as a user I opened page "https://allegro.pl/"
    When choose categories for electronics
    And  choose categories computers
    And choose printer categories and scanners
    Then  click the first of the promoted offers
    Then  click buy now
    Then login page appears