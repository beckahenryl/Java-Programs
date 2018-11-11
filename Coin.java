// Coin.java
// ----------------------------------------------------------------------
// Program: Coin Class
// Programmer: Rebeka Henry
// Date: November 9, 2018
// ----------------------------------------------------------------------
// The Circle class contains the private fields of type String, int, and
// Random called sideUp, coinType, headCount, tailCount, and rand
// respectively. Within the class, there are two constructors. The first
// constructor, does not accept an argument but it does set the values of
// the private fields to empty string for sideUp, the string coin for
// coinType, 0 for the headCount, 0 for the tailCount, and new Random()
// for rand. The second constructor has one argument of the string type
// called coinType. It initializes the private field values in the first
// constructor using this() and it overides the coinType private field
// with the argument that is passed. Next, there is a void mutator 
// called toss that simulates the coin toss using rand. If the value
// is zero, it is accepted as a heads and if it is not, then it is
// accepted as tails. This mutator keeps count of how many heads and
// how many tails with each toss. Finally, there are three accessors of
// type string and int. They are: getSideUp, getHeadCount, getTailCount,
// and get coinType. Each of them returns a value whether it is sideUp,
// headCount, tailCount, or coinType.
// ---------1---------2---------3---------4---------5---------6---------7
// 1234567890123456789012345678901234567890123456789012345678901234567890

import java.util.Random;

public class Coin
{
	/** 
	 Declaration of the private fields of the class of type String, int,
	 and Random called sideUp, coinType, headCount, tailCount, and rand
	 respectively.
	*/
	private String sideUp, coinType;
	private int headCount, tailCount;
	private Random rand; 

	/** 
	 Constructor Coin does not pass any arguments. But it does set
	 sideUp equal to an empty string, coinType to coin, headCount to
	 0, tailCount to 0 and rand to new Random().
	*/

	public Coin()
	{
		sideUp = "";
		coinType = "coin";
		headCount = 0;
		tailCount = 0;
		rand = new Random();
	}

	/** 
	 Constructor Coin passes an argument String called coinType to
	 coinType. It is essentially overriding the coinType private
	 field with the argument. It also initializes all of the private
	 fields.

	 @param coinType of type String is passed to the constructor
	*/

	public Coin(String coinType)
	{
		this();
		this.coinType = coinType;
	}
// ----------------------------------------------------------------------
	/** 
	 The void mutator toss does not pass an argument but it does create 
	 a variable of type int called value that calles the Random class
	 using rand.nextInt(2). In this case, if the value is zero, it is
	 accepted as heads but if the value is not, then it is accepted as 
	 tails. This mutator also keeps track of the headCount and tailCount
	 for the program.
	*/

	public void toss()
	{
		int value = rand.nextInt(2);

		if( value == 0 )
		{
			sideUp = "heads";
			headCount++;
		}
		else
		{
			sideUp = "tails";
			tailCount++;
		}
	}

	/** 
	 The String accessor getSideUp returns the sideUp and it
	 does not take any arugments.
	*/

	public String getSideUp()
	{
		return sideUp;
	}

	/** 
	 The int accessor getHeadCount returns the headCount and it
	 does not take any arugments.
	*/

	public int getHeadCount()
	{
		return headCount;
	}

	/** 
	 The int accessor getTailCount returns the tailCount and it
	 does not take any arugments.
	*/

	public int getTailCount()
	{
		return tailCount;
	}

	/** 
	 The String accessor getCoinType returns the coinType and it
	 does not take any arugments.
	*/

	public String getCoinType()
	{
		return coinType;
	}

}