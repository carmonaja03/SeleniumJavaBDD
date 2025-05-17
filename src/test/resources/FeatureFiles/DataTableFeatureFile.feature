#Author: your.email@your.domain.com

@tag
Feature: Title of your feature
  I want to use this template for my feature file

Background: launching bowser
Given I launch DemoQA website


  @DataTable
  Scenario: Text Box validation
    Then i validate below labels in the page
    |Email address|Password|
    When user enter inputs as per below header and value
    |Email address|Password|
    |123@gmail.com|1234ffds|
    |asfa@gmail.com|shiobad8873|
    
  
