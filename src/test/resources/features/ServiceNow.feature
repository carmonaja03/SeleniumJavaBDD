@tag
Feature: ServiceNow API test Demo
  I want to use this template for my feature file

  Background: User generates token for Authorisation
    Given  I am an authorized user

  @TestGETAll
  Scenario: Verify client is able to perform GET call on a given end point
    Given I set the user service api endpoint
    When User makes a GET call to the endpoint "/users"
    Then The list of users should be populated
    And check the status code to be 200


  @TestAddUser
  Scenario: Verify if client is able to add a user
    Given I set the user service api endpoint
    When User makes a POST call on "/users"
    Then User should be added
    And check the status code to be 201

  @TestGetUser
  Scenario: Verify if the client is able to get the existing user
    Given I set the user service api endpoint
    When User makes a GET call to the endpoint "/users/1"
    Then Individual user should be populated
    And check the status code to be 200

  @TestEditUser
  Scenario: Verify if client is able to edit a user
    Given I set the user service api endpoint
    When User makes a PUT call on "/users/1"
    Then User should be Edited
    And check the status code to be 200

  @TestDeleteUser
  Scenario: Verify if client is able to delete a user
    Given I set the user service api endpoint
    When User makes a DELETE call on "/users/id"
    Then User should be deleted and status code should be 204

