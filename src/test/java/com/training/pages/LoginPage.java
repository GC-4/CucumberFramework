package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class LoginPage extends BasePage{
	
	static WebDriver driver;
	
	public LoginPage() {
		super(driver=BaseTest.getDriver());
	//Method which accepts String , By byobj 
	addObject("Username", By.id("username"));
	addObject("Password", By.id("password"));
	addObject("RememberMe", By.id("rememberUn"));
	addObject("Login", By.name("Login"));
	addObject("userMenu", By.xpath("//span[@id='userNavLabel']"));
	addObject("DevConsole", By.xpath("//a[@title='Developer Console (New Window)']"));
	addObject("Logout", By.xpath("//a[contains(text(),'Logout')]"));
	addObject("forgotPWD", By.xpath("//a[@id='forgot_password_link']"));
	addObject("UsernameUN", By.id("un"));
	addObject("UsernameRemember", By.id("idcard-identity"));
	addObject("Continue", By.id("continue"));
	addObject("loginError", By.id("error"));
	addObject("username", By.id("username"));
	
	//User Menu Drop Down TC 5
	addObject("UserMenuDropDown", By.id("userNavLabel"));
	
	
	
	// Account Tab - New Account
	addObject("Accounts", By.id("Account_Tab"));
	addObject("New", By.xpath("//input[@title='New']"));
	addObject("AccountName", By.id("acc2"));
	addObject("type", By.id("acc6"));
	addObject("CustPriority", By.id("00N5g00000bxN5p"));
	addObject("AccSave", By.xpath("//input[@ value = ' Save ']"));
	
	// Account Tab - New View
	addObject("CreateNewView", By.xpath("//a[normalize-space()='Create New View']"));
	addObject("VName", By.id("fname"));
	addObject("UniqueVName", By.id("devname"));
	addObject("ViewSave", By.xpath("//input[@name = 'save']"));
	
	// Account Tab - Edit View
	addObject("ViewDD", By.id("fcf"));
	addObject("ViewEdit", By.xpath("(//a[contains(text() , 'Edit')])[1]"));
	addObject("FilterFieldDD", By.id("fcol1"));
	addObject("FilterOpDD", By.id("fop1"));
	addObject("FilterValue", By.id("fval1"));
	addObject("NewAccountDD", By.xpath("//select[@class = 'title']"));
	
	// Account Tab - Merge Accounts
	addObject("MergeAccounts", By.xpath("//a[contains(text(), 'Merge Accounts')]"));
	addObject("FindAcc", By.id("srch"));
	addObject("FindAccounts", By.xpath("//input[@value = 'Find Accounts']"));
	addObject("RadioB0", By.id("cid0"));
	addObject("RadioB1", By.id("cid1"));
	addObject("Next", By.xpath("(//input[@value = ' Next '])[2]"));
	addObject("Account1", By.xpath("//table[@class = 'mergeEntity']/tbody/tr/th[1]"));
	addObject("Account2", By.xpath("//table[@class = 'mergeEntity']/tbody/tr/th[2]"));
	addObject("Merge", By.xpath("//div[@class='pbTopButtons']//input[@title='Merge']"));
	addObject("MergedAcc", By.xpath("//table[@class = 'list']/tbody/tr[2]/th"));
	addObject("MergedAccView", By.id("hotlist_mode"));
	
	
	//Account Tab - Account with activity >30 days
	addObject("MoreThan30Days", By.partialLinkText("activity > 30 days"));
	addObject("DateField", By.id("ext-gen20"));
	addObject("CreatedDate", By.xpath("//div[contains(text(), 'Created Date' )]"));
	addObject("From", By.id("ext-gen152"));
	addObject("FromToday", By.xpath("//table[@id = 'ext-comp-1112']/tbody/tr[2]/td[2]/em/button"));
	addObject("To", By.id("ext-gen154"));
	addObject("ToToday", By.xpath("//table[@id = 'ext-comp-1114']/tbody/tr[2]/td[2]/em/button"));
	addObject("AccountsTable", By.id("ext-gen263"));
	addObject("unSave", By.id("ext-gen49"));
	addObject("ReportName", By.id("saveReportDlg_reportNameField"));
	addObject("ReportUniqueName", By.id("saveReportDlg_DeveloperName"));
	addObject("SaveAndRun", By.id("ext-gen332"));
	
	
	
	
	
	
	
	
	
	
	
	
	
			
	
	
		
		
			
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//addObject("CreateNewView", By.partialLinkText("Create New View"));
	//addObject("CreateNewView", By.xpath("//a[contains(text(), 'Create New View')]"));
	//addObject("CreateNewView", By.xpath("//table[@class = 'outer']/tbody/tr/td[2]/div[2]/form/div/span/span[2]/a[2]"));
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
