Feature: User Authentication

	Background:
		Given I am on the login page
		And I have to registered user "testuser" with password "password123"
		
	Scenario: Successful login with valid credentials
		When I enter valid username and password
		Then I should be redirected to the homepage
	
	Scenario: Login fails with invalid password
		When I enter an invalid password
		Then I should see an error message
		
		""" this part is inactive 
				and for multiline comment
		"""