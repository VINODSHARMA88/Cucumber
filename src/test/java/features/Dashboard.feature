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

Feature: Dashboard features verificaiton
Description: Details verification of customer dashboard feature in the Smart Room application

  @tag1
  Scenario: Verify Profile pop up title
    Given User is on login  page
    When  Enter username,password and click login
    And customer Dashboard spage should display and check dashboard title
    Then Click profile link under setting and check pop up title
 

  
  