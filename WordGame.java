// WordGame.java
// ----------------------------------------------------------------------
// Program: Word Game
// Programmer: Rebeka Henry
// Date: October 25, 2018
// ----------------------------------------------------------------------
// The program below gets input from the user whether name, age, city, college,
// Profession, animal or pet and then tells a story about the user
// ---------1---------2---------3---------4---------5---------6---------7
// 1234567890123456789012345678901234567890123456789012345678901234567890

import java.util.Scanner;

public class WordGame
{
   public static void main (String[] args)
   {
   
   String name, city, college, profession, animal, pet;
   int age;
   
   Scanner get_input = new Scanner (System.in);
   //get name, age, city, college, profession, animal, and pet from user
   System.out.print("Enter your name: ");
   name = get_input.nextLine();
   
   System.out.print("Enter your age: ");
   age = get_input.nextInt();
   
   //next line to prevent program from skipping user input
   get_input.nextLine();
   
   System.out.print("Enter the name of a city: ");
   city = get_input.nextLine();
   
   System.out.print("Enter the name of a college: ");
   college = get_input.nextLine();
  
   System.out.print("Enter a profession: ");
   profession = get_input.nextLine();
   
   System.out.print("Enter a type of animal: ");
   animal = get_input.nextLine();
   
   System.out.print("Enter a pet's name: ");
   pet = get_input.nextLine();
   
   //Display the story
   System.out.print("There was once a person named " + name + " who lived in " + city + ". At\n");
   System.out.print("the age of " + age + ", ");
   System.out.print(name + " went to college at " + college + ". " + name + " graduated and went to\n");
   System.out.print("work as a\n");
   System.out.print(profession + ". Then, " + name + " adopted a(n) " + animal + " named\n");
   System.out.print(pet + ". They both lived\n");
   System.out.print("happily ever after!");
  
 
   }

}