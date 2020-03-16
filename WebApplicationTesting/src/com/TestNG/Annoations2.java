package com.TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annoations2 {
	
	@BeforeTest
	public void gmailApplicationLaunch()
	{
		System.out.println(" Gmail Application Launch Successfull ");
	}
	
	@Test(priority=1)
	public void inBox()
	{
		System.out.println(" Testing inBox functionality ");
	}
	
	@Test(priority=2)
	public void composeMail()
	{
		System.out.println("Testing composeMail Functionality");
	}
	
	@Test(enabled=false)
	public void sentMail()
	{
		System.out.println("Testing sentMail Functionality");
	}

	@AfterTest
	public void gmailApplicationClose()
	{
		System.out.println(" Closing the Gmail Application ");
	}
	
}
