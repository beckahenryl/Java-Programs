// ConversionProgram.java
// ----------------------------------------------------------------------
// Program: ConversionProgram
// Programmer: Rebeka
// Date: November 9, 2018
// ----------------------------------------------------------------------
// The class ConversionProgram calls different methods including the
// methods main, getMeters, showMenu, showKilometers, showInches, and
// showFeet. In the main method, it gives the user a choice of which 
// conversion that they want to make and then executes the methods. It 
// first calls the getMeters method to get the meters from user and then
// it calls the showMenu method in a loop so that it is displayed every 
// time the user enters one of the choices. Next, it goes through the 
// switch statement and calls each of the methods showKilometers, 
// showInches, and showFeet respectively. The program terminates if the
// user enters a four.
// ---------1---------2---------3---------4---------5---------6---------7
// 1234567890123456789012345678901234567890123456789012345678901234567890

import java.util.Scanner;

public class ConversionProgram
{
	/** 
	 The method main calls the methods getMeters, showMenu,
	 showKilometers, showInches, and showFeet.
	*/

	public static void main( String[] args )
	{
		Scanner kb = new Scanner(System.in);
		int meters, choice;
		
		meters = getMeters(kb);

		do
		{
			showMenu();
			
			System.out.print( "\n" +
				"Enter your choice: " );
			choice = kb.nextInt();
			
			switch(choice)
			{
				case 1:
					showKilometers(meters);
				break;
				
				case 2:
					showInches (meters);
				break;
				
				case 3:
					showFeet(meters);
				break;

				case 4:
					System.out.print("Bye!");		
			}
			
			
		} while( choice!= 4 );
				
	}
	
	/** 
	 The method getMeters gets the meter distance form the user and checks
	 whether it is a negative number. @param kb of type Scanner is passed
	 to the local variable meters of type int. This method returns meters.
	*/

	public static int getMeters( Scanner kb )
	{
		int meters;
		
		System.out.print( "\n" +
			"Enter a distance in meters: " );
		meters = kb.nextInt();
		
		while( meters < 0 )
		{
			System.out.print( "Meters must not be negative.\n" +
				"Enter a distance in meters: " );
			meters = kb.nextInt();
		}
		
		return meters;
		
	}
	
	// -------------------------------------------------------------------
	
	/** 
	 The method showMenu of type void does not pass any parameters but
	 shows the menu to the user to pick the different operations.
	*/

	public static void showMenu()
	{
		System.out.print( "\n" +
			"1. Convert to Kilometers\n" +
			"2. Convert to Inches\n" +
			"3. Convert to Feet\n" + 
			"4. Quit the Program\n" );
	}	

	/** 
	 The method of type void showKilometers converts meters into kilometers
	 and displays the result. @param meter of type int is passed to the
	 method
	*/

	public static void showKilometers(int meters)
	{
		double kilometer;

		kilometer = (double) meters * 0.001;

		System.out.printf("%d is %4.1f Kilometers", meters, kilometer);
	}
	
	
	/** 
	 The method of type void showInches converts meters into inches and 
	 displays the result. @param meter of type int is passed to the method.
	*/

	public static void showInches(int meters)
	{
		double inches;

		inches = (double) meters * 3.37;

		System.out.printf("%d is %4.1f Inches", meters, inches);
	}
	
	/** 
	 The method of type void showFeet converts meters into inches and
	 displays the result. @param meter of type int is passed to the method.
	*/

	public static void showFeet(int meters)
	{
		double feet;

		feet = (double) meters * 3.281;

		System.out.printf("%d is %4.1f Feet", meters, feet);
	}
	
}
	