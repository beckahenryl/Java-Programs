import java.util.Scanner;

public class DisplayCharacter
{
	public static void main(String[] args)
	{
      Scanner cin = new Scanner (System.in);
      String get, upcase;
      char letter;
      System.out.print("Enter Y or N: ");
      get = cin.nextLine();        //get user input
      upcase = get.toUpperCase(); //make input upper case
      letter = upcase.charAt(0); //get first letter
      
      if (letter == 'Y'){
         System.out.print("Correct");
      }
      else if (letter == 'N'){
         System.out.print("Correct");
      }
      else {
         System.out.print("Error!\nTry again: ");
         get = cin.nextLine();
      }
	}
}