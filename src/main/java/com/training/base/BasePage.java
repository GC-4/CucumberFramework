package com.training.base;

import java.util.HashMap;
//import java.util.Set;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;


public class BasePage {
	
	WebDriver driver;
	public HashMap<String, By> ObjRep = new HashMap<String, By>();
	SoftAssert softassert = new SoftAssert();
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	//We are entering key value pair in hashmap
	public void addObject(String logicalName, By by) {
		ObjRep.put(logicalName, by);
	}
	
	public void enterIntoTextBox(String logicalName, String InputData) {
		WebElement element= getWebElement(logicalName);
		enterIntoTextBox(element,InputData);	
		System.out.println("Pass: Data entered in "+ logicalName+ " Text Box");
	}
	
	

	public void clickCheckBox(String logicalName) {
		WebElement element = getWebElement(logicalName);
		clickCheckBox(element);	
	}
	
	

	public void clickonButton(String logicalName) {
		WebElement element = getWebElement(logicalName);
		clickonButton(element);	
	}
	
	
	public void clearTextBox(String logicalName) {
		WebElement element = getWebElement(logicalName);
		clearTextBox(element);
	}

	
	public void selectOptionFromDropDown(String logicalName, String option) {
		WebElement element = getWebElement(logicalName);
		selectOptionFromDropDown(element,option);
	}
	
	
	public void confirmTextBoxData(String logicalName, String inputData) {
		WebElement element = getWebElement(logicalName);
		confirmTextBoxData(element,inputData);
	}
	
	public void isSelectedCheckBox(String logicalName, String checkbox) {
		WebElement element = getWebElement(logicalName);
		isSelectedCheckBox(element,checkbox);
	}

	public void clickonLink(String logicalName) {
		WebElement element = getWebElement(logicalName);
		clickonLink(element);
	}
	
	public void varifyPage(String expPageTitle) {
		String actualTitle = driver.getTitle();
		varifyPage(actualTitle, expPageTitle);
	}
	
	public void varifyMessage(String logicalName, String expMessage) {
		WebElement element = getWebElement(logicalName);
		varifyMessage(element, expMessage);
	}
	
	public void closeChildWindow(String logicalName) {
		
	/*
	 * Set<String> getAllWindows=driver.getWindowHandles(); String[]
	 * window=getAllWindows.toArray(new String[getAllWindows.size()]);
	 * driver.switchTo().window(window[1]).close(); }
	 */
	String pWindow = driver.getWindowHandle();
	
	for (String winHandle : driver.getWindowHandles())
	{ 
		driver.switchTo().window(winHandle); 
		String winTitle = driver.getTitle(); 
		if(winTitle.contains(logicalName)) { 
			System.out.println(winTitle);
			driver.close();
		}
	} 	
}
	
	public void acceptAlert() {
		driver.switchTo().alert().accept();	
	}
	
	public void varifyDropDownOption(String logicalName, String option) {
		WebElement element = getWebElement(logicalName);
		varifyDropDownOption(element,option);
	}
	

	public void varifyTextBoxData(String logicalName, String expData) {
		WebElement element = getWebElement(logicalName);
		varifyTextBoxData(element,expData);
	}
	
	
	public void selectRadioButton(String logicalName, String btnTitle) {
		WebElement element = getWebElement(logicalName);
		selectRadioButton(element,btnTitle);
	}

	public void varifyTab(String logicalName, String expTabName) {
		WebElement element = getWebElement(logicalName);
		varifyTab(element,expTabName);
	}
	
	public void varifyDropDownOptions(String logicalName, String option0, String option1, String option2,
			String option3, String option4) {
		WebElement element = getWebElement(logicalName);
		varifyDropDownOptions(element,option0,option1,option2,option3,option4);
	}
	
	public void isDisplayed(String logicalName) {
		WebElement element = getWebElement(logicalName);
		isDisplayed(element);
	}
	
	
	public void switchToChildWindow() {
		int i = 1;
		for (String winHandle : driver.getWindowHandles())
		{ 
			driver.switchTo().window(winHandle); 
			System.out.println(i + " "+ winHandle);
			i++;
			}
	}
	

	

	

