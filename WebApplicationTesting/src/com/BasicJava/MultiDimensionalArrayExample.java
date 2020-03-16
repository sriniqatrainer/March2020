package com.BasicJava;

public class MultiDimensionalArrayExample {

	public static void main(String[] args) {
		
		String array1[][] = new String[2][2];
		
		array1[0][0] = "Manual Testing";
		array1[0][1] = "VenkatSir";
		
		array1[1][0] = "Selenium";
		array1[1][1] = "Srini";
		
		for(int i=0;i<2;i++) // To goto Every Row
		{
			
			for(int j=0;j<2;j++) // To goto every Row of all the columns
			{
				System.out.print(array1[i][j]+"  ");
			}
			System.out.println();
			
		}

	}

}
