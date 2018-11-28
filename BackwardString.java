// BackwardString.java
// ----------------------------------------------------------------------
// Program: Backward String
// Programmer: Rebeka Henry
// Date: November 28, 2018
// ----------------------------------------------------------------------
// The class BackwardString has two methods str and main. The purpose of
// this class is to reverse a string that is entered by the user. This is
// accomplished by the str method passes a stri parameter and returns the
// reverse of the stri parameter. The method is called in the main. The
// purpose of the main method is to get the string from the user and to
// call the str method as well as display the result of the str method.
// ---------1---------2---------3---------4---------5---------6---------7
// 1234567890123456789012345678901234567890123456789012345678901234567890

import java.util.Scanner;

public class BackwardString
{
	/** 
	 The static method str of type String reverses a string that
	 is passed to it and returns the reversed string.
	 @param stri of type String is passed as an argument in the
	 static method str.
	*/

	public static String str (String stri)
	{
		String reverse = "";
		for (int i = stri.length()-1; i >= 0; i--)
		{
			reverse = reverse + stri.charAt(i);
		}
		return reverse;
	}

	/** 
	 The static method main of type void calls the Scanner class
	 in order to get the input from the user and it calls the
	 str method and prints out the results of the str method.
	*/

	public static void main (String[] args)
	{
		Scanner cin = new Scanner (System.in);
		
		String getString;
	
		getString = cin.nextLine();

		System.out.println(str(getString));
	}
}
