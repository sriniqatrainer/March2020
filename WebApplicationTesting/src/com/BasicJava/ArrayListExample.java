package com.BasicJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<Object>array1 = new ArrayList<>();
		
		array1.add("Selenium");
		array1.add(10);
		array1.add(10.23);
		array1.add('A');
		
		/*System.out.println(array1.get(0));
		System.out.println(array1.get(1));*/
		
		for(int i=0;i<array1.size();i++)
		{
			System.out.println(array1.get(i));
		}
		
		System.out.println(" ***********For each Loop************  ");
		
		for(Object var:array1)
		{
			System.out.println(var);
		}

	}
}
