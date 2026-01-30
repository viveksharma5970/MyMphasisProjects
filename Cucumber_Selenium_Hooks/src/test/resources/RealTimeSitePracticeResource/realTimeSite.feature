Feature: Real Time site testing

Scenario: Login
	Given user is on the login page
	When user enter username "standard_user" and password "secret_sauce"
	And user click signin button
	Then user should signin into portal
	Given user is on dashboard
	And user should get product list
	And user will search product list
	Then user will display and verify the lowest product