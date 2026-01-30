Feature: Handle Dynamic table

Scenario:
	When user opens the url "https://the-internet.herokuapp.com/tables"
	Then count the number of tables
	And count the number of rows
	And count the numbers of cells
	And display the data of fourth row
	And capture the dynamic screenshot