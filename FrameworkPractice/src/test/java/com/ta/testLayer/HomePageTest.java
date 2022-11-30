package com.ta.testLayer;

import org.testng.annotations.Test;

import com.ta.pageLayer.HomePage;
import com.ta.testBase.TestBase;

public class HomePageTest extends TestBase {

	
	@Test
	
	public void VerifyHomePage() throws InterruptedException
	{
		
		HomePage home=new HomePage();
		
	//----------------------------------------
		home.EnterInSearchBox("Club Mahindra");
		Thread.sleep(4000);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
