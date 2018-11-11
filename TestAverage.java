// TestAverage.java
// ----------------------------------------------------------------------
// Program: Test Average
// Programmer: Rebeka Henry
// Date: October 25, 2018
// ----------------------------------------------------------------------
// The program below gets three test results from the user. It then
// Calculates average by getting the sum of the test scores and dividing
// by 3. After conducting the calculation, the program displays the 
// each test score and the average of the test scores
// ---------1---------2---------3---------4---------5---------6---------7
// 1234567890123456789012345678901234567890123456789012345678901234567890

import java.util.Scanner;

public class TestAverage
{
   public static void main (String[] args)
   {
   int test1, test2, test3, sum;
   double Average;
   //get 3 test results from the user
   Scanner get_input = new Scanner (System.in);
   
   System.out.print("Enter the result of Test 1: ");
   test1 = get_input.nextInt();
   
   System.out.print("Enter the result of Test 2: ");
   test2 = get_input.nextInt();
   
   System.out.print("Enter the result of Test 3: ");
   test3 = get_input.nextInt();
   
   //calculate the average of the test results
   sum = test1+ test2+ test3;
   Average = (double)sum / 3;
  
   //display the results
   System.out.println("Test 1: " + test1);
   System.out.println("Test 2: " + test2);
   System.out.println("Test 3: " + test3);
   System.out.println("Average: " + Average);
  
 
   }

}