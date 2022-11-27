Feature: Login Scenarions of Saleforce Application

Scenario Outline: Login into saleforce with valid username and password
Given User Launch the saleforce application
When user enter username "<username>"
And user enter password "<password>"
And Click on RememberMe
Then Click on login button 

Examples:
|username|password|
|gc@xyz.com|Myra@123|
|garima@xyz.com|huge@234|