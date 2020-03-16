package com.BasicJava;

public class WhileExample {

	public static void main(String[] args) 
	{
		int var=6;
		String var1="Testing";
		
		while(var<9)
		{
			System.out.println(var+" "+var1);
			//var++;
			var=var+2;
		}
		
		System.out.println(" ====================== ");
		
		while(var>=4)
		{
			System.out.println(var+" "+var1);
			var=var-1;
		}
		
		System.out.println(" ######################### ");
		
		int var2=-18;
		String var3="Selenium";
		
		while(var2>-26)
		{
			System.out.println(var2+" "+var3);
			var2=var2-1;
		}
		
	}

}
