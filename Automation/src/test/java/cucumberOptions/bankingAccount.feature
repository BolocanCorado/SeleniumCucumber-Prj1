Feature: Banking Account 


Scenario: Total Amount 

Given I have an XML file named "pain.xml"
When I extract the total amount "GrpHdr"
Then check total amount "CtrlSum"

Scenario: Debtor amount is equal to the sum of all credits

Given I have an XML file named "pain.xml"
When I extract the total amount "GrpHdr"
Then check total amount "CtrlSum"
And I extract the amount of "Peter Parker"
And I extract the amount of "Carl White"
And I extract the amount of "Frank Black"
Then Check total amount is correct
  