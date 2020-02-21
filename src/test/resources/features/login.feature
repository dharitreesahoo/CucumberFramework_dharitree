#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
Feature: Signin
  I want to use this template for my feature file

  Background: User naviagates to app URL
    Given I am on login page "https://s1.demo.opensourcecms.com/s/44"
  @sanity
  Scenario: signin with valid credential 
    When I enter username "opensourcecrm" and password "opensourcecrm" 
    

 



