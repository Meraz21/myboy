Feature: As a user i am able to see and find the major functions of the TOP part on Index Home

Scenario Outline: Major functionality search from Component_1 

    Given I am on HomePage
    When I clear the set title Box
    Then I write a message or can put any value "<setValue>" 
    Then I click on Set Title Button
    Then I am able to see Entered value displayed on RIGHT side of the title TAG
    And I can close the browser.

    Examples: 
		| setValue        | 
		| I Love This Title|
		| I Have This Title|