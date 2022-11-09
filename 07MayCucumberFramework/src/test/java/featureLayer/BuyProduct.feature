Feature: Buy Product 

Background: 
Given User should open browser 
			And hit the url 
	
Scenario: Buy Samsung galaxy s6 product 
Given user is on home page 
When user click on Phones 
	And click on Samsung galaxy s6
	And click on add to cart
Then shows Product added text on popup 
	And click on Ok button of popup 
	
#----------------------------------------------

Scenario: Buy Nokia lumia1520 product 
Given user is on home page 
When user click on Phones 
	And click on Nokia lumia1520
	And click on add to cart
Then shows Product added text on popup 
	And click on Ok button of popup 