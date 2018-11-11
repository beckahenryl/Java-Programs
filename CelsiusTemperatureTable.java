// CelsiusTemperatureTable.java
// ----------------------------------------------------------------------
// Program: Celsius Temperature Table
// Programmer: Rebeka Henry
// Date: November 8, 2018
// ----------------------------------------------------------------------
// The class CelsiusTemperatureTable includes a method calcCelsius that 
// converts the Fahrenheit temperature to Celsius. Then, calcCelsius
// is used to display in a for loop the conversion of a range of numbers
// that are from 94.0 to 104.0. These calculations are formatted in a
// table.
// ---------1---------2---------3---------4---------5---------6---------7
// 1234567890123456789012345678901234567890123456789012345678901234567890

public class CelsiusTemperatureTable
{
	
	/** 
	 The method calcCelsius converts the temperature
	 in Fahrenheit (fDeg) to Celsius.
	*/

	public static double calcCelsius (double fDeg)
	{
		double cel;
		cel = ((fDeg - 32) * 5)/9;
		return cel;
	}
	public static void main(String[] args)
	{
		double variable;

		System.out.print("Temperature Conversion Table\n"
			+"----------------------------\n  "
			+"Fahrenheit      Celsius  \n");
		
		for (variable = 94.0; variable <= 104.0; variable += 0.5){
			System.out.printf( "    %5.1f           %4.1f\n", 
                   variable, calcCelsius(variable) );
		}

	}
}