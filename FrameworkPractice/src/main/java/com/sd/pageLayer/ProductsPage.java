package com.sd.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sd.testBase.TestBase;

   public class ProductsPage extends TestBase{

	public ProductsPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	//------------------obj repo------------------
	
	   @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
	    private WebElement product_lnk;
	    
	   @FindBy(xpath="//a[@class='shopping_cart_link']")
	    private WebElement cart_lnk;
	//----------------action methods------------------
	   
	   public void clickOnProduct( )
	    {
		   product_lnk.click();
	    }
	   
	    public void clickOnCart( )
	    {
	    	cart_lnk.click();
	    }
	
}
