// TestScoresMain.java
// ----------------------------------------------------------------------
// Program: Test Scores Main Program
// Programmer: Rebeka Henry
// Date: November 9, 2018
// ----------------------------------------------------------------------
// The class TestScoresMain contains the method main that calls another
// class called TestScores. The purpose of the main method here is to
// get the name and the three test scores from the user. After doing so,
// we will be calling the accessor methods within the class TestScores
// and this will help us display the scores and the average. The accessor
// methods that are called here are getName, getScore1, getScore2, 
// getScore3, getAverage. The way that we called the class in is through
// the test variable assigned to the class TestScores.
// ---------1---------2---------3---------4---------5---------6---------7
// 1234567890123456789012345678901234567890123456789012345678901234567890

import java.util.Scanner;

public class TestScoresMain
{
	public static void main (String[] args)
	{
		
		Scanner cin = new Scanner(System.in);

		String name;
		int sc1, sc2, sc3;

		TestScores test; //calling the class TestScores


		System.out.print("Enter your name: ");
		name = cin.nextLine();

		System.out.print("Enter score 1: ");
		sc1 = cin.nextInt();

		System.out.print("Enter score 2: ");
		sc2 = cin.nextInt();

		System.out.print ("Enter score 3: ");
		sc3 = cin.nextInt();

		test = new TestScores(name, sc1, sc2, sc3);

		System.out.print("\n" + "Student Name: " + test.getName()
			+ "\n" +"Score 1: " + test.getScore1() + "\n" + "Score 2: " 
			+ test.getScore2() + "\n" + "Score 3: "+ test.getScore3 () 
			+ "\n" + "Test Average: " + test.getAverage()
			+ "\n\n");

	}
}