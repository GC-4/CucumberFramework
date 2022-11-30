package com.training.steps;

import java.io.IOException;

//import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;
import com.training.pageFactory.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

public class Steps extends BaseTest{
	
	
	PageFactory pageFactory = new PageFactory();//created instance of page factory
	BasePage page; // creating object of BasePage to call methods from BasePage
	
	@Before
	public void setup() throws IOException {
		launchapplication();
	}
	
	
	@Given("User is on {string}")
	public void user_is_on(String pageName) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
		page=pageFactory.initialize(pageName);//Here it will take the page(website page) we are passing from feature file. 
	}										//We always have to initialize a page(website page) first and then perform actions on the page
											//then need to assign each page we initialize to the object of BasePage. That is how we connect website page with BasePage and perform actions
	@When("User enter into text box {string} {string}")
	public void user_enter_into_text_box(String logicalName, String InputData) {
		page.enterIntoTextBox(logicalName,InputData);
	}
	@Then("User Clicks on CheckBox {string}")
	public void user_clicks_on_check_box(String logicalName) {
	   page.clickCheckBox(logicalName);
	}
	@Then("User Clicks on Button {string}")
	public void user_clicks_on_button(String logicalName) {
	   page.clickonButton(logicalName);
	}
	
	@When("User clear text box {string}")
	public void user_clear_text_box(String logicalName) {
	   page.clearTextBox(logicalName);
	}
	
	
	@Then("selects option from DropDown {string} {string}")
	public void selects_option_from_drop_down(String logicalName, String option) {
	  page.selectOptionFromDropDown(logicalName, option);
	}
	
	@Then("User confirms data in text box {string} {string}")
	public void user_confirms_data_in_text_box(String logicalName, String InputData) {
	    page.confirmTextBoxData(logicalName,InputData);
	}
	
	@Then("User confirm if CheckBox is selected {string} {string}")
	public void user_confirm_if_check_box_is_selected(String logicalName, String checkBox) {
		page.isSelectedCheckBox(logicalName, checkBox);
	}
	
	
	@When("User Clicks on link {string}")
	public void user_clicks_on_link(String logicalName) {
	   page.clickonLink(logicalName);
	}
	
	@Then("User varifies Title {string}")
	public void user_varifies_title(String expPageTitle) {
	   page.varifyPage(expPageTitle);
	}
	
	@Then("User varifies message {string} {string}")
	public void user_varifies_message(String logicalName, String expMessage) {
	   page.varifyMessage(logicalName, expMessage);
	}

	
	@Then("User closes the Child Window {string}")
	public void user_closes_the_child_window(String logicalName) {
	   page.closeChildWindow(logicalName);
	}
	
	
	@Then("User varifies option in DropDown {string} {string}")
	public void user_varifies_option_in_drop_down(String logicalName, String option) {
		page.varifyDropDownOption(logicalName,option);
	}
	
	@Then("User varifies text box data {string} {string}")
	public void user_varifies_text_box_data(String logicalName, String expData) {
		 page.varifyTextBoxData(logicalName, expData);
	}
	
	
	
	@When("User selects Radio Button {string} {string}")
	public void user_selects_radio_button(String logicalName, String btnTitle) {
		page.selectRadioButton(logicalName,btnTitle);
	}
	
	
	@Then("User varifies tab {string} {string}")
	public void user_varifies_tab(String logicalName, String expTabName) {
	   page.varifyTab(logicalName,expTabName);
	}


	@Then("User varifies options in DropDown {string} {string} {string} {string} {string} {string}")
	public void user_varifies_options_in_drop_down(String logicalName, String option0, String option1, String option2, String option3, String option4) {
		page.varifyDropDownOptions(logicalName,option0, option1, option2, option3, option4);
	}
	
	@Then("User accpets Alert Box")
	public void user_accpets_alert_box() {
	   page.acceptAlert();
	}
	
	
	@When("User Clicks on DropDown {string}")
	public void user_clicks_on_drop_down(String logicalName) {
	   page.clickonButton(logicalName);
	}
	
	@Then("User varifies the displayed table {string}")
	public void user_varifies_the_displayed_table(String logicalName) {
	    page.isDisplayed(logicalName);
	}
	
	@When("User switches to child window")
	public void user_switches_to_child_window() {
	    page.switchToChildWindow();
	}


	
	
	
	
	@After
	public void teardown(Scenario scenario) {
		 byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		   // embed it in the report.
		      scenario.attach(screenshot, "image/png",scenario.getName()); 
			driver.close();
		driver = null;
	}
	
}
