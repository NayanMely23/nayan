@Cherrydresses
Feature: Verify total price inclouding shipping 
Scenario: User able to add second highest dress and see total price 
	Given User go to automationpractice site 
	When User click on the dress tab 
	And User capture all dress price from resultset 
	When User add to cart the second highest price dress
	Then User verify total price including shipping