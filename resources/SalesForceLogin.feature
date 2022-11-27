Feature: Login Features 

@TC1 @login
Scenario: Login with valid username and no password
Given User is on "LoginPage"
When User enter into text box "Username" "jnanesh.m@tekarch.com" 
# passing logical name (which is stored with the exact word in hashmap) and inputData
When User clear text box "Password"
Then User Clicks on Button "Login"

@TC2 @login
Scenario: Login with valid username and valid password
Given User is on "LoginPage"
When User enter into text box "Username" "gc@xyz.com"
When User enter into text box "Password" "Myra@123"
Then User Clicks on Button "Login"

@TC3 @login
Scenario: Test the remember username check box 
Given User is on "LoginPage"
When User enter into text box "Username" "gc@xyz.com"
When User enter into text box "Password" "Myra@123"
Then User Clicks on CheckBox "RememberMe"
Then User Clicks on Button "Login"
When User Clicks on Button "userMenu"
And User Clicks on Button "Logout"
#And selects option from DropDown "userMenu" "Logout"
Then User confirms data in text box "UsernameRemember" "gc@xyz.com"
And User confirm if CheckBox is selected "RememberMe" "Remember Me"


@TC4A @login
Scenario: Test forgot password
Given User is on "LoginPage"
When User Clicks on link "forgotPWD" 
Then User varifies Title "Forgot Your Password"
Then User enter into text box "UsernameUN" "jnanesh.m@tekarch.com"
And User Clicks on Button "Continue"


@TC4B @login
Scenario: Login with invalid username and invalid password
Given User is on "LoginPage"
When User enter into text box "Username" "jnanesh1.m@tekarch.com"
Then User enter into text box "Password" "Test@1231"
And User Clicks on Button "Login"
Then User varifies text box data "username" "jnanesh1.m@tekarch.com"
Then User varifies message "loginError" "Please check your username and password" 

@TC5 @UserMenu
Scenario: Select UserMenu drop down
Given User is on "LoginPage"
When User enter into text box "Username" "gc@xyz.com"
Then User enter into text box "Password" "Myra@123"
And User Clicks on Button "Login"
Then  User varifies Title "Home Page"
Then User varifies message "UserMenuDropDown" "OMOM abcd"
And User Clicks on link "UserMenuDropDown"
Then User varifies options in DropDown "UserMenuDropDown" "My Profile" "My Settings" "Developer Console" "Switch to Lightning Experience" "Logout"


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
Then User closes the Child Window "Developer Console"
#And User varifies Title "Home Page"


@TC9 @UserMenu
Scenario: Test logout option from UserMenu drop down
Given User is on "LoginPage"
When User enter into text box "Username" "gc@xyz.com"
And User enter into text box "Password" "Myra@123" 
Then User Clicks on Button "Login"
When User Clicks on Button "userMenu"
And User Clicks on Button "Logout"


@TC10 @CreateAccount
Scenario: Goto accounts tab and create a new account
Given User is on "LoginPage"
When User enter into text box "Username" "gc@xyz.com"
And User enter into text box "Password" "Myra@123" 
Then User Clicks on Button "Login"
When User Clicks on link "Accounts"
Then User varifies Title "Accounts" 
When User Clicks on Button "New"
Then User varifies Title "Account Edit"
And User enter into text box "AccountName" "HCL"
And selects option from DropDown "type" "Technology Partner"
When selects option from DropDown "CustPriority" "High"
And User Clicks on Button "AccSave"
Then User varifies Title "Account: HCL"


@TC11 @CreateAccount
Scenario: Goto accounts tab and create new view
Given User is on "LoginPage"
When User enter into text box "Username" "gc@xyz.com"
And User enter into text box "Password" "Myra@123" 
Then User Clicks on Button "Login"
When User Clicks on link "Accounts"
Then User varifies Title "Accounts" 
When User Clicks on link "CreateNewView"
And User enter into text box "VName" "Nov21"
And User Clicks on Button "UniqueVName" 
When User Clicks on Button "ViewSave"


@TC12 @CreateAccount
Scenario: Goto accounts tab and edit view
Given User is on "LoginPage"
When User enter into text box "Username" "gc@xyz.com"
And User enter into text box "Password" "Myra@123" 
Then User Clicks on Button "Login"
When User Clicks on link "Accounts"
Then User varifies Title "Accounts" 
When selects option from DropDown "ViewDD" "Nov21"
And User Clicks on Button "ViewEdit" 
Then User varifies Title "Accounts: Edit View"
When User enter into text box "VName" "Nov21_Edited"
And selects option from DropDown "FilterFieldDD" "Account Name"
And selects option from DropDown "FilterOpDD" "contains"
When User enter into text box "FilterValue" "a"
And User Clicks on Button "ViewSave"
Then User varifies option in DropDown "NewAccountDD" "Nov21_Edited"


@TC13 @CreateAccount
Scenario: Goto accounts tab and merge two accounts
Given User is on "LoginPage"
When User enter into text box "Username" "gc@xyz.com"
And User enter into text box "Password" "Myra@123" 
Then User Clicks on Button "Login"
When User Clicks on link "Accounts"
Then User varifies Title "Accounts" 
When User Clicks on link "MergeAccounts"
And User enter into text box "FindAcc" "San"
And User Clicks on Button "FindAccounts"
When User selects Radio Button "RadioB0" "November14"
And User selects Radio Button "RadioB1" "November14"
And User Clicks on Button "Next"
Then User varifies Title "Merge My Accounts"
Then User varifies tab "Account1" "San"
Then User varifies tab "Account2" "San"
And User Clicks on Button "Merge"
And User accpets Alert Box
Then User varifies Title "Accounts: Home"
And selects option from DropDown "MergedAccView" "Recently Viewed"
 


















