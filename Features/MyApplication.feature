Feature: Smoke Test for Login

Scenario: Test login with valid credentials
Given Open Firefox and start application
When I enter valid user name and valid password
Then user able to login successfully
