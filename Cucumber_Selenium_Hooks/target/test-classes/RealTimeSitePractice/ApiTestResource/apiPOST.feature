Feature: test post method

Scenario: 
	Given user sets the baseURL "https://api.restful-api.dev"
	When user creates a new Post Object
	And response should verify user name "vivek"