// TestScores.java
// ----------------------------------------------------------------------
// Program: Test Scores Class
// Programmer: Rebeka Henry
// Date: November 9, 2018
// ----------------------------------------------------------------------
// The TestScores class contains fields, constructors, mutators, and 
// accessor methods that are meant to save the name, score1, score2, and
// score3 from the main method. The fields of the class are private to
// the class and they are name, score1, score2, and score3. The
// constructors have the same name as the class but pass different
// parameters if any. There are three constructors of the class. The
// mutators modified the fields of the class. The accessor methods 
// returned the modified fields of the class. The accessor methods are
// getName, getScore1, getScore2, getScore3, and getAverage. getAverage
// calculates the average of score1, score2, and score3.
// ---------1---------2---------3---------4---------5---------6---------7
// 1234567890123456789012345678901234567890123456789012345678901234567890


public class TestScores
{
	
	/** 
	 Declaration of the private fields of the class of type String
	 name and type int score1, score2, score3.
	*/

	private String name;
	private int score1, score2, score3;

	/** 
	 Constructor TestScores created to call all of the objects
	 within the class that were declared in the private fields.
	*/

	public TestScores()
	{
		name = "";
		score1 = 0;
		score2 = 0;
		score3 = 0;

	}

	/** 
	 Constructor TestScores passes the String name and disambiguates
	 it with this in order to make sure that the program knows that
	 it is a variable reference.
	 
	 @param name of type String is disambiguated.
	*/

	public TestScores(String name)
	{
		this.name = name;
		score1 = 0; 
		score2 = 0;
		score3 = 0;

	}

	/** 
	 Constructor TestScores passes the String name, int score1,
	 int score2, and int score3 and ensures that the program knows
	 that we are making a variable reference and setting each
	 passed parameter to its corresponding field.

	 @param name of type String is disambiguated with this
	 @param score1 of type int is disambiguated with this
	 @param score2 of type int is disambiguated with this
	 @param score3 of type int is disambiguated with this 
	*/

	public TestScores (String name, int score1, int score2, int score3)
	{
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;

	}


	 /** 
	 The mutator methods of type void are the
	 following: setName, setScore1, setScore2, 
	 and setScore3 and they all accept parameters
	 to be modified. The "this" key word here is used
	 so that we can disambiguate the reference variable
	 from the local variable to the method.

	 @param name of type String is disambiguated with this
	 @param score1 of type int is disambiguated with this
	 @param score2 of type int is disambiguated with this
	 @param score3 of type int is disambiguated with this 
	*/

	public void setName (String name)
	{
		this.name = name;
	}

	public void setScore1(int score1)
	{
		this.score1 = score1;
	}
	public void setScore2 (int score2)
	{
		this.score2 = score2;
	}
	public void setScore3 (int score3)
	{
		this.score3 = score3;
	}

	 /** 
	 The accessor methods of type String and int are
	 getName, getScore1, getScore2, getScore3 and getAverage,
	 respectively. They return each one of the mutator methods
	 that were modified in the above code. They do not pass
	 any parameters.
	*/

	public String getName ()
	{
		return name;
	}

	public int getScore1 ()
	{
		return score1;
	}
	public int getScore2 ()
	{
		return score2;
	}
	public int getScore3 ()
	{
		return score3;
	}

	public int getAverage ()
	{
		double average;
		int intAverage;

		average = (score1 + score2 + score3) / 3.0;
		intAverage = (int) (average + 0.5);
		return intAverage;
	}
}