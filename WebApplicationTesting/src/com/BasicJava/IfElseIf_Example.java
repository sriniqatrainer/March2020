package com.BasicJava;

public class IfElseIf_Example {

	public static void main(String[] args) {
		
		int var1=80;
		int var2=80;
		int var3=80;
		
		if(var1>var2 && var1>var3 )
		{
			System.out.println(" Var1 is greater than Var2 and Var3 ");
		}
		else
			if(var2>var3)
			{
				System.out.println(" Var2 is greater than Var1 and Var3 ");
			}
			else
			{
				System.out.println(" Var3 is greater than Var1 and Var2 ");
			}

	}
}
