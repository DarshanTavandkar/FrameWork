package com.sd.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sd.testBase.TestBase;

public class YourCartPage extends TestBase {

	
	public YourCartPage()
	{
		PageFactory.initElements( driver,this);
	}
	
	@FindBy(xpath="//button[@id='checkout']")
	
	private WebElement checkout_btn;
	
	
	public void clickOnCheckOutButton()
	{
		checkout_btn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
