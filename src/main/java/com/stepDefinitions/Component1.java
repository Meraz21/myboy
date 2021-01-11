package com.stepDefinitions;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.testng.Assert;

import com.base.TestBase;
import com.pages.Component_1_Page;
import com.utill.TestUtill;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Component1 extends TestBase {

	public Component_1_Page com1;
	public TestBase testBase;
	public TestUtill testUtill;

	public Component1() {
		super();
	}

	@Before
	public void setUp() {
		initialization();
		testBase = new TestBase();
		testUtill = new TestUtill();
		com1 = new Component_1_Page();
	}

	@Test
	@Given("^I am on HomePage$")
	public void i_am_on_Index_Home() {
		String pageTitle = driver.getTitle();
		System.out.println("===== PAGE TITLE : ======== " + pageTitle + " ======================");
		Assert.assertEquals(pageTitle, "React App", "Page Title Doesnt match");

	}

	@Test
	@When("^I clear the set title Box$")
	public void i_clear_the_set_title_Box() {
		com1.clearBox();

	}

	@Test
	@Then("^I write a message or can put any value \"([^\"]*)\"$")
	public void i_write_a_message_or_can_put_any_value() {
		com1.clearBox();
		com1.setValue("");

	}

	@Test
	@Then("^I click on Set Title Button$")
	public void i_click_on_SEt_Title_Button() {
		com1.clickButton();

	}

	@Test
	@Then("^I am able to see Entered value displayed on RIGHT side of the title TAG$")
	public void i_am_able_to_see_Entered_value_displayed_on_RIGHT_side_of_the_title_TAG() throws IOException {
		System.out.println("============== When Displayed items  ===============");
		com1.despalyInputValues();
		TestUtill.takeScreenShoot();

	}

	@After
	@And("^I can close the browser\\.$")
	public void i_can_close_the_browser() {

		driver.close();
		driver.quit();
		System.out.println("=========================== Thank You ===========================");

	}

}
