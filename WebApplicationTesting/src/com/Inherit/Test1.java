package com.Inherit;

public class Test1  {

	
	public void method1()
	{
		System.out.println(" Method1 executed Successfully ");
	}
	
	private void method2()
	{
		System.out.println(" Method2 executed Successfully ");
	}
	
	public static void main(String []args)
	{
		
		Test1 t1 = new Test1();
		t1.method1();
		t1.method2();
	}
	
}
