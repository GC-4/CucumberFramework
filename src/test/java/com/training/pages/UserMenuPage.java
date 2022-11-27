package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class UserMenuPage extends BasePage{
	
	static WebDriver driver;
	
	public UserMenuPage() {
		super(driver=BaseTest.getDriver());
	//Method which accepts String , By by obj 
	addObject("Username", By.id("username"));
	addObject("Password", By.id("password"));
	addObject("RememberMe", By.id("rememberUn"));
	addObject("Login", By.name("Login"));
	addObject("userMenu", By.xpath("//span[@id='userNavLabel']"));
	addObject("DevConsole", By.xpath("//a[@title='Developer Console (New Window)']"));
	
	}
}
