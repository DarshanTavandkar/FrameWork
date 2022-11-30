package com.ta.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ta.testBase.TestBase;

public class HomePage extends TestBase {

	
	 public HomePage()
	 {
		 PageFactory.initElements(driver,this);
	 }
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/main[1]/div[3]/div[1]/div[1]/div[1]/form[1]/input[1]")
	private WebElement search_txt;
	
	
	public void EnterInSearchBox(String text)
	{
		search_txt.sendKeys(text);
	}
	

	public void ClickOnSearchBox()
	{
		search_txt.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
