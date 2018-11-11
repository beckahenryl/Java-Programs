import java.util.Scanner;

public class MemberShip
{
 public static void main(String[] args)
 {
 
 int points;
 String level;
 Scanner get_input = new Scanner (System.in);
 points = get_input.nextInt();
 if (points >= 800){
   System.out.println("GOLD");
 }
 else if (points >= 500 && points <= 799){
   System.out.println("SILVER");
   }
 else if (points >= 200 && points <= 499){
   System.out.println("BRONZE");
 }
 else if (points != 5 ||points != 9 || points != 20){
   System.out.println("TESTING");
 }  
 
 else{
   System.out.println("COPPER");
   }
 }

}