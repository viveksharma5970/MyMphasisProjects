Feature: Money Transfer
	In order to move money between my accounts
	As a bank customer
	I want to securly transfer funds
	
# Rule 1: A business cpnstraint

Rule: Customer must have sufficient funds
	To prevent overdrafts
	Funds should be validated before a tranfer is initaited

		Scenario Outline: Transferring an amount less than the balance
			Given I have $<check_balance> in my checking account
			And I have $<saving_balance> in my savings account
			When I transfer $<transaction_amount> from checking to savings
			Then my checking account balance should be $<final_amount>
			And my savings account balance should be $<final_amount>
		
		Scenario Outline: Transferring an amount greater than the balance (failure case)
			Given I have $100 in my checking acoount
			When I attemp to tranfer $150 from checking to savings
			Then the transfer sould be rejected
			And I should see an error message "Insufficient funds"
			And my checking account balance should remain $100
			
# Rule 2: Another business constraint

Rule: Maximum daily transfer limit applies
	To prevent fraud
	Transfer cannot exceed a total of $2000 in one day
	
Examples: Sufficient Funds
		| check_balance | saving_balance | transaction_amount | final_amount |
		| 100           | 0              | 50                 | 50           |