
/*What does the program ask for?
 * Write a program that prompts the user to enter a number within the range of 1 through 10. The program should display the Roman numeral version of that number. If the ­number is outside the range of 1 through 10, the program should display an error message.
*/

import java.util.Scanner;

public class RomanNumeral
{
	public static void main(String[] args)
	{
      Scanner cin = new Scanner (System.in);
      int get_number;
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
      System.out.print("The roman numeral for " + get_number + "is " + roman_numeral + "." );
	}
}