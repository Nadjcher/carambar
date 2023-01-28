@addCodePromo
Feature: Buy promotion product with code promotion

  Scenario Outline: 
    Given the user go to "home" page
    And User decline all coockies
    When User connect by tap on sign in button
    Then User refer to "connexion" page and enters "<email>" "<password>"
    Then User back "home" page by click in image logo
    Then User tap on promotion link to return "Promotions" page
    Then User tap on command the first product left and command
    Then User confirm the command
    Then User fill in the buy product and add "<codepromotion>"
    Then A success message appear 

    Examples: 
      | email               | password  | codepromotion | prenom | nom | adresse      | codepostal | ville     | pays   | telephone  |
      | johndoe009@yahoo.com| Admin123* | CADO23        | John   | Doe | 66 rue libre |      13001 | Marseille | France | 0605122244 |
