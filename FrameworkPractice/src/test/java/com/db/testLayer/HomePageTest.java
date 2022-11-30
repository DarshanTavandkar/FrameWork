package com.db.testLayer;

import org.testng.annotations.Test;

import com.db.pageLayer.HomePage;
import com.db.testBase.TestBase;

public class HomePageTest extends TestBase {

	@Test
	public void verifyHomeTest() throws InterruptedException
	{
		HomePage home=new HomePage();
		
	//------------------------------------
		home.clickOnLogin();
		Thread.sleep(2000);
		home.enterUserName("sctqaautomation@grr.la");
		Thread.sleep(2000);
		home.EnterPassword("Spring@123");
		Thread.sleep(2000);
		home.clickOnLoginButton();
			
	}
	
	
	
	
	
}
