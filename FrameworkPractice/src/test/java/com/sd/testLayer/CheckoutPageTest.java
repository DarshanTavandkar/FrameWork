package com.sd.testLayer;

import org.testng.annotations.Test;

import com.sd.pageLayer.CheckoutPage;
import com.sd.pageLayer.LoginPage;
import com.sd.pageLayer.ProductsPage;
import com.sd.pageLayer.YourCartPage;
import com.sd.testBase.TestBase;

public class CheckoutPageTest extends TestBase {

	@Test
	
	public void VerifyCheckOutPage() throws InterruptedException
	{	
		LoginPage login=new LoginPage ();
		ProductsPage product=new ProductsPage();
		YourCartPage cart=new YourCartPage();
		CheckoutPage check=new CheckoutPage();
				
	//----------------------------------------------------	
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
		Thread.sleep(2000);
		check.enterFirstName("sachin");
		Thread.sleep(2000);
		check.enterLastName("Tandulkar");
		Thread.sleep(2000);
		check.enterPinCode("401107");
		Thread.sleep(2000);
		check.clickOnContinue_Button();
		Thread.sleep(2000);
		check.clickOnList_link();
		Thread.sleep(2000);
		check.clickOnlogout_link();
	}
	
}
