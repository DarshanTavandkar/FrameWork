package com.sd.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sd.testBase.TestBase;

public class CheckoutPage extends TestBase{

	
	public CheckoutPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement firstname_txt;
	
	
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement lastname_txt;
	
	
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement pincode_txt;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continue_btn;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement list_lnk;
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logout_lnk;
	
	
	
	public void enterFirstName(String name)
	{
		firstname_txt.sendKeys(name);
	}
	
	public void enterLastName(String name)
	{
		lastname_txt.sendKeys(name);
	}
	public void enterPinCode(String name)
	{
		pincode_txt.sendKeys(name);
	}
	public void clickOnContinue_Button()
	{
		 continue_btn.click();
	}

	public void clickOnList_link()
	{
		 list_lnk.click();
	}
	public void clickOnlogout_link()
	{
		logout_lnk.click();
	}
		
}
