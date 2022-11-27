Feature: UserMenu Drop Down features

@TC5 @UserMenu
Scenario: Select UserMenu drop down


@TC6 @UserMenu
Scenario: Test My Profile option from UserMenu drop down


@TC7 @UserMenu
Scenario: Test My Settings option from UserMenu drop down



@TC8 @UserMenu
Scenario: Test Developers Console option from UserMenu drop down
Given User is on "LoginPage"
When User enter into text box "Username" "gc@xyz.com"
And User enter into text box "Password" "Myra@123" 
Then User Clicks on Button "Login"
When User Clicks on Button "userMenu"
And User Clicks on Button "DevConsole"
Then User closes the Child Window 


@TC9 @UserMenu
Scenario: Test logout option from UserMenu drop down
Given User is on "LoginPage"
When User enter into text box "Username" "gc@xyz.com"
And User enter into text box "Password" "Myra@123" 
Then User Clicks on Button "Login"
When User Clicks on Button "userMenu"
And User Clicks on Button "Logout"

