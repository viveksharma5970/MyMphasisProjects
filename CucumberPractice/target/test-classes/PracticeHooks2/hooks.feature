Feature: form Registration
	
Scenario: 
	Given user enters username "john"
	And user enters on email "abcd"
	And user enters phone "abc"
	And user enters age "21"
	And user enters on password "abc"
	When user clicks on register
	Then user should registered
	
Examples: User details
	| username | email | phone | age | userpass |
	| "john" | "john@gmail.com" | "98765" | "26" | "john123" |