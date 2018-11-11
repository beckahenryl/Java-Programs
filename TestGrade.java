// TestGrade.java
// ----------------------------------------------------------------------
// Program: Test Scores and Grade
// Programmer: Rebeka Henry
// Date: October 31, 2018
// ----------------------------------------------------------------------
// The program below gets three scores from the user and calculates the 
// Average of the three scores. It then tells the user the average of
// Their test scores and the the letter grade associated with it. The
// Program takes into consideration that the average can be rounded up
// Or down and so it determines the actual grade after rounding and 
// prints out that result
// ---------1---------2---------3---------4---------5---------6---------7
// 1234567890123456789012345678901234567890123456789012345678901234567890

import java.util.Scanner;

public class TestGrade
{
	public static void main(String[] args)
	{

            Scanner cin = new Scanner (System.in);

            int score1, score2, score3;
            double average;

            System.out.print("Enter a Test Score 1: ");

            score1 = cin.nextInt();

            System.out.print("Enter Test Score 2: ");

            score2 = cin.nextInt();

            System.out.print("Enter Test Score 3: ");

            score3 = cin.nextInt();

            average = (score1 + score2 + score3)/ 3.0;

            if (average > 100){
                  System.out.print("Error!");
            }
            else if (average >= 89.5){
                  System.out.printf("Average: %f\nGrade: A", average);
            }
            else if (average >= 89.4){
                  System.out.printf("Average: %f\nGrade: B", average);
            }
          
            else if (average >= 79.5){
                  System.out.printf("Average: %f\nGrade: B", average);
            }
            else if (average >= 79.4){
                  System.out.printf("Average: %f\nGrade: C", average);
            }
            else if (average >= 69.5){
                  System.out.printf("Average: %f\nGrade: C", average);
            }
            else if (average >= 69.4){
                  System.out.printf("Average: %f\nGrade: D", average);
            }
            else if (average <= 60){
                  System.out.printf("Average: %f\nGrade: F", average);
            }
            else {
                  System.out.print("Incorrect Inputs");
            }
      }
}