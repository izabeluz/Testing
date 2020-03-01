Feature: finding the right equipment
  Scenario: the user choosing the appropriate options receives the search result

    Given  as a user I opened page "https://allegro.pl/"
    When agreement window appears
    Then close agreement window
    And  choose department Elektronika
    And  choose category Komputery
