// SalesTax.java
// ----------------------------------------------------------------------
// Program: Sales Tax
// Programmer: Rebeka Henry
// Date: October 25, 2018
// ----------------------------------------------------------------------
// The program below gets the total purchase amount from the user,
// Calculates the state and county sales tax (4% and 2% respectively),
// And then displays the amount of the purchase, the state sales tax, 
// the county sales tax, the total sales tax, and the total of the sale
// ---------1---------2---------3---------4---------5---------6---------7
// 1234567890123456789012345678901234567890123456789012345678901234567890

import java.util.Scanner;

public class SalesTax
{
   public static void main (String[] args)
   {
   double amount;
   //get the total purchase amount from the user
   Scanner get_input = new Scanner (System.in);
   System.out.print("Enter the amount of the purchase: $");
   amount = get_input.nextDouble();
   //goes to the nextline for readability
   get_input.nextLine();
   //conduct the calculations of each tax rate
   double STATE_TAX_RATE = 0.04;
   double COUNTY_TAX_RATE = 0.02;
   double stateTax= amount * STATE_TAX_RATE;
   double countyTax = amount * COUNTY_TAX_RATE;
   double totalTax = stateTax + countyTax;
   double totalSale = amount + stateTax + countyTax;
   //display the results
   System.out.println("Amount of the purchase: $" + amount);
   System.out.println("State Sales Tax: $" + stateTax);
   System.out.println("County Sales Tax: $" + countyTax);
   System.out.println("Total Sales Tax: $" + totalTax);
   System.out.println("Total Sale: $" + totalSale);
 
   }

}