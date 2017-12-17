@register
Feature: User registration
in order to become a site member
As a site Visitor
I want to go to registration page, enter first name, last name, phone, email,

Scenario: Positive - user registration 

Given  user visit homepage
When   user click on register link
And   user enter user name, password, confirm password 
And   user click submit buttan
Then  user recieves a confirmation
And   user closes the browser
