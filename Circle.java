// Circle.java
// ----------------------------------------------------------------------
// Program: Circle Class
// Programmer: Rebeka Henry
// Date: November 9, 2018
// ----------------------------------------------------------------------
// The Circle class contains the private fields of type int and final
// double called radius and PI respectively. Within the class, there
// are two constructors. The first contructor Circle is accepts the 
// radius of the circle as an argument. The second constructor Circle,
// does not accept an argument but it does set the radius field to 0.0
// and next, we have the mutators and accessors. We have a mutuator called
// setRadius that modifies the data and holds radius. We have a accessor
// called getRadius that returns the radius. We also have three accessors
// called getArea, getDiameter, and getCircumference that calculate the
// area, diameter and circumference and then return each value.
// ---------1---------2---------3---------4---------5---------6---------7
// 1234567890123456789012345678901234567890123456789012345678901234567890

public class Circle
{
	
	/** 
	 Declaration of the private fields of the class of type double and
	 final double called radius and PI respectively.
	*/
	private double radius;
	private final double PI = 3.14159;

	/** 
	 Constructor Circle created to call the radius and disambiguate
	 using this so that we know that we are referencing the variable
	 radius.

	 @param radius of type double is passed to the constructor
	*/

	public Circle(double radius)
	{
		this.radius = radius;
	}

	/** 
	 Constructor Circle created to set the radius to 0.0. It
	 does not take any arguments.
	*/

	public Circle ()
	{
		radius = 0.0;
	}

	/** 
	 The void mutuator setRadius passes the radius using this 
	 which modifies the data and sets the radius field to the
	 radius variable.

	 @param radius of type double is passed as an argument to 
	 the mutuator.
	*/

	public void setRadius (double radius)
	{
		this.radius = radius;
	}

	/** 
	 The double accessor getRadius returns the radius and it
	 does not take any arugments.
	*/
	public double getRadius ()
	{
		return radius;
	}

	/** 
	 The double accessor getArea calculates the area and 
	 returns it. It does not take any arguments.
	*/
	public double getArea ()
	{
		double area;

		area = PI * radius * radius;

		return area;
	}

	/** 
	 The double accessor getDiameter calculates the diameter
	 and returns it. It does not take any arguments.
	*/

	public double getDiameter ()
	{
		double diameter;

		diameter = radius * 2;

		return diameter;
	}

	/** 
	 The double accessor getCircumference calculates the 
	 circumference and returns it. It does not take any arguments.
	*/

	public double getCircumference ()
	{
		double circumference;

		circumference = 2 * PI * radius;

		return circumference;
	}
}