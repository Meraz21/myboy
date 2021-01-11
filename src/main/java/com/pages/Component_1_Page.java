package com.pages;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class Component_1_Page extends TestBase {

	// page factory Objects repository

	@FindBy(xpath = "//input[@type='text']")
	WebElement clear_Inputs;

	@FindBy(xpath = "//input[@type='text']")
	WebElement input_Values;

	@FindBy(xpath = "//header/div[1]/div/button")
	WebElement click_Button;

	@FindBy(xpath = "//header/div[1]/span")
	WebElement display_Inputs;

	// Ininitialing of Page Factory
	public Component_1_Page() {
		PageFactory.initElements(driver, this);
	}

	// Actions
	public void titleOfThePage() {
		String title = driver.getTitle();
		System.out.println("The Title Of the Page is : "+title);
	}

	public void clearBox() {
		clear_Inputs.clear();
	
	}

	public void clickButton() {
		click_Button.click();
	}
	public void setValue(String setValue) {
		input_Values.sendKeys(setValue);
		 
	}

	public String despalyInputValues() {
		String availableValue = display_Inputs.getText();
		System.out.println("Text Box Message is : "+availableValue);
		return availableValue;
	}

}
