package com.BasicJava;

public class SingleDimensionalArrayExample {

	public static void main(String[] args) {
		
		// Syntax:-  dataType arrayName[] = new dataType[size];
		
		
		//  Array should be declared with a dataType
		// Array should be declared with the size
		// Array is capable storing/saving similar dataType values
		// Array uses continues memory allocation
		// array index always starts from 0 
		// Array once declared with the size - cannot be stored with even an extra value
		// Array index can have different duplicate values
		// Array index is not saved with a value - then wastage of memory
		
		int array1[] = new int[3];
		
		array1[0] = 10;
		array1[1] = 20;
		array1[2] = 30;
				
		/*
		System.out.println(array1[0]);
		
		System.out.println(array1[1]);
		
		System.out.println(array1[2]);
		*/
		
		//for(int i=0;i<=2;i++)
		for(int i=0;i<array1.length;i++)
		{
			System.out.println(array1[i]);
		}
		
		
	}

}
