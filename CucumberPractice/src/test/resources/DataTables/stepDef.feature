Feature: Data table

Scenario: Add multiple users
	Given the following user exists
	#| cow |
	#| dog |
	#| cat |
	| firstName | lastName | email |
	| john | doe | john.doe@example.com |
	| jane | smith | jane.smith@example.com |