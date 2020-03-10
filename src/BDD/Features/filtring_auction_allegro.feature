Feature: searching for the the right equipment
  Scenario: the user selects the product according to the filters used

    Given  as a user I open the page "https://allegro.pl/"
    When the consent window appears
    Then close consent window
    And  choose departments Elektronika
    And  choose categories Komputery
    And choose printer and scaners categories
    And selects filter auction
    And close kurier information if is invisile
    And click the first of the offers
    Then button kup teraz is not visible
