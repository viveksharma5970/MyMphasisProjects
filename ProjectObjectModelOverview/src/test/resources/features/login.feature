Feature: Login functionality

Scenario: Valid Login
	Given user is on login page
	When user enters email "user@gmail.com"
	And user enters password "password123"
	And user clicks on login button
	Then user should be logged in successfully