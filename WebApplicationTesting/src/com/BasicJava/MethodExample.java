package com.BasicJava;

public class MethodExample {
	
	int var1=40;
	int var2=10;

	int var3;
	
	public void addition()
	{
		
		
		var3=var1+var2;
		
		System.out.println(" The addition of var1 and var2 is : "+var3);
		
	}
	
	public static void main(String[] args) {
		
		MethodExample me = new MethodExample();
		me.addition();
		
		me.subtraction();
		
		me.multiplication();
		
		me.division();

	}
	
	public void subtraction()
	{
		
			var3=var1-var2;
		
		System.out.println(" The subtraction of var1 and var2 is : "+var3);
		
	}
	
	public void multiplication()
	{
		
		int var1=50;
		int var2=60;

		int var3;
		
		var3=var1*var2;
		
		System.out.println(" The multiplication  of var1 and var2 is : "+var3);

	}
	
	public void division()
	{
		
		int var1=50;
		int var2=0;

		int var3;

		var3=var1/var2;
		
		System.out.println(" The division of var1 and var2 is : "+var3);
			}

}
