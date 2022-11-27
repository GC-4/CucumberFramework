Feature: Login Features 

@smoke @story1
Scenario: Login with valid username and valid password
Given User is on "LoginPage"
When User enter into text box "Username" "jnanesh.m@tekarch.com" #passing logicalName(same name is in hashmap as key) and InputData
When User enter into text box "Password" "Test@123"
Then User Clicks on CheckBox "RememberMe"
Then User Clicks on Button "Login"

@regression @priority1 
Scenario: Login with valid username and Invalid password
Given User is on "LoginPage"
When User enter into text box "Username" "jnanesh.m@tekarch.com"
When User enter into text box "Password" "Test@1231"
Then User Clicks on CheckBox "RememberMe"
Then User Clicks on Button "Login"

