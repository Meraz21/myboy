package com.stepDefinitions;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.testng.Assert;

import com.base.TestBase;
import com.pages.Component_2_Page;
import com.utill.TestUtill;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Component2 extends TestBase {

	public Component_2_Page comp2;
	TestBase testBase;
	TestUtill testUtill;

	public Component2() {
		super();
	}

	@Before
	public void setUp() {
		initialization();
		testBase = new TestBase();
		testUtill = new TestUtill();
		comp2 = new Component_2_Page();
	}

	@Test
	@Given("^i am on HomePage where title is React App$")
	public void i_am_on_HomePage_where_title_is_React_App() {
		String pageTitle = driver.getTitle();
		System.out.println("===== PAGE TITLE : ======== " + pageTitle + " ======================");
		Assert.assertEquals(pageTitle, "React App", "Page Title Doesnt match");
	}

	@Test
	@When("^I click on Click Button and able to see Click_(\\d+) has Displayed bellow the remove click button$")
	public void i_click_on_Click_Button_and_able_to_see_Click__has_Displayed_bellow_the_remove_click_button()
			throws IOException {
		comp2.clickAddButton();
		System.out.println("============== When Displayed items  ===============");
		comp2.displayItems();
		TestUtill.takeScreenShoot();

	}

	@Test
	@Then("^I click on Remove Click button and Click_(\\d+) must be disappear$")
	public void i_click_on_Remove_Click_button_and_Click__must_be_disappear() throws IOException {
		comp2.clickRemoveButton();
		System.out.println("\n============== When Displayed items was removed  ===============\n\n");
		TestUtill.takeScreenShoot();
	}

	@After
	@And("^I close the browser$")
	public void i_close_the_browser() {

		driver.close();
		driver.quit();
		System.out.println("=========================== Thank You ===========================");
	}

}
