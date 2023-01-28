@bonbonAcidulé
Feature: Add bonbon acidulé to panier

Scenario: buy a bonbon acidule and add them to basket
    Given User visit the "home" page
    And User denied the coockies
    And select bonbon acidulé
    And User can choose the product in "bonbons-acidules" page
    When User select the first bonbon acidulé
    And user validat the quantity and name of bonbons
    Then User find the command in the basket in "panier" page

