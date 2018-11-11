import java.util.Scanner;

public class DisplayResult
{
	public static void main(String[] args)
	{
      Scanner cin = new Scanner (System.in);
      int score;
      System.out.print("Enter Test Score: ");
      score = cin.nextInt();
      //score >= 0 && score <= 100){
      
      do {
         System.out.print("Re-enter Test Score: ");
         score = cin.nextInt();
      } while (score < 0 && score > 100);

	}
}
