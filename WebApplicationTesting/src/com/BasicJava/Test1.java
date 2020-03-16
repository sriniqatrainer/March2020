package com.BasicJava;

public class Test1 {

	// User Defined method
	public void method1()
	{
		System.out.println(" Method1 executed Successfully ");
	}
	
	// pre-defined method
	public static void main(String[] args) 
	{
		
	 // User-Defined Method should be called to perform the Operation
	
		// creating an object for the current Java Class
		Test1 hello = new Test1();
		
		// using the object created(hello) - calling the user defined Method
		hello.method1();
		
		//Test1 hi = new Test1();
		
		hello.method1();
		hello.method2();
		
		}
		// User Defined method
		public void method2()
		{
			System.out.println(" Method2 executed Successfully ");
		}
	}
