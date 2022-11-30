package com.db.testLayer;

import org.testng.annotations.Test;

import com.db.pageLayer.AddToCartPage;
import com.db.pageLayer.HomePage;
import com.db.pageLayer.LoginPage;
import com.db.testBase.TestBase;

public class AddToCartTest extends TestBase{

	
	@Test
	
	public void VerifyAddToCart() throws InterruptedException
	{
		HomePage home=new HomePage();
		LoginPage login = new LoginPage();
		AddToCartPage add = new AddToCartPage ();
		
	//--------------------------------------------------
		
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
		Thread.sleep(2000);
		add.ClickOnAddToCartButton();	
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		add.ClickOnHomeLink();
		Thread.sleep(2000);
		login.ClickOnLaptoplink();
		Thread.sleep(2000);
		login.ClickOnProduct2();
	    Thread.sleep(2000);
	    add.ClickOnAddToCartButton();	
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		add.ClickOnHomeLink();
		Thread.sleep(2000);
		login.ClickOnMonitors();
		Thread.sleep(2000);
		login.ClickOnProduct3();
		Thread.sleep(2000);
		add.ClickOnAddToCartButton();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		add.ClickOnCartLink();
		
		
	}
	
}
