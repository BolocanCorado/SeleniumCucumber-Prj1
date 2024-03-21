Feature: Application Login

Background:
Given setup the entries in database
When Launch the browser from config variables
And Hit the home page of banking page


@RegressionTest
Scenario: Admin page default login

Given User is on Login page screen
When User is login into application with "admin" and password "1234"
Then Home page is displayed
And Perspective menu is displayed
  

@RegressionTest
Scenario: User page default login

Given User is on Login page screen
When  User is login into application with "user" and password "0412" 
Then Home page is displayed
And Perspective menu is displayed


@SmokeTest @RegressionTest
Scenario Outline: User page default login

Given User is on Login page screen
When  User is login into application with "<username>" and password "<password>" 
Then Home page is displayed
And Perspective menu is displayed

Examples: 
	| username				|	password	|
	|	admin						|	asd123		|
	| signaloperator	|	asdfg1235	|
	
	
@SmokeTest 
Scenario: User page default default sign up

Given User is on Practice landing page
When  User signup into application
|	corado	|
|	marius	|
|	corado@gmail.com	|
|	421421421	| 
Then Home page is displayed
And Cards are displayed