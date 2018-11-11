// TestAverageGrade.java
// ----------------------------------------------------------------------
// Program: Test Average Grade
// Programmer: Rebeka Henry
// Date: November 8, 2018
// ----------------------------------------------------------------------
// The class TestAverageGrade defines three methods: calcAverage,
// determineGrade, and main. The calcAverage method returns the average, 
// while the determineGrade method returns the letter grade associated
// with the average. The main method gets the five scores from the user,
// calls the two methods calcAverage and determineGrade, and then
// displays the average and letter grade associated with it.
// ---------1---------2---------3---------4---------5---------6---------7
// 1234567890123456789012345678901234567890123456789012345678901234567890

import java.util.Scanner;

public class TestAverageGrade
{
	/** 
	 The main method takes the five scores from the user,
	 calls the calcAverage and determineGrade methods, 
	 and displays them. calcAverage is stored in the 
	 variable calculate. determineGrade is stored in
	 the variable grade.
	*/

	public static void main(String[] args)
	{
		Scanner cin = new Scanner (System.in);

		int score1, score2, score3, score4, score5;
		double calculation;
		char grade;

		System.out.print("Test score 1: ");

		score1 = cin.nextInt();

		System.out.print("Test score 2: ");

		score2 = cin.nextInt();

		System.out.print("Test score 3: ");

		score3 = cin.nextInt();

		System.out.print("Test score 4: ");

		score4 = cin.nextInt();

		System.out.print("Test score 5: ");

		score5 = cin.nextInt();
		
		calculation = calcAverage(score1, score2, score3, score4,
			score5);

		grade = determineGrade(calculation);

		System.out.print("Test Average: " + calculation + "\n"
			+ "Letter Grade: " + grade);
	}

	/** 
	 The method calcAverage accepts five test scores
	 from the user (as parameters) and returns the 
	 average of the test scores as a floating point
	 value of type double.
	*/

	public static double calcAverage (int g1, int g2, int g3, int g4,
		int g5)
	{
		double average;

		average = (double)(g1 + g2 + g3 + g4 + g5) / 5;
		
		return average;
	}

	/** 
	 The method determineGrade takes the return value average
	 from the calcAverage method (as a parameter) and returns 
	 a letter grade as character.
	*/

	public static char determineGrade(double average)
	{ 
		char gradeABCDF;
		
		gradeABCDF = 0;

		if (average >= 90)
		{
			gradeABCDF = 'A';
		}
		else if (average >= 80)
		{
			gradeABCDF = 'B';
		}
		else if (average >= 70)
		{
			gradeABCDF = 'C';
		}
		else if (average >= 60)
		{
			gradeABCDF = 'D';
		}
		else if (average >= 50)
		{
			gradeABCDF = 'F';
		}
		return gradeABCDF;
	}
}