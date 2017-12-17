@login
Feature: As a admin login homepage

Scenario: login page positive scenario 

Given   Admin visit homepage
When  Admin enter username and password
And  Admin click login button
Then  Admin receives a confirmation
