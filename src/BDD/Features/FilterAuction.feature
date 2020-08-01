Feature: searching for the right equipment
  Scenario: the user selects the product according to the filters used

    Given  as a user I opened page "https://allegro.pl/"
    When agreement window appears
    Then close agreement window
    And  choose department Elektronika
    And  choose category Komputery
    And choose printer categories and scanners
    And close Kurier w allegro popup if visible
    And selects filter auction
    And click the first of the promoted offers
    Then button Kup teraz is visible
