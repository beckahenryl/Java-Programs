
// Rectangle
// ---------------------------
// Programmer: Prof. Pelletier
// Date: Fall 2015
// ---------------------------
// This demonstrates how a class can be created for use in a Java program.
// This class is based on the Rectangle class in the textbook, but with
// some modifications to it.
//
// We created this in class during our lecture based on this UML diagram:
//
//    +--------------------------------+
//    | Rectangle Class                |
//    +--------------------------------+
//    | - length : double              | Private Fields
//    | - width : double               |
//    +--------------------------------+
//    | + Rectangle()                  | Constructors
//    | + Rectangle( length : double,  |
//    |              width : double )  |
//    +--------------------------------+
//    | + setLength( length : double ) | Mutators
//    | + setWidth( width : double )   | (setters)
//    | + setSize( length : double,    |
//    |            width : double )    |
//    +--------------------------------+
//    | + getLength() : double         | Accessors
//    | + getWidth() : double          | (getters)
//    | + getArea() : double           |
//    | + getPerimeter() : double      |
//    +--------------------------------+
//
// ---------1---------2---------3---------4---------5---------6---------7
// 1234567890123456789012345678901234567890123456789012345678901234567890

public class Rectangle
{
	// private fields -----------------------------
	private double length;
	private double width;
	
	// constructors -------------------------------
	public Rectangle()
	{
		length = 0;
		width = 0;
	}
	
	public Rectangle( double length, double width )
	{
		this.length = length;
		this.width = width;
	}
	
	// mutator methods ----------------------------
	public void setLength( double length )
	{
		this.length = length;
	}
	
	public void setWidth( double width )
	{
		this.width = width;
	}
	
	public void setSize( double length, double width )
	{
		this.length = length;
		this.width = width;
	}
	
	// accessor methods ---------------------------
	public double getLength()
	{
		return length;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double getArea()
	{
		double area = length * width;
		return area;
	}
	
	public double getPerimeter()
	{
		double perimeter = 2 * ( length + width );
		return perimeter;
	}
}	