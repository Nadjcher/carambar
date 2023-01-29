@UserLogin
Feature: user login

  Scenario Outline: verifier lgoin with valide mail et password
    Given user navigated to "login" page carambar
    And User reject coockies
    When User enters email as "<email>"  and password as  "<password>"
    And User submit on Connectetoi
    Then user is redirected to the "home" page with his "<prenom>" and "<nom>"

    Examples: 
      | email              | password  | prenom | nom |
      | johndoe@hotmail.fr | 1234Admin* | john   | doe |
