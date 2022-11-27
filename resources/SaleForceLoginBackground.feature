Feature: Login Scenarions of Saleforce Application

Background: Run the step before every scenario
Given User Launch the saleforce application

Scenario: Login into saleforce with valid username and password
When user enter username "jnanesh.m@tekarch.com"
And user enter password "Test@123"
And Click on RememberMe
Then Click on login button 

Scenario: Login into saleforce with invalid username and password
When user enter username "jnanesh.m1@tekarch.com"
And user enter password "Test@123"
And Click on RememberMe
Then Click on login button 