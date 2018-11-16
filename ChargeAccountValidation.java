// ChargeAccountValidation.java
// ----------------------------------------------------------------------
// Program: Charge Account Validation
// Programmer: Rebeka Henry
// Date: November 15, 2018
// ----------------------------------------------------------------------
// The class ChargeAccountValidation has one main method that calls the
// Validator class. ChargeAccountValidation asks the user to enter an
// account number and then validates it by calling on the method validate
// from the Validator class. If the number entered by the user is valid,
// the program displays Approved but if the number is not valid after 
// being passed into the method validate, then the program displays
// the words Invalid to tell the user that the number entered is not 
// a number that is stored.
// ---------1---------2---------3---------4---------5---------6---------7
// 1234567890123456789012345678901234567890123456789012345678901234567890

import java.util.Scanner;

public class ChargeAccountValidation
{
	public static void main (String[] args)
	{
	Validator test = new Validator();
	Scanner keyboard = new Scanner (System.in);
	int accountnum;

	System.out.print("Enter account number: ");
	accountnum = keyboard.nextInt();

	System.out.print ("\n" + "Account Number: " + accountnum + "\n");

	if (test.validate(accountnum))
	{
		System.out.println("Approved");
	}
	else
	{
		System.out.println("Invalid");
	}

	}
}