// InvalidDialogData.java
// ----------------------------------------------------------------------
// Program: Invalid Dialog Data
// Programmer: Rebeka Henry
// Date: December 4, 2018
// ----------------------------------------------------------------------
// The class InvalidDialogData takes input from the user and validates
// it by determining whether the input is within the constraints of the
// minimum and maximum values. It has two methods called main and
// getNumber. The main method calls the method getNumber and prints
// out the results of it. The getNumber method on the other hand,
// gets input from the user and uses try catch to find exceptions to
// the input. For example, if the user enters a data type that is not
// allowed, then an exception is caught and the message Invalid number
// is displayed. And if the user inputs a number that is not within
// the range, then another message displays and tells the user
// that the number entered has to be within the range. It loops until
// the user provides the correct input that meets the specifications
// of the program. It uses the JOptionPane in order to display the
// message.
// ---------1---------2---------3---------4---------5---------6---------7
// 1234567890123456789012345678901234567890123456789012345678901234567890

import javax.swing.JOptionPane;

public class InvalidDialogData
{
	final static String PROGRAM_NAME = "Invalid Dialog Data";

	public static void main (String[] args)
	{
		double number;

		number = getNumber("Enter a number: ", 1, 25);
		
		JOptionPane.showMessageDialog(null, "The number is " + number 
			+ ".", PROGRAM_NAME, JOptionPane.PLAIN_MESSAGE);
	}

	/** 
	 The private static method getNumber of type double takes three
	 parameters called prompt, min, and max. It also gets input
	 from the user using the Scanner class. It catches an exception
	 using try-catch statements to check if the user enters a valid
	 data type. If the user enter a valid data type, the method then
	 checks if the number is within the range of the minimum and
	 maximum values set in the main method. The user is prompted
	 within the do while loop until they input the correct data
	 type and when the number that they input is within the specifed
	 range.

	 @param prompt of type String is passed as an argument in the
	 private static method getNumber. It displays the prompt from the
	 main method.

	 @param min of type double is passed as an argument in the method.
	 It represents the minimum number that the user is allowed to enter
	 and it is also included in the main method when getNumber is
	 called.

	 @param max of type double is passed as an argument in the method.
	 It represents the maximum number that the user is allowed to enter
	 and it is also included in the main method when getNumber is
	 called.
	*/

	private static double getNumber(String prompt, double min,
	 double max)
	{
		String str;
		double number = 0;
		boolean valid = true;

		do
		{
			str = JOptionPane.showInputDialog(null, prompt,
			 PROGRAM_NAME, JOptionPane.PLAIN_MESSAGE);

			try
			{
				number = Double.parseDouble(str);
				valid = true;
			}

			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null, "Invalid number.",
				 PROGRAM_NAME, JOptionPane.ERROR_MESSAGE);

				valid = false;
			}

			if (valid)
				{
					if (number < min || number > max)
					{
						JOptionPane.showMessageDialog(null,
						 "Number must be from " + min + " to " 
						 + max + ".\n", PROGRAM_NAME,
						  JOptionPane.PLAIN_MESSAGE);

						valid = false;
					}
				}
			
		} while (!valid);

		return number;
	}
	
}