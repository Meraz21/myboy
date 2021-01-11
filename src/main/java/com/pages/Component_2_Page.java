package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;
import com.utill.TestUtill;

public class Component_2_Page extends TestBase {
	//Page Factory of Object Repo
	
@FindBy(xpath = "//header/div[2]/div")
WebElement click_Add_Button;

@FindBy(xpath = "//header/button[1]")
WebElement click_Remove_Button;

@FindBy(xpath = "//header/div[5]")
WebElement display_List;

@FindBy(xpath = "//header/div[3]/select")
WebElement select_DropDown;

@FindBy (xpath = "//header/div[4]/div")
WebElement red_Selection;

// Initialization of Page Factory
public Component_2_Page() {
	PageFactory.initElements(driver, this);
}
//Actions
	public void titleOfThePage() {
		String title = driver.getTitle();
		System.out.println("The Title Of the Page is : "+title);
	}
	public void clickAddButton() {
	  	WebElement clicks = click_Add_Button;
		for (int i = 0; i <= click; i++) {
			clicks.click();
		}
		
		
	}
	public void clickRemoveButton() {
		WebElement clicks = click_Remove_Button;
		for (int i = 0; i <= click; i++) {
			clicks.click();
		}
	}
	
	public String displayItems() {
		String displayList = display_List.getText();
		System.out.println("Selected Clicks are : \n"+displayList);
		return displayList;
	}
	
	public String selectClickListVisible() {
		 TestUtill.selectFunctions(select_DropDown);
		 String selected = red_Selection.getText();
		 System.err.println("\nSelected RED Item is : "+selected);
		 return selected;
		 	
	}
	public void selectClickListInvisible() {
		WebElement clicks = click_Add_Button;
		for (int i = 1; i <= click/2; i++) {
			clicks.click();
		}
		System.out.println("Selected Item of "+click+" is Not Available In the list");
		TestUtill.selectFunctions(select_DropDown);
		System.out.println(display_List.getText());
		 
		 	
	}
	
}
