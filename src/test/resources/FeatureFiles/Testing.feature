#Author: your.email@your.domain.com

@Parent
Feature: validate DemoQA site

  @Demotest
  Scenario: Text Box validation
    Given I launch DemoQA website
    When i enter user name 
    
    @outline @tag123
  Scenario Outline: Text Boxes with outline  
   Given I launch DemoQA website
    When i enter "<user name>" as Full name
    And i enter "<email>" as email
    
    Examples:
    |user name|email|
    |Ranjith|12345@gmail.com|
     |test|1234test5@gmail.com|
    
    
  