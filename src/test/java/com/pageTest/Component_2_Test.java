package com.pageTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import org.testng.Assert;
 

import com.base.TestBase;
import com.pages.Component_2_Page;
import com.utill.TestUtill;


public class Component_2_Test extends TestBase{
	public static Component_2_Page comp_2;
	
	public Component_2_Test() {
		super();
	}
  

	@BeforeMethod(groups = "Main Functionality")
	public void setUp() {
		initialization();
		comp_2 = new Component_2_Page();
	}
	// Validate the page title
	@Test(priority = 1, groups = "UI Functionality")
	public void pageTitleTest() {
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "React App", "Page Title Doesnt match");
	}
	
	//Click Multiple times and check the display results
	@Test(priority = 2, groups = "UI Functionality")
	public void clickToAddButtonTest() {
		comp_2.clickAddButton();
		comp_2.displayItems();	
		}

	//To verify specific item is available or not in the selection table list.
	@Test
	public void displayItemsTest() {
		comp_2.clickAddButton();
		String items = comp_2.displayItems();
		if(items.contains("Click 5")) {
			System.out.println("Item is Available in the list..");
		}else {
			System.out.println("Item did not found in the list .... ");
		}
	}
	//To verify, remove button appropriately working once it clicked
	@Test
	public void clicToRemoveButtonTest() throws IOException {
		comp_2.clickAddButton();
		comp_2.displayItems();	
		TestUtill.takeScreenShoot();
		comp_2.clickRemoveButton();
		// add screenshoot
	}
	
	/*click 5 times and select any number from the list then check 
	 * selected items has appear on top of the list.
	*/
	@Test
	public void selectListVisiblilityTest() {
		comp_2.clickAddButton();
		comp_2.selectClickListVisible();
		comp_2.displayItems();
	}
 
	/*
	 * After selected multiple items from the Clicks, Once chose any of them from the select
	 * list this item will not show at display list.
	 */
	
	@Test
	public void selectLisItemtInVisiblilityTest() {
		comp_2.clickAddButton();
		comp_2.selectClickListInvisible();
		
	}

	@AfterMethod
	public void tearDown() {
		if(driver!=null) {
			driver.close();
			driver.quit();
			
		}
	}
}
