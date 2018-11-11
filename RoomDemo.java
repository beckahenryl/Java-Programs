// RoomDemo
// ---------------------------
// Programmer: Prof. Pelletier
// Date: Fall 2015
// ---------------------------
// This program demonstrates how we can use the Rectangle class that we
// created in a separate file. This program does not demonstrate every
// method, but it would be a good idea to test out your class to make
// sure that every method in that class is working properly.
//
// In this demonstration I used the analogy of a room being a rectangle.
// In a later chapter we will see how we can create a Room class from a
// Rectangle class using inheritence, but we will not do that today.
//
// Today we will just see how to create, access, and manipulate objects
// using constructors, accessors, and mutator methods.
//
// ---------1---------2---------3---------4---------5---------6---------7
// 1234567890123456789012345678901234567890123456789012345678901234567890

import java.util.Scanner;

public class RoomDemo
{
	public static void main( String[] args )
	{
	// I prefer to have all of the cast assembled in the top of the
	// of the program. It gives the programmer an idea of what the program
	// is going to do.
	
		Scanner key = new Scanner( System.in );
		
		Rectangle livingroom = new Rectangle( 12, 10 );
		Rectangle bedroom = new Rectangle( 10, 10 );
		Rectangle masterBedroom = new Rectangle( 16, 12 );
		
		Rectangle newRoom = new Rectangle();
		double length, width;
		
		Rectangle yetAnotherRoom;
		Rectangle lastRoom;
		
		// We wrote a static method like the kind we used in the previous
		// chapter. This static method will display the contents of a given
		// Rectangle. Look for its definition below the main.
				
		displayRoom(livingroom, "Living room" );
		displayRoom(bedroom, "Bedroom" );
		displayRoom(masterBedroom, "Master bedroom" );
		
	// ------------------------------------------------------------------
	// This demonstrates how we can put data into a variable and
	// use that variable with the setSize method to set or change
	// the size of a Rectangle called newRoom.
	
		System.out.print( "\nEnter new room dimensions.\n"
				+ "Length: " );
		length = key.nextDouble();
		
		System.out.print ( "Width: " );
		width = key.nextDouble();
		
		newRoom.setSize( length, width);
		
		displayRoom(newRoom, "New Room" );
		
	// ------------------------------------------------------------------
	// This demonstrates how we can do the same thing without variables.
		
		System.out.print( "\nEnter new room dimensions.\n"
				+ "Length: " );
		newRoom.setLength(key.nextDouble());
		
		System.out.print ( "Width: " );
		newRoom.setWidth(key.nextDouble());
		
		displayRoom(newRoom, "New Room" );
		
	// ------------------------------------------------------------------
	// This demonstrates how we can create a new Rectangle called
	// anotherRoom in the middle of a program. I prefer that you do not
	// do it like this, but instead, create the reference variable at
	// the top and create a new Rectangle for it.
		
		Rectangle anotherRoom = new Rectangle(); 
		
		System.out.print( "\nEnter another room dimensions.\n"
				+ "Length: " );
		anotherRoom.setLength(key.nextDouble());
		
		System.out.print ( "Width: " );
		anotherRoom.setWidth(key.nextDouble());
		
		displayRoom(anotherRoom, "Another Room" );
		
	// ------------------------------------------------------------------
	// This demonstrates how to use a reference variable to a Rectangle
	// that was created at the top of the program to create a Rectangle
	// in the middle of the program.
		
		yetAnotherRoom = new Rectangle(); 
		
		System.out.print( "\nEnter yet another room dimensions.\n"
				+ "Length: " );
		yetAnotherRoom.setLength(key.nextDouble());
		
		System.out.print ( "Width: " );
		yetAnotherRoom.setWidth(key.nextDouble());
		
		displayRoom(yetAnotherRoom, "Yet Another Room" );
		
	// ------------------------------------------------------------------
	// This demonstrates another way to use a reference variable to a 
	// Rectangle that was created at the top of the program to create a 
	// Rectangle in the middle of the program.

		System.out.print( "\nEnter last room dimensions.\n"
				+ "Length: " );
		length = key.nextDouble();
		
		System.out.print ( "Width: " );
		width = key.nextDouble();
		
		lastRoom = new Rectangle( length, width );
		
		displayRoom(lastRoom, "Last Room" );

	}
	
// ----------------------------------------------------------
	
	public static void displayRoom( Rectangle room, String name )
	{
		System.out.print( name + ": " + room.getArea()
					+ " sqft\n"
					+ "This room is a " 
					+ room.getLength() + " ft by "
					+ room.getWidth() + " ft room\n"
					+ "with a perimeter of "
					+ room.getPerimeter() + " ft.\n\n" );
	}
	
}