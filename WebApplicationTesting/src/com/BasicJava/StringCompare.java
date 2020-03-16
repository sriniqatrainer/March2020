package com.BasicJava;

public class StringCompare {

	public static void main(String[] args) 
	{
		String string1 = "LiveTech";
		String string2 = "LiveTech";
		
		//if(string1==string2)
		if(string1.equals(string2))
		{
			System.out.println(" Both Strings are Equal ");
		}
		else
		{
			System.out.println(" Both Strings are Not Equal ");
		}
		
		System.out.println(" @@@@@@@@@@@@@@@@@@@@@@@@ ");
		
		String string3 = "LiveTech";
		String string4 = " LiveTech";
		
		if(string3.equals(string4))
		{
			System.out.println(" Both Strings are Equal ");
		}
		else
		{
			System.out.println(" Both Strings are Not Equal ");
		}
		
		System.out.println(" #######################");
		
		String string5 = "LiveTech";
		String string6 = "Livetech";
		
		if(string5.equalsIgnoreCase(string6))
		{
			System.out.println(" Both Strings are Equal ");
		}
		else
		{
			System.out.println(" Both Strings are Not Equal ");
		}
		
		System.out.println(" ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ ");

		String string7 = "LiveTech";
		String string8 = "Live tech";
		
		if(string7.equalsIgnoreCase(string8))
		{
			System.out.println(" Both Strings are Equal ");
		}
		else
		{
			System.out.println(" Both Strings are Not Equal ");
		}

		System.out.println(" ========================= ");
		
		String string9 = "LiveTech";
		String string10 = "Live";
		
		if(string10.contains(string9))
		{
			System.out.println(" String existing ");
		}
		else
		{
			System.out.println(" String Not Existing ");
		}
		
		System.out.println(" &&&&&&&&&&&&&&&&&&&&& ");
		
		int string9_Length=string9.length();
		System.out.println(" The lenght of the String9 variable is : "+string9_Length);
		
		System.out.println(" --------------------------------------------- ");
		
		if(string9.length()>string10.length())
		{
			System.out.println(" String9 has more number of characters");
		}
		else
		{
			System.out.println(" String10 has more number of characters");
		}
	}

}
