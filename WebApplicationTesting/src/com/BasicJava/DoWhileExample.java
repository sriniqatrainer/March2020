package com.BasicJava;

public class DoWhileExample {

	public static void main(String[] args) {
		
		int var=5;
		
		String string="WebDriver";
		
		do
		{
			System.out.println(var+" "+string);
			var++;
		}while(var<6);

		System.out.println(" ********************* ");
		
		int var1=-99;
		String string1="Selenium";
		
		do
		{
			System.out.println(var1+" "+string1);
			var1=var1-2;
		}while(var1>-109);
				
	}
}
