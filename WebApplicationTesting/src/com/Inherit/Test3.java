package com.Inherit;

public class Test3 extends Test2 {

	public void method4()
	{
		System.out.println(" Method4 executed Successfully ");
	}
	public static void main(String[] args) {

		Test3 t3 = new Test3();
		t3.method1();
		//t3.method2();
		//t3.method3();
		t3.method4();
		
		Test2 t2 = new Test2();
		t2.method1();
		
	}

}
