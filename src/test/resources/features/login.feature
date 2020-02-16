#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
Feature: Signin
  I want to use this template for my feature file

  Background: User naviagates to app URL
    Given I am on login page "https://www.toolsqa.com/automation-practice-form/"
  @sanity
  Scenario: signin with valid credential
    When I enter firstname "dharitree"
    And I enter lastname "sahoo" 
 

  @sanity
  Scenario: signin with valid credential
    When I enter firstname "dharitree1"
    And I enter lastname "sahoo1" 
 



