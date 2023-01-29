@creationCompteCarambar
Feature: user User Registration

  Background: Open home page
    Given I have navigated to the CarambarCo "home" page

  Scenario Outline: Création d un compte avec des informations valides
    When User refuse coockies
    And User clicks on connecte toi
    Then User directed to page "connexion"
    Then User enters "<firstname>" "<lastname>" "<email>" "<password>"
    And User clicks on register
    Then Redirected to page"home" and compt name with "<firstname>" "<lastname>"

    Examples: 
      | email                | firstname | lastname | password  |
      | johndoe019@yahoo.com | John      | Doe      | Admin123* |
