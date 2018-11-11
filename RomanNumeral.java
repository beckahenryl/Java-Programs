// RomanNumeral.java
// ----------------------------------------------------------------------
// Program: Roman Numeral
// Programmer: Rebeka Henry
// Date: October 31, 2018
// ----------------------------------------------------------------------
// The program below uses gets an integer number from the user and uses a
// Switch statement to go see if the number corresponds to a roman numeral
// String and if it does, the program prints out the number given and the
// Corresponding roman numeral
// ---------1---------2---------3---------4---------5---------6---------7
// 1234567890123456789012345678901234567890123456789012345678901234567890

import java.util.Scanner;

public class RomanNumeral
{
	public static void main(String[] args)
	{

            Scanner cin = new Scanner (System.in);

            int get_number;

            System.out.print("Enter a number: ");

            get_number = cin.nextInt();

            String roman_numeral;

            switch(get_number){
            	case 1: roman_numeral = "I";
                  break;
            	case 2: roman_numeral = "II";
                  break;
            	case 3: roman_numeral = "III";
                  break;
            	case 4: roman_numeral = "IV";
                  break;
            	case 5: roman_numeral = "V";
                  break;
            	case 6: roman_numeral = "VI";
                  break;
            	case 7: roman_numeral = "VII";
                  break;
            	case 8: roman_numeral = "VIII";
                  break;
            	case 9: roman_numeral = "IX";
                  break;
            	case 10: roman_numeral = "X";
                  break;
            	default: roman_numeral = "Invalid Entry";
            }
      System.out.print("The roman numeral for " + get_number + " is " + roman_numeral + "." );
      }
}