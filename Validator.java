// Validator.java
// ----------------------------------------------------------------------
// Program: Validator
// Programmer: Rebeka Henry
// Date: November 15, 2018
// ----------------------------------------------------------------------
// The class Validator has one method called validate. The purpose of 
// this class is to validate the account number that the user enters.
// ---------1---------2---------3---------4---------5---------6---------7
// 1234567890123456789012345678901234567890123456789012345678901234567890

public class Validator
{
	/** 
	 The method validate that returns type boolean stores
	 an array of accountNumbers that are validated
	 depending on whether they are stored within the
	 array.
	 @param num of type int is passed to the method.
	 This is the number that will be obtained from
	 the user. If the number that the user gives is within
	 the array, found will return true but if it does not,
	 found will return false.
	*/
	public boolean validate (int num)
	{
		int [] accountNumbers = {5658845, 4520125, 7895122,
		 8777541, 8451277,1302850, 8080152, 4562555, 5552012,
		 5050552, 7825877, 1250255, 1005231, 6545231, 3852085,
		 7576651, 7881200, 4581002};

		 boolean found = false;
		 int index = 0;

		 while (index < accountNumbers.length && !found)
		 {
		 	if (accountNumbers[index] == num)
		 	{
		 		found = true;
		 	}
		 	else
		 	{
		 		index+=1;
		 	}
		 	
		 }
		 return found;

	}
}