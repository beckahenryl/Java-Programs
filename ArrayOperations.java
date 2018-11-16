// ArrayOperations.java
// ----------------------------------------------------------------------
// Program: Array Operations
// Programmer: Rebeka Henry
// Date: November 15, 2018
// ----------------------------------------------------------------------
// The class ArrayOperations has five static methods called: main, 
// getTotal, getAverage, getHighest, and getLowest. The main method has
// the array of numbers and a display statement that prints out the
// result of passing the array of numbers into the different methods. The
// method getTotal gets the total of the array. The method getAverage
// gets the average of the array. The method getHighest, gets the highest
// number within the array. And finally, the getLowest method gets the
// lowest number within the array.
// ---------1---------2---------3---------4---------5---------6---------7
// 1234567890123456789012345678901234567890123456789012345678901234567890


public class ArrayOperations
{
	/** 
	 The void main method contains the array of numbers and displays
	 the various methods passed to the array of numbers.
	*/

	public static void main (String [] args)
	{
		int [] numbers = {900, 29, 88, 40, 50};
		System.out.print("The Total of the array is: " 
			+ getTotal(numbers) + "\n" + "The Average of the array is: "
			+ getAverage(numbers) + "\n" + "The Highest number in the"
			+ " array is: " + getHighest(numbers) + "\n"+ "The lowest"
			+" number of the array is: " + getLowest(numbers));
	}

	/** 
	 The static method of type int getTotal passes a type int
	 arry that gets the total of all of the arrays. It returns
	 the total.

	 @param arry of type int is passed to it. This indicates the
	 user input that will be passed into the method.
	*/

	public static int getTotal(int [] arry)
	{
		int total = 0;
		for (int i = 0; i < arry.length; i++)
		{
			total += arry[i];
		}

		return total;
	}

	/** 
	 The static method of type double getAverage passes a type int arry
	 that gets the average of the arry. It returns the average.

	 @param arry of type int is passed to it. This indicates the
	 user input that will be passed into the method.
	*/

	public static double getAverage(int [] arry)
	{
		int total = 0;
		double average;
		for (int i = 0; i < arry.length; i++)
		{
			total += arry[i];
		}

		average = total / arry.length;

		return average;	
	}

	/** 
	 The static method of type int getHighest passes a type int arry
	 that gets the highest number in the arry. It returns highest.

	 @param arry of type int is passed to it. This indicates the
	 user input that will be passed into the method.
	*/

	public static int getHighest(int [] arry)
	{
		int highest = arry[0];

		for (int i= 1; i < arry.length; i++)
		{
			if (arry[i] > highest)
			{
				highest = arry[i];
			}
		}

		return highest;
	}

	/** 
	 The static method of type int getLowest passes a type int arry
	 that gets the lowest number in the arry. It returns lowest.

	 @param arry of type int is passed to it. This indicates the
	 user input that will be passed into the method.
	*/

	public static int getLowest(int [] arry)
	{
		int lowest = arry[0];

		for (int i = 1; i < arry.length; i++)
		{
			if (arry[i] < lowest)
			{
				lowest = arry[i];
			}	
		}

		return lowest;
	}
}