// LineNumbers.java
// ----------------------------------------------------------------------
// Program: Line Numbers
// Programmer: Rebeka Henry
// Date: October 31, 2018
// ----------------------------------------------------------------------
// The program below allows the user to open an existing file. It first 
// Prompts the user using FileName, then it creates a file instance to
// Save the file and then it reads the file through the inputFile scanner.
// After reading the file, it uses the while loop to check if the file has
// Data in it and if it does, it reads each line in the file, and displays
// What the file looks in the console. After this operation is complete,
// The program finally closes the file.
// ---------1---------2---------3---------4---------5---------6---------7
// 1234567890123456789012345678901234567890123456789012345678901234567890

import java.util.Scanner;
import java.io.*;                                           //to access file and IOException

public class LineNumbers
{
	public static void main(String[] args) throws IOException
	{

            Scanner cin = new Scanner (System.in);

            String FileName, line;
            int lineNum = 0;

            System.out.print("Enter file name: ");
            FileName = cin.nextLine();
            File file = new File (FileName);               //create new instance of the file
            Scanner inputFile = new Scanner (file);        //read the file through


            while (inputFile.hasNext()){                   //check if file has data
                line = inputFile.nextLine();               //read lines in file 
                lineNum +=1;                               //keep track of number of lines
                System.out.println(lineNum + ":" + line);  //display the results
            }
            inputFile.close(); 
      }
}