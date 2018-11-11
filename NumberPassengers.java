import java.util.Scanner;

public final class CharactersInput
{
   public static void main (String[] args)
   {
   String input;
   char answer;
   Scanner cin = new Scanner (System.in);
   System.out.print("Are you happy today? Enter Y or N: ");
   input = cin.nextLine();
   answer = input.charAt(0);
   }

}