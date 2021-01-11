Feature: On the index portal, as a user i can reach and see most of the table data properly placed 
	
Scenario:  Different sets of table data can retrieve in different way  
	
	Given I am on HomePage where title is React App
	When I Click on Toggle Report Data Button, Hiden Table will Displayed
	Then I can check total numbers of row and columns 
	Then I can check available data in the first row
	Then I can check available data in the first column
	And I can close the browser		 