// LargestSmallest.java
// ----------------------------------------------------------------------
// Program: Largest and Smallest
// Programmer: Rebeka Henry
// Date: October 31, 2018
// ----------------------------------------------------------------------
// The program below allows the user to enter a series of integers. It then
// Continues to loop until the user enters -99. After the user enters the
// Integers and stops the program by entering -99, the program will go through
// Each of the inputs and determine the smallest and largest numbers.
// ---------1---------2---------3---------4---------5---------6---------7
// 1234567890123456789012345678901234567890123456789012345678901234567890

import java.util.Scanner;

public class LargestSmallest
{
	public static void main(String[] args)
	{

            Scanner cin = new Scanner (System.in);

            int num, largest, smallest;
            System.out.print("Enter number: ");
            num = cin.nextInt();
            largest = num;
            smallest = num;

            while (num != -99){           //checks if the num entered is -99
                  if (num > largest){
                        largest = num;    //assigns largest to num
                  }
                  else if (num < smallest){
                        smallest = num;   //assigns smallest to num
                  }
                num = cin.nextInt();  
            }

            if (largest == -99){          //when largest num is -99 then
                  System.out.print("No numbers were entered");
            }
            else{                         //if not print out largest and smallest numbers
                  System.out.print("The largest number is " + largest
                                    + "\nThe smallest number is " + smallest);

            }
      }
}