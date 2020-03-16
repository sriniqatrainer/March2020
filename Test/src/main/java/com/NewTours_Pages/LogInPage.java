package com.NewTours_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage {
	
	@FindBy(linkText="REGISTER")
	WebElement register;
	
	public void Register()
	{
		register.click();
	}
	
	@FindBy(linkText="SUPPORT")
	WebElement support;
	
	public void Support()
	{
		support.click();
	}
	

	@FindBy(name="userName")
	WebElement userName;
	

	@FindBy(name="password")
	WebElement password;
	

	@FindBy(name="login")
	WebElement signIn;
	
	public void logIn(String UserName,String Password)
	{
		userName.sendKeys(UserName);
		password.sendKeys(Password);
		signIn.click();
		
	}
	

}
