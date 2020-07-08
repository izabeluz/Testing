Feature: looking for the right sport footwear
  Scenario: the user is looking for sports footwear by choosing the right filters

    Given  I opened page "https://allegro.pl/"
    When the message apperas
    Then close message window
    Then choose moda section
    Then choose ONA category
    And  choose obuwie category
    Then user choose sportowe
    Then choose cena powyżej 350
    And choose rozmiar 40
    And choose kolor czarny
    And choose marka adidas
    And choose stan nowe
    Then user select filter popularność:największa
