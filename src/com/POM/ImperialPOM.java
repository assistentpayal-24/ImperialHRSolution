package com.POM;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImperialPOM {
	
	@FindBy(xpath="//input[@type='email']") //initialization
	private WebElement Username;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement Password;
	
	@FindBy (xpath="//button[@type='submit']")
	private WebElement signin;
	
	public ImperialPOM () {
	SearchContext driver = null;
	PageFactory.initElements(driver, this);
	}
	
	public void enterUsername()        //utiliazation
	{
	   Username.sendKeys("admin@gmail.com");
	}
	
	public void enterPassword()
	{
		Password.sendKeys("admin@gmail.com");
	}
	
    public void ClickonSignIn()
    {
    	signin.click();
    }
}
