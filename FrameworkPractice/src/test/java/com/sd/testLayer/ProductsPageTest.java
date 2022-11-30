package com.sd.testLayer;

import org.testng.annotations.Test;

import com.sd.pageLayer.LoginPage;
import com.sd.pageLayer.ProductsPage;
import com.sd.testBase.TestBase;

public class ProductsPageTest extends TestBase {

	@Test
	
	public void verifyproductsTest() throws InterruptedException
	{
		LoginPage login=new LoginPage ();
		ProductsPage product=new ProductsPage();
		
	//----------------------------------------
		Thread.sleep(2000);
		login.enterUserName("standard_user");
		Thread.sleep(2000);
		login.enterPassword("secret_sauce");
		Thread.sleep(2000);
		login.clickOnLoginbuton();
		Thread.sleep(2000);
		product.clickOnProduct();	
		Thread.sleep(2000);
		product.clickOnCart();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
