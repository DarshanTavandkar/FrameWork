package com.db.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.db.testBase.TestBase;

public class AddToCartPage extends TestBase{

	
	public AddToCartPage()
	{
		PageFactory.initElements( driver ,this);
	}
	
	//---------obj repos-------------------
	
	@FindBy(xpath="//a[contains(text(),'Add to cart')]")
	
	private WebElement addtocart_btn;
	
     @FindBy(xpath="//body/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
	
	private WebElement home_lnk;
	
     @FindBy(xpath="//a[contains(text(),'Cart')]")
 	
 	private WebElement cart_lnk;
	//------------actions Method-----------
	
	public void ClickOnAddToCartButton()
	{
		addtocart_btn.click();
		
	}
	
	public void ClickOnHomeLink()
	{
		home_lnk.click();
		
	}
	
	public void ClickOnCartLink()
	{
		cart_lnk.click();
		
	}
	
	
	
	
	
	
	
	
	
}
