Feature: Application Login

Background:

When Launch the browser from config variables
And Hit the home page of banking page
#// Before -> Background -> ScenarioExecution -> After


@RegressionTest @NetBanking
Scenario: User page default login

Given User is on Login page screen
When  User is login into application with "user" and password "0412" 
Then Home page is displayed
And Perspective menu is displayed


@SmokeTest @RegressionTest @Mortgage
Scenario Outline: User page default login

Given User is on Login page screen
When  User is login into application with "<username>" and password "<password>" 
Then Home page is displayed
And Perspective menu is displayed

Examples: 
	| username				|	password	|
	|	admin						|	asd123		|
	| signaloperator	|	asdfg1235	|
	
	