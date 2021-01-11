package com.pageTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import org.testng.Assert;


import com.base.TestBase;
import com.pages.Component_3_Page;

public class Component_3_Test extends TestBase {
	public static Component_3_Page comp_3;

	public Component_3_Test() {
		super();
	}

	@BeforeMethod(groups = "Main Functionality")
	public void setUp() {
		initialization();
		comp_3 = new Component_3_Page();
	}

	// Validate the page title
	@Test(priority = 1, groups = "UI Functionality")
	public void pageTitleTest() {
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "React App", "Page Title Doesnt match");
	}
	
	@Test
	public void availableDataTest() {
		comp_3.clickOnToggle();
		comp_3.getAllData();
	}
	@Test
	public void totalRowsAndColumnTest() {
		comp_3.clickOnToggle();
		comp_3.totalRowsAndColumn();
	}
	@Test
	public void firstRowDataTest() {
		comp_3.clickOnToggle();
		comp_3.getFirstRowData();
	}
	@Test
	public void getFirstColumnDataTest() {
		comp_3.clickOnToggle();
		comp_3.firstColValues();
	}

	@AfterMethod
	public void tearDown() {
		if (driver != null) {
			driver.close();
			driver.quit();

		}
	}
}
