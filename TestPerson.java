// TestPerson.java
// ----------------------------------------------------------------------
// Program: Test Person
// Programmer: Rebeka Henry
// Date: November 30, 2018
// ----------------------------------------------------------------------
// The class TestPerson tests the constructors, methods, and the toString
// method of the Person class. It has four methods including the main,
// test_constructors, test_methods, and test_toString methods. Each of
// these methods test whether the Person class works. It is meant to
// demonstrate usage of constructors, mutators, accessors, and methods
// that are overridden.
// ---------1---------2---------3---------4---------5---------6---------7
// 1234567890123456789012345678901234567890123456789012345678901234567890

public class TestPerson
{
   public static void main(String[] args)
   {
      test_constructors();
      test_methods();
      test_toString();
   }

   public static void test_constructors()
   {
      
	//testing constructor that takes four parameters of type string as args

      Person x = new Person("Rebeka Henry", "2905 Somewhere",
       "San Diego CA 92101", "6192553859"); 

   	System.out.println("Testing Constructors\n"
   		+ "--------------------\n"
   		+ "Person x = new Person(Rebeka Henry, 2905 Somewhere,"
         + "San Diego CA 92101, 6192553859);\n"
         + "x = " + x + "\n");

   //testing the copy constructor

   	Person y = new Person(x);

   	System.out.println("Person y = new Person(x);\n"
   		+ "y = " + y +"\n");
   }

   public static void test_methods()
   {
   	Person x = new Person();

   	System.out.println("Testing Methods\n"
   		+ "---------------\n"
   		+ "Person x = new Person ();\n"
   		+ "x = " + x + "\n");

   	//test the setters

   	x.setName("Alles Rebel");

   	System.out.println("x.setName(Alles Rebel);\n"
   		+ "x = " + x + "\n");

   	x.setStreet("3030 Somewhere Franklin");

   	System.out.println("x.setStreet(3030 Somewhere Franklin);\n"
   		+ "x = " + x + "\n");

   	x.setCityStateZip("San Diego CA 92103");

   	System.out.println("x.setCityStateZip(San Diego CA 92103);\n"
   		+ "x = " + x + "\n");

   	x.setPhone("6199258943");

   	System.out.println("x.setPhone((619)925-8943);\n"
   		+ "x = " + x + "\n");

   //test out the getters

   	x.getName();

   	System.out.println("x.getName();" + "\n" + x + "\n");

   	x.getStreet();

   	System.out.println("x.getStreet();" +"\n" + x + "\n");

   	x.getCityStateZip();

   	System.out.println("x.getCityStateZip();" +"\n" + x + "\n");

   	x.getPhone();

   	System.out.println("x.getPhone();" + "\n" + x + "\n");
   }

   public static void test_toString()
   {
   	Person x = new Person();
   	

   	System.out.println("Testing toString\n"
   		+ "---------------\n"
   		+ "Person x = new Person ();\n"
   		+ "x = " + x + "\n");
	x.toString();

   	System.out.println("x.toString();\n" 
   		+ "x = " + x + "\n");
   }
 }