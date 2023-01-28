@addPromotionToPanier
Feature: Add promotion to panier

Scenario: select a promotion product and add them to basket
    Given User begin by visiting the "home" page
    And refuse the coockies
    And User click on promotions 
    And User on "Promotions" page
    When User select the first lift product
    And user add the product to panier
    Then User get the command in the basket in "panier" page

