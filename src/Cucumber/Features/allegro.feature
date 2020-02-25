Feature: finding the right equipment
  Scenario:the user choosing the appropriate options receives the search result

    Given  as a user I opened page "https://allegro.pl/"
    When choose categories for electronics
    And I choose categories computers
    And I choose printer categories and scanners
    Then I click the first of the promoted offers
    Then I click buy now
    Then login page appears