package com.db.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.db.testBase.TestBase;

public class HomePage extends TestBase {
	
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	//-------------obj repo--------------------

      @FindBy(xpath="//a[@id='login2']")
      private WebElement login_lnk;
	
      @FindBy(xpath="//input[@id='loginusername']")
      private WebElement username_txt;
	
      @FindBy(xpath="//input[@id='loginpassword']")
      private WebElement password_txt;
	
      @FindBy(xpath="//button[contains(text(),'Log in')]")
      private WebElement login_btn;
	
	//-------------action methods--------------------
	  
      public void clickOnLogin()
      {
    	  login_lnk.click(); 
      }
      
      public void enterUserName(String username)
      {
    	  username_txt.sendKeys(username);
      }
      
      public void EnterPassword(String password)
      {
    	  password_txt.sendKeys(password);
      }
      
      public void clickOnLoginButton()
      {
    	  login_btn.click(); 
      }
      
      
      
      
      
      
      
      
      
      
      
	
	
	
	
	
	
	
}