	/*-------------------------------------------------------------*/
	// Here we are getting value from hashmap. 
	private WebElement getWebElement(String logicalName) {
		By by = ObjRep.get(logicalName); // HashMap code: get(key). Putting it in 'by' object. Return type of By is by
		WebElement element = driver.findElement(by);//Here the driver is getting that element from website 
		waitforElement(element);	
		return element;
	}
	
	private void enterIntoTextBox(WebElement element, String inputData) {// example of Method overloading and abstraction. 
		waitforElement(element);										// I don't know how this is abstraction. Ask Jnanesh
		element.sendKeys(inputData);
	}
	
	private void clearTextBox(WebElement element) {
		waitforElement(element);										// I don't know how this is abstraction. Ask Jnanesh
		element.clear();
	}
	
	private void waitforElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.visibilityOf(element));	
	}
	
	private void waitforClickable(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.elementToBeClickable(element));	
	}
	
	
	
	private void waitForTitle(String title){
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.titleContains(title));	
	}
	
	private void clickonButton(WebElement element) {
		waitforElement(element);
		element.click();
		System.out.println("Pass: Button clicked" );
		
	}

	private void clickCheckBox(WebElement element) {
		waitforElement(element);
		element.click();
	}

	private void clickonLink(WebElement element) {
		waitforElement(element);
		element.click();
	}

	private void selectOptionFromDropDown(WebElement element, String option) {
		waitforElement(element);
		element.click();
		
	}

	private void confirmTextBoxData(WebElement element, String inputData) {
		waitforElement(element);
		System.out.println("checking text box entry: " + element.getText());
	}

	private void isSelectedCheckBox(WebElement element, String checkbox) {
		waitforElement(element);
		if(element.isSelected()){
			System.out.println("Pass: " + checkbox + "is selected");}
		else{
			System.out.println("Fail: " + checkbox + "is not selected");}
	}

	
	private void varifyPage(String actualTitle, String expPageTitle) {
		if (actualTitle.contains(expPageTitle))
		{
			System.out.println("Pass: Correct Page reached");
		}
	}

	
	private void varifyMessage(WebElement element, String expMessage) {
		String actMessage = element.getText();
		if (actMessage.contains(expMessage))
		{
			System.out.println("Pass: Correct message displayed");
		}
	}

	
	private void varifyDropDownOption(WebElement element, String option) {
		Select c = new Select(element);
	
		List<WebElement> list = c.getAllSelectedOptions();
		 for (WebElement ddOptions : list) { 
			  System.out.println("The selected option is: " + ddOptions.getText()); 
		 }
		}

	private void varifyDropDownOptions(WebElement element, String option0, String option1, String option2,
			String option3, String option4) {
		
	}
	
	
	
	
	

	private void varifyTextBoxData(WebElement element, String expData) {
		//String actData = element.getAttribute("value");
		String actData = element.getText();
		if (actData.contains(expData)) {
			System.out.println("Pass: " + actData + " is displayed in Text Box");
		}
		else
			System.out.println("Fail: " + actData + " is not displayed in Text Box");
	}

	
	private void varifyTab(WebElement element, String expTabName) {
		//SoftAssert softassert = new SoftAssert();
		String actTabName = element.getText();
		softassert.assertTrue(actTabName.contains(expTabName));
		//Assert.assertEquals(actTabName, expTabName);
		if (actTabName.contains(expTabName)) {
			System.out.println("Pass: " + actTabName + " is displayed" );
		}
		else
			System.out.println("Fail: " + actTabName + " is not displayed");
	}

	
	private void selectRadioButton(WebElement element, String btnTitle) {
		if (element.isSelected())
		System.out.println("Pass: "+btnTitle + " is selected" );
		else {
			element.click();
			System.out.println("Pass: "+btnTitle + " is selected" );}
	}

	

	private void isDisplayed(WebElement element) {
		if(element.isDisplayed()){
			System.out.println("Table is displayed");}
		else{
			System.out.println("Table is not displayed");}
		
	}

	

	
	
	
	
	
	

	
	

	
	

	

	
	
	
}

	

	

