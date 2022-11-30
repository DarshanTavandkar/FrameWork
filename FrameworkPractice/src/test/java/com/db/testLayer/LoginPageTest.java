package com.db.testLayer;

import org.testng.annotations.Test;

import com.db.pageLayer.HomePage;
import com.db.pageLayer.LoginPage;
import com.db.testBase.TestBase;

public class LoginPageTest extends TestBase{

	
	@Test
	public void VerfiyLoginTest() throws InterruptedException
	{
		
		
		HomePage home=new HomePage();
		LoginPage login = new LoginPage();
		
	//----------------------------------
		home.clickOnLogin();
		Thread.sleep(2000);
		home.enterUserName("sctqaautomation@grr.la");
		Thread.sleep(2000);
		home.EnterPassword("Spring@123");
		Thread.sleep(2000);
		home.clickOnLoginButton();
		Thread.sleep(2000);
		login.ClickOnPhone();
		Thread.sleep(2000);
		login.ClickOnProduct();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
