Feature: looking for the right sport footwear
  Scenario: the user is looking for sports footwear by choosing the right filters

    Given  I opened page "https://allegro.pl/"
    When the message apperas
    Then close message window
    Then choose moda section
    Then choose ONA category
    And  choose obuwie category
    Then user choose sportowe
    Then user choose nowe
    And choose kup teraz
    Then user choose price powyżej 350
    Then user choose mark adidas
    Then user choose size 40
    And choose the color czarny

