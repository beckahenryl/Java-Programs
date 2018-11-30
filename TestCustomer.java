// TestCustomer.java
// ----------------------------------------------------------------------
// Program: Test Customer
// Programmer: Rebeka Henry
// Date: November 30, 2018
// ----------------------------------------------------------------------
// The class TestCustomer tests the constructors, methods, and the
// toString method of the Customer class. It has four methods including
// the main, test_constructors, test_methods, and test_toString methods.
// Each of these methods tests whether the Customer class works. It is
// meant to demonstrate usage of constructors, mutators, accessors, and
// methods that are overridden. It also takes into consideration the super
// class Person as it is referenced by the super keyword in the toString
// method.
// ---------1---------2---------3---------4---------5---------6---------7
// 1234567890123456789012345678901234567890123456789012345678901234567890

public class TestCustomer
{
	public static void main (String[] args)
	{
		test_constructors();
		test_methods();
		test_toString();
	}

	public static void test_constructors()
	{
		
	//testing the constructor that takes five parameters

		Customer x = new Customer("Rebeka Henry", "2905 Somewhere",
         + "San Diego CA 92101", "6192553859", true);

		System.out.println("Testing Constructors\n"
   		+ "--------------------\n"
   		+ "Customer x = new Customer(Rebeka Henry, 2905 Somewhere,"
         + "San Diego CA 92101, 6192553859);\n"
         + "x = " + x + "\n");

	//testing the copy constructor

		Customer y = new Customer(x)

		System.out.println("Customer y = new Customer(x);\n"
   		+ "y = " + y +"\n");
	}

	public static void test_methods()
	{
		Customer x = new Customer();

		System.out.println("Testing Methods\n"
   		+ "---------------\n"
   		+ "Customer x = new Customer ();\n"
   		+ "x = " + x + "\n");

	//testing the setters

   		x.setCustomerID("2929394");

   		System.out.println("x.setCustomerID(2929394);\n"
   		+ "x = " + x + "\n");

   		x.setMailingList(true);

   		System.out.println("x.setMailingList(true);\n"
   		+ "x = " + x + "\n");

   	//testing the getters
   	
   		x.getCustomerID();

   		System.out.println("x.getCustomerID();" + "\n" + x + "\n");	

   		x.getMailingList();

   		System.out.println("x.getMailingList();" + "\n" + x + "\n");

	}

	public static void test_toString()
	{
		Customer x = new Customer();

	//testing toString that calls the super class toString
		x.super.toString();

		System.out.println("x.super.toString();" + "\n" + x + "\n");


	}
}