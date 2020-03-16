package com.BasicJava;

public class ForExample1 {

	public static void main(String[] args) {
		
		String string ="LiveTech";
		
		//for(int var=1;var<3;var++)
		for(int var=1;var<3;var=var+1)
		{
			System.out.println(var+" - "+string);
		}
		
		System.out.println(" ******************** ");
		
		for(int var1=5;var1<=9;var1=var1+2)
		{
			System.out.println(var1+" - "+string);
		}
		
		System.out.println(" @@@@@@@@@@@@@@@@@@@@@@@@@@@@@ ");
		
		for(int var2=-5;var2>=8;var2++)
		{
			System.out.println(var2+" - "+string);
		}
		
		System.out.println(" $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ ");
		
		String string1="Selenium";
		
		//for(int var3=8;var3>=4;var3--)
		for(int var3=8;var3>=4;var3=var3-1)
		{
			System.out.println(var3+"  "+string1);
		}
		
		System.out.println(" ================================== ");
		
		for(int var4=-9;var4>=-11;var4--)
		{
			System.out.println(var4+" "+string1);
		}
		
		
		
		
		
	}

}
