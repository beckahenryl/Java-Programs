// Password.java
// ----------------------------------------------------------------------
// Program: Password
// Programmer: Rebeka Henry
// Date: November 28, 2018
// ----------------------------------------------------------------------
// The class Password has one static method called validate of type
// boolean that takes a String strpass as an argument and checks the
// string for the following: whether the length of the string is a
// minimum of 6 characters, whether the string has a minimum of one 
// uppercase character, whether the string has a minimum of one lowercase
// character, and finally whether the string has at least one digit.
// ---------1---------2---------3---------4---------5---------6---------7
// 1234567890123456789012345678901234567890123456789012345678901234567890

public class Password
{
	/** 
	 The public static method validate of type boolean takes a string
	 and checks whether the string is the correct length, has an
	 uppercase, has a lowercase, and has a digit. It returns either true
	 or false based on the string. If the string meets all of the
	 criteria, the method returns true but if the string does not meet
	 all of the criteria, the method returns false.
	 @param strpass of type string is passed as an argument in the method.
	*/
	public static boolean validate (String strpass)
	{
		char ch;
		boolean totalcheck = true;
		
		if (strpass.length() >= 6)
		{
			totalcheck = true;

			for (int i = 0; i < strpass.length(); i++)
			{
				ch = strpass.charAt(i);

				if (Character.isUpperCase(ch) == true)
					totalcheck = true;
				else
					totalcheck = false;
				if (Character.isLowerCase(ch) == true)
					totalcheck = true;
				else
					totalcheck = false;

				if (Character.isDigit(ch) == true)
					totalcheck = true;
				else 
					totalcheck = false;
			}
		}

		else
		{
			totalcheck = false;
		}

		return totalcheck;
	}
}