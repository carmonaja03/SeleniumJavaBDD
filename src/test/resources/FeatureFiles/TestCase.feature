#Author: your.email@your.domain.com
@tag
Feature: Title of your feature
  I want to use this template for my feature file

#  Background: launching browser
#    Given I want to launch CRM Application "edge"

  @TestWiki
  Scenario: Title of your scenario
    Given I want to launch CRM Application "chrome"
    When User enters field "First Name1:" as "First Name" in text field
    #And User selects "INDIA" from "Country:" dropdown
    #And User click on "submit123" label
    #And User click on "submit" label

  @Test001
  Scenario: Registration page
    #Given I want to launch CRM Application "chrome"
    When User enters field "First Name:" as "First Name" in text field
    And User selects "INDIA" from "Country:" dropdown
    Then Verify visibility of labels in the page as per below Datatable
      | First Name: | Last Name: | Phone: | Mailing Information |
    #And Enter values and in text field as per below header and value
    #| First Name: | Last Name: | Phone: |
    #| firstname   | lastname   |   1234 |
    When User click on "submit" label

  #Methods implemented can be used as per request
  @Test12
  Scenario: Frame and alert handling
    #Given I want to launch CRM Application "chrome"//http://demo.guru99.com/test/guru99home/
    When i switch my cursor to frame "a077aa5e"
    And i switch my cursor to default content

  @Test12
  Scenario: Frame and alert handling
    And i switch to Alert and click on accept
    Then i capture message from alert and verify "Do you really want to delete this Customer?"
    Then wait for "10" seconds to synch page

  @TestOutline
  Scenario Outline: Registration page
    #Given I want to launch CRM Application "chrome"
    When User enters field "Customer ID" as "<Customer ID>" in text field
    When User click on "submit" label
    And i switch to Alert and click on accept

    Examples: 
      | Customer ID |
      | asd123      |
      | 123ert      |

  #Scenario: Check Login
    #Given I want to launch CRM Application "chrome"
   # When User enters field "Username" as "Username" in text field
    #And User enters field "Password" as "Password" in text field
   # And User click on "submit" label by xpath
    
    #Scenario: Check dropdown functionality
    #Given I want to launch CRM Application "chrome"
    #And User selects "White" from "Select Option" dropdown
    #And User selects "Green" from "Select Option" dropdown

