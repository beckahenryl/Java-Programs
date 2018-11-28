// PasswordMain.java
// ----------------------------------------------------------------------
// Program: Password Main
// Programmer: Rebeka Henry
// Date: November 28, 2018
// ----------------------------------------------------------------------
// The class PasswordMain has one static method main of type void that
// gets a string from the user and calls the validate method from the 
// class Password in order to check whether the password entered meets
// the required specifications including whether the password has a
// minimum of six characters, an uppercase, a lowercase, and a digit
// character. It then tells the user whether their password is valid or
// not.
// ---------1---------2---------3---------4---------5---------6---------7
// 1234567890123456789012345678901234567890123456789012345678901234567890

import java.util.Scanner;

public class PasswordMain
{
	public static void main (String[] args)
	{
		System.out.print("Enter a Password: ");

		Scanner cin = new Scanner (System.in);

		String getString;
	
		getString = cin.nextLine();

		Password val = new Password(); //call the Password class

		if (val.validate(getString))   //check with validate method
			System.out.print("Valid Password");
		else
			System.out.print("Invalid Password");
	}
}
