// CoinTossSimulator.java
// ----------------------------------------------------------------------
// Program: Coin Toss Simulator
// Programmer: Rebeka Henry
// Date: November 9, 2018
// ----------------------------------------------------------------------
// The class CoinTossSimulator contains the method main that calls 
// another class called Coin. The purpose of the main method is
// to do call methods from the class Coin that tosses the coin.
// after tossing the coin, the side of the coin that came up is
// dispalyed by calling the getSideUp accessor method. Afterwards,
// the for loop is used to toss the coin twenty times. And finally,
// we display the coinType and the number of times it came up as 
// heads and then the number of times that it came up as tails. The
// classis called through the variable coin that is assigned to Coin.
// ---------1---------2---------3---------4---------5---------6---------7
// 1234567890123456789012345678901234567890123456789012345678901234567890

public class CoinTossSimulator
{
	public static void main (String[] args)
	{
		Coin coin = new Coin();

		coin.toss();

		System.out.println("The coin came up: " +
			coin.getSideUp() + ".");

		for (int t = 0; t <= 20; t++)
		{
			coin.toss();
		}

		System.out.println("The " + coin.getCoinType() +
			" came up heads " + coin.getHeadCount() +
			" times. The " + coin.getCoinType() +
			" came up tails " + coin.getTailCount() +
			" times.");

	}
}