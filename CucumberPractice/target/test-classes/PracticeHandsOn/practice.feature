Feature: Demo automation testing

Background: 
	Given Invoke the chrome browser with selenium webdriver
	And get the url "https://demo.automationtesting.in/Register.html"
	
Scenario Outline: Automating form field and submit
	Given fill firstName - <FIRSTNAME>
	And fill lastName - <LASTNAME>
	And fill address - <ADDRESS>
	And fill email - <EMAIL>
	And fill phone - <PHONE>
	
	When I enter all the details click submit button
	Then form should be submited
	
	Examples:
	| FIRSTNAME | LASTNAME | ADDRESS | EMAIL | PHONE |
	| "John" | "Smith" | "Park Avenue" | "john@gmail.com" | "abc" |