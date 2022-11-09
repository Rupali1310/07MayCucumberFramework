Feature: Login Functionality

Scenario: Login to application 
Given User should open browser 
			And hit the url 
			And user is home page 
When user clicks on login 
			And entered valid username and password 
			And clicked on login button 
Then user is logged in 