package com.sd.testLayer;

import org.testng.annotations.Test;
import com.sd.pageLayer.LoginPage;
import com.sd.testBase.TestBase;

public class LoginPageTest extends TestBase{

	@Test
	
	public void verifyLoginTest() throws InterruptedException
	{
		LoginPage login=new LoginPage ();
		
		//---------------------------------
		Thread.sleep(2000);
		login.enterUserName("standard_user");
		Thread.sleep(2000);
		login.enterPassword("secret_sauce");
		Thread.sleep(2000);
		login.clickOnLoginbuton();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
