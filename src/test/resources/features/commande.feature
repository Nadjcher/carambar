@BuyProduct
Feature: Buy promotion product with code promotion

  Scenario Outline: 
    Given the user is on the "home" page
    And User click to refuse all coockies
    When User clicks sign in button
    Then User on "connexion" page and enters "<email>" "<password>"
    Then User return "home" page by click in image logo
    Then click on promotion link to return "Promotions" page
    Then Click to command the first product left and command
    Then validate the command
    Then Complete the buy product and add "<codepromotion>"
    Then User complet command by add "<prenom>" "<nom>"  "<adresse>" "<codepostal>" "<ville>" "<pays>" "<telephone>"

    Examples: 
      | email                | password  | codepromotion | prenom | nom | adresse      | codepostal | ville     | pays   | telephone  |
      | johndoe019@yahoo.com | Admin123* | BONBON22      | John   | Doe | 66 rue libre |      13001 | Marseille | France | 0605122244 |
