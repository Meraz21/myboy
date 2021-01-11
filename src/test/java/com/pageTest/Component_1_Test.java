package com.pageTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.Assert;

import com.base.TestBase;
import com.pages.Component_1_Page;
import com.utill.TestUtill;

public class Component_1_Test extends TestBase {

	TestUtill testUtill;
	public String setValue;
	private String newValue;
	public static Component_1_Page comp_1;
	static String sheetName="msg1";

	public Component_1_Test() {
		super();
	}

 
	@BeforeMethod(groups = "Main Functionality")
	public void setUp() {
		initialization();
		testUtill = new TestUtill();
		comp_1 = new Component_1_Page();
	}
	// Validate the page title
	@Test(priority = 1, groups = "UI Functionality")
	public void pageTitleTest() {
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "React App", "Page Title Doesnt match");
	}
	
	//Clear the Text Box 
	@Test(priority = 2, groups = "UI Functionality")
	public static void clearTheBoxTest() {
		comp_1.clearBox();
	}

	@DataProvider
	public Object[][] getTestData(){
		Object [][]data  = TestUtill.getTestData(sheetName);
		return data;
	}
	@Test(priority = 3,groups = "UI Functionality", dataProvider = "getTestData")
	public static void setNewValueTest(String newValue) {
		clearTheBoxTest();
		comp_1.setValue(newValue);

	}

	@Test(priority = 4, groups = "UI Functionality", dataProvider = "getTestData")
	public static void displayTitleDataTest(String myValue) {
		setNewValueTest(myValue);
		comp_1.clickButton();
		comp_1.despalyInputValues();

	}
 
 
	@AfterMethod(groups = "Main Functionality")
	 public void tearDown() {
		driver.close();
		driver.quit();

	}
}
