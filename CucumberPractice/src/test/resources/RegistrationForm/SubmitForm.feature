Feature: Submit Form

Scenario Outline: Have to fill the fields and submit the form

Given get the userName field
When I enter <userName>
Then name of user should visible

Given get the userEmail field
When I enter <userEmail>
Then email of user should visible   

Given get the userPhone field
When I enter <userPhone>
Then phone number of user should visible

Given get the userAge field
When I enter <userAge>
Then age of user should visible

Given get the userPassword field
When I enter <userPassword>
Then password of user should visible

Given get the userCity field
When I enter <userCity>
Then city of user should visible

Examples: User details
	| userName | userEmail | userPhone | userAge | userPassword | userCity |
	| "John" | "john@gmail.com" | "9876543210" | "21" | "john123" | "pune" |
	| "Doe" | "doe@gmail.com" | "74788182882" | "22" | "doe123" | "delhi" |