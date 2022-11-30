package com.db.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.db.testBase.TestBase;

public class LoginPage extends TestBase {

	public LoginPage()
	{
		PageFactory.initElements( driver,this);
	}
	
	//---------------obj repos----------------
	@FindBy(xpath="//a[contains(text(),'Phones')]")
	
	private WebElement phone_lnk;
	
    @FindBy(xpath="//a[contains(text(),'Samsung galaxy s6')]")
	
	private WebElement product_lnk;
    
    @FindBy(xpath="//a[contains(text(),'Laptops')]")
	
   	private WebElement laptops_lnk;
   	
    @FindBy(xpath="//a[contains(text(),'Dell i7 8gb')]")
	
   	private WebElement Product2_lnk;
    
    @FindBy(xpath="//a[contains(text(),'Monitors')]")
	
   	private WebElement monitors_lnk;
    
   @FindBy(xpath="//a[contains(text(),'ASUS Full HD')]")
	
   	private WebElement Product3_lnk;
    //----------------actions Method----------------
	
	public void ClickOnPhone()
	{
		phone_lnk.click();
	}
	
	public void ClickOnProduct()
	{
		product_lnk.click();
	}
	
	public void ClickOnLaptoplink()
	{
		laptops_lnk.click();
	}

	public void ClickOnProduct2()
	{
		Product2_lnk.click();
	}

	public void ClickOnMonitors()
	{
		monitors_lnk.click();
	}

	public void ClickOnProduct3()
	{
		Product3_lnk.click();
	}
}
