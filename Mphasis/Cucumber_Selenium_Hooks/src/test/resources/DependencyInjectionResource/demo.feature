Feature: Form submittion

Scenario Outline: 
	Given user form interface loaded
	When user enters firstName as <firstname>
	And user enters lastName as <lastname>
	And user enters jobTitle as <jobtitle>
	And user clicks on submit button
	Then form should be submitted
	
Examples: User inputs
| firstname | lastname | jobtitle |
| "John" | "Doe" | "Senior QA" |
| "Jane" | "Smith" | "Developer" |