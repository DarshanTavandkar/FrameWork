package com.sd.testLayer;

import org.testng.annotations.Test;

import com.sd.pageLayer.LoginPage;
import com.sd.pageLayer.ProductsPage;
import com.sd.pageLayer.YourCartPage;
import com.sd.testBase.TestBase;

public class YourCartTest extends TestBase {
	
	@Test
	
	public void Verifyyourcart() throws InterruptedException {
	LoginPage login=new LoginPage ();
	ProductsPage product=new ProductsPage();
	YourCartPage cart=new YourCartPage();
	
	//---------------------------------------------
	
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
	Thread.sleep(2000);
	cart.clickOnCheckOutButton();
	}
	
	
	
	
	
	
	
}
