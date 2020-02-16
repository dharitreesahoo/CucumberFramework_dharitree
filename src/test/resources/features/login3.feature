#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
Feature: Signin
  I want to use this template for my feature file

  Background: User naviagates to app URL
    Given I am on login page "http://automationpractice.com"
    Then I should see Hompage


  @sanity
  Scenario: signin with valid credential
    When I enter user name "admin"
    And I enter password as "password" 
    And I Click on login button
    Then I should see the application home page




