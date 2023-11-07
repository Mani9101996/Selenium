Feature: Test the login functionaly of OrangeHRM
Scenario: Test the valid login
Given user is on login page
When user enters username and password
And click on login button
Then user should land on homepage