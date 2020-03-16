package com.TestNG;

import org.testng.annotations.Test;

public class Annoations1 
{
	@Test(priority=1) // Test Case - 
	// Any functionality of the Application which is under Test Should be always written
	// using TestNG Annotation - @Test
	public void gmailApplicationLaunch()
	{
		System.out.println(" Gmail Application Launch Successfull ");
	}
	
	@Test(priority=2)
	public void inBox()
	{
		System.out.println(" Testing Inbox funcationality ");
	}
	
	@Test(enabled=false) // its a false test case - TestNG will ignore the Test at the time of 
	                     // Test Script Execution - its a false Test Case
	public void composeMail()
	{
		System.out.println(" Testing composeMail funcationality ");
	}
	
	@Test(priority=3)
	public void sentMail()
	{
		System.out.println(" Testing sentMail funcationality ");
	}
}
