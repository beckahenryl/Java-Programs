// CircleMain.java
// ----------------------------------------------------------------------
// Program: Circle Main
// Programmer: Rebeka Henry
// Date: November 9, 2018
// ----------------------------------------------------------------------
// The class CircleMain contains the method main that calls another class
// called Circle. The purpose of the main method is to get the radius
// from the user and call the class Circle accessor methods getArea,
// getDiameter, and getCircumference and display the results after having
// passed the radius from the user to the methods. The class is called
// through the variable circle that is assigned to Circle.
// ---------1---------2---------3---------4---------5---------6---------7
// 1234567890123456789012345678901234567890123456789012345678901234567890


import java.util.Scanner;

public class CircleMain
{
	public static void main (String[] args)
	{
		Scanner cin = new Scanner(System.in);
		double rad;
		Circle circle;            //calling the class Circle

		System.out.print("Enter the radius: ");
		rad = cin.nextDouble();

		circle = new Circle(rad); //passing radius to Circle

		System.out.print("\n" + "Area: " + circle.getArea()
			+ "\n" + "Diameter: " + circle.getDiameter() + "\n"
			+ "Circumference: " + circle.getCircumference() 
			+ "\n\n");
	}
}