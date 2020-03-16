package com.BasicJava;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int var1=20;
		int var2=0;
		int var3;
			
		try
		{
	
			var3=var1/var2;
			System.out.println(" The division of var1 and var2 is : "+var3);
		}
		catch(Exception var)
		{
			System.out.println(" The excetion is : "+var);
			System.out.println(" Testing ");
		}

	}

}
