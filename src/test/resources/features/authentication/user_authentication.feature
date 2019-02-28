@Authentication 
Feature: User authentication 
	As an analyst, I want to access the application using valid credentials
	so that I can perform my work securely.
	
@ShouldPass
Scenario: Authenticate user with valid credentials 
	Given the user is a regular user of the application with a valid credential 
	When  the user logins the website 
#	Then  the user should be presented with a landing page 
	
#Scenario Outline: Reject invalid user login attempt 
#	Given the user is a regular user of the application with an invalid credential as "<username>" and "<password>" 
#	When  the user logins the website 
#	Then  the user should be denied access 
#	Examples: 
#		| username  | password      |
#		| Userxxx   | WrongPassword |
#		| WrongUser | Passxxx       |
