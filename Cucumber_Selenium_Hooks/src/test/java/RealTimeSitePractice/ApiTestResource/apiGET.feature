Feature: Rest API Testing

Scenario: 
	Given user sets baseURL "https://api.restful-api.dev"
	When user creates a new Object
	Then status code should be 200
	And response should contain user name "Apple MackBook Pro 16"
	