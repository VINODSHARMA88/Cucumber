#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template




Feature: Password customer login functionality verificaiton
Description: Details verification of customer in the Smart Room application

@Login
  Scenario: Verify user login the app with valid credentials
    Given User is on login  page
    When  Enter username,password and click login
    Then customer Dashboard spage should display and check dashboard title
  
 
 @Login
  Scenario: Verify logout functionality
    Given User is on login  page
    When  Enter username,password and click login
    And customer Dashboard spage should display and check dashboard title
    And Click logout button
    Then Check forgot password link in login page
   
  
  #Scenario: Verify user login the app with customer username and password
    #Given User is on login  page
    #When  Enter "f3jhonsmith_766@outlook.com","@Password10" and click login
    #Then customer Dashboard spage should display and check dashboard title
    #
    #
  #Scenario Outline: Verify user login from examples
   #
    #Given User is on login  page
    #When  Enter <username> and <Password> combination
    #Then customer Dashboard spage should display and check dashboard title
#
    #Examples: 
       #| username| Password  |
       #| f3jhonsmith_766@outlook.com  | @Password10 |
       #| f3jhonsmith_766@outlook.com  | @Password11 |
       #| f3jhonsmith_76446@outlook.com | @Password10 |
       #| f3jhonsmith_72226446@outlook.com | @Password122 |
    #
     