package com.sd.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sd.testBase.TestBase;

public class LoginPage extends TestBase{

	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	//-------------obj repo--------------------

    @FindBy(xpath="//input[@id='user-name']")
    private WebElement username_txt;
    
    @FindBy(xpath="//input[@id='password']")
    private WebElement password_txt;
    
    @FindBy(xpath="//input[@id='login-button']")
    private WebElement login_btn;
   
	
	//-------------action methods--------------------
	  
    public void enterUserName(String user)
    {
    	username_txt.sendKeys(user);
    }
    
    public void enterPassword(String pass)
    {
    	 password_txt.sendKeys(pass);
    }
    public void clickOnLoginbuton()
    {
    	login_btn.click();
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
