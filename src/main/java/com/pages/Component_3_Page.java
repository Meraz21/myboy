package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.TestBase;

public class Component_3_Page extends TestBase{
	
	// Page factory Objects repository
	
	@FindBy(xpath ="//button[@name='reportToggle']")
	WebElement toggle_Button;
	
	@FindBy(xpath = "//header/div[6]/div/div")
	WebElement all_Table;
	
	@FindBy(xpath = "//header/div[6]/div/div/div")
	WebElement total_Rows;
	
	@FindBy(xpath = "//header/div[6]/div/div/div[1]/div")
	WebElement total_Columns;
	
	// Row Xpath
			public String beforXpathCol = "//header/div[6]/div/div/div[1]/div[";
			public String AfterXpathCol = "]";

	// Column Xpath
			public String beforXpathRow = "//header/div[6]/div/div/div[";
			public String AfterXpathRow = "]";
			
	// List of particular Column Value
			public String beforeListOfColumn = "//header/div[6]/div/div/div[";
			public String afterListOfColumn = "]/div[1]";
			
	
	// Ininitialing of Page Factory
	public Component_3_Page() {
		PageFactory.initElements(driver, this);
	}	
	
	// Actions
		public void titleOfThePage() {
			String title = driver.getTitle();
			System.out.println("The Title Of the Page is : "+title);
		}
		public void clickOnToggle() {
			toggle_Button.click();
		}
		//Total Number of rows and columns
		public void totalRowsAndColumn() {
			int rows = driver.findElements(By.xpath("//header/div[6]/div/div/div")).size();
			int col = driver.findElements(By.xpath("//header/div[6]/div/div/div[1]/div")).size();
			System.out.println("========== Total Column and Rows count ============");
			System.out.println("Total Column of this Table are : " + rows);
			System.out.println("Total Rows of this Table are : " + col);
			System.out.println("===================================================");
			Assert.assertEquals(rows, 2, "Rows More then 2");
			Assert.assertEquals(col, 16, "Columns less then 16 ");
			
	
		}
		// All available table Data
		public String getAllData() {
			String tableData =all_Table.getText();
			System.out.println("========== All Available Values ============");
			System.out.println("All abailable Table Data : \n" + tableData);
			System.out.println("===================================================");
			return tableData;
			}
		
		//Get First Row Data
		public void getFirstRowData() {
			System.out.println("=============== Available Data found on First Row ====================\n");
			for (int i = 1; i <= 1; i++) {
				String actualXpath = beforXpathRow + (i) + AfterXpathRow;
				WebElement element = driver.findElement(By.xpath(actualXpath));
				System.out.println(element.getText());
				if (element.getText().contains("test3")) {
					System.out.println("Data Found On the List ");
				}else {
					System.err.println("Not Found On the List");
				}
				System.out.println("=============================================");
			}
			 
			
		}
		//Get first Column Data
		public void firstColValues() {
			System.out.println("================ First Column ================");
			for (int i = 1; i <= 2; i++) {
				String actualXpath = beforeListOfColumn + (i) + afterListOfColumn;
				WebElement element = driver.findElement(By.xpath(actualXpath));
				System.out.println(element.getText()+"\n");

			}
			 
		}


}
