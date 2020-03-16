package com.BasicJava;

public class ObjectExample {

	public static void main(String[] args) {
		
		Object array1[] = new Object[3];
		
		array1[0] = "Selenium";
		array1[1] = 12;
		array1[2] = 'a';
		array1[3] = 10.123;

		for(int i=0;i<3;i++)
		{
			System.out.println(array1[i]);
		}
		

	}

}
