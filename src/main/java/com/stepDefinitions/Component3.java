package com.stepDefinitions;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.testng.Assert;

import com.base.TestBase;

import com.pages.Component_3_Page;
import com.utill.TestUtill;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Component3 extends TestBase {

	public Component_3_Page com3;
	TestBase testBase;
	TestUtill testUtill;

	public Component3() {
		super();
	}

	@Before
	public void setUp() {
		initialization();
		testBase = new TestBase();
		testUtill = new TestUtill();
		com3 = new Component_3_Page();
	}

	@Test
	@Given("^I am on HomePage where title is React App$")
	public void i_am_on_HomePage_where_title_is_React_App() {
		String pageTitle = driver.getTitle();
		System.out.println("===== PAGE TITLE : ======== " + pageTitle + " ======================");
		Assert.assertEquals(pageTitle, "React App", "Page Title Doesnt match");
	}

	@Test
	@When("^I Click on Toggle Report Data Button, Hiden Table will Displayed$")
	public void i_Click_on_Toggle_Report_Data_Button_Hiden_Table_will_Displayed() throws IOException {
		com3.clickOnToggle();
		com3.getAllData();
		TestUtill.takeScreenShoot();
	}

	@Test
	@Then("^I can check total numbers of row and columns$")
	public void i_can_check_total_numbers_of_row_and_columns() {
		com3.clickOnToggle();
		com3.totalRowsAndColumn();

	}

	@Test
	@Then("^I can check available data in the first row$")
	public void i_can_check_available_data_in_the_first_row() {
		com3.clickOnToggle();
		com3.getFirstRowData();
	}

	@Test
	@Then("^I can check available data in the first column$")
	public void i_can_check_available_data_in_the_first_column() {
		com3.clickOnToggle();
		com3.firstColValues();
	}

	@After
	@Then("^I can close the browser$")
	public void i_can_close_the_browser() {

		driver.close();
		driver.quit();
		System.out.println("=========================== Thank You ===========================");

	}
}
