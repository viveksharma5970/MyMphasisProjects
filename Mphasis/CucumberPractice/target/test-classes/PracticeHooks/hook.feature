Feature: Login Credentials

Background:
	Given user launches the browser
	And user navigates to the application URL
	
Scenario: Validate Login with valid credentials
	Given user enters email "mphasis@gmail.com"
	And user enters password "mphasis2026"
	And user clicks on the login button
	Then user should be logged in successfully
	
Scenario: Validate Login with invalid credentials
	Given user enters email "Selenium@gmail.com"
	And user enters password "Selenium2026"
	And user clicks on the login button
	Then user will get "error message"