@Hrmorange
Feature: User able to login OrangeHRM site 
Scenario: User sucessfully login to orange hrm 
	Given User visit Orange HRM home page 
	When User type Username 
	And User also type Password 
	Then User click on the login button 
	And User verify Welcome screen