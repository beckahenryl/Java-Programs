// Customer.java
// ----------------------------------------------------------------------
// Program: Customer
// Programmer: Rebeka Henry
// Date: November 30, 2018
// ----------------------------------------------------------------------
// The class Customer is a subclass of the Person class and as such,
// it extends it. It has two private fields of type String and boolean,
// called customerID and mailingList, respectively. It also calls upon
// methods from the Person class called name, street, cityStateZip,
// and phone of type String using the super keyword. And finally, it
// uses the method toString from the Person class and calls upon it
// using the super keyword. The purpose of this class is to demonstrate
// inheritance.
// ---------1---------2---------3---------4---------5---------6---------7
// 1234567890123456789012345678901234567890123456789012345678901234567890

public class Customer extends Person
{
	private String customerID;
	private boolean mailingList;

	/** 
	 The constructor Customer takes no arguments and initializes the private
	 fields of the class Customer to blank value and true, respectively.
	*/
	public Customer()
	{
		customerID = "";
		mailingList = true;
	}
// ----------------------------------------------------------------------
	/** 
	 The constructor Customer takes six arguments of type String and
	 boolean respectively. It also initializes the two private fields
	 of the class Customer. The rest of the arguments are from the 
	 super class person and they are called using the super keyword.

	 @param name of type String is passed into the constructor from the
	 super class Person
	 @param street of type String is passed into the constructor from the
	 super class Person
	 @param cityStateZip of type String is passed into the constructor
	 from the super class Person
	 @param phone of type String is passed into the constructor from the
	 super class Person
	 @param customerID of type string is passed into the constructor
	 @param mailingList of type boolean is passed into the constructor
	*/
	public Customer(String name, String street, String cityStateZip, String phone, String customerID, boolean mailingList)
	{
		super(name, street, cityStateZip, phone);
		this.customerID = customerID;
		this.mailingList = mailingList;
	}

	/** 
	 The constructor Customer is a copy constructor that makes an exact
	 copy of the class and provides a copy of the object
	 @param Customer of the class Customer is passed as an argument and it
	 represents the class and the private fields within the class
	*/
	public Customer (Customer customer)
	{
		customerID = customer.customerID;
		mailingList = customer.mailingList;
	}

	/** 
	 The method setCustomerID takes customerID of type String
	 as an argument and uses this to reference the object customerID
	 @param customerID of type String is passed as an arugment
	*/
	public void setCustomerID(String customerID)
	{
		this.customerID = customerID;
	}

	/** 
	 The method setMailingList takes mailingList of type boolean
	 as an argument and uses this to reference the object mailingList
	 @param mailingList of type boolean is passed as an arugment
	*/
	public void setMailingList(boolean mailingList)
	{
		this.mailingList = mailingList;
	}

	/** 
	 The method getCustomerID returns customerID and it does not take
	 any arguments
	*/
	public String getCustomerID()
	{
		return customerID;
	}

	/** 
	 The method getMailingList returns mailingList and it does not take
	 any arguments
	*/
	public boolean getMailingList()
	{
		return mailingList;
	}

	/** 
	 The method toString references the method toString from the super
	 class Person using the word super. It also displays the customerID
	 and the mailingList option.
	*/	 
	public String toString()
	{
		return super.toString() + "\n"
			+ "Customer ID: " + customerID + "\n"
			+ "Mailing list: " + (mailingList ? "Yes" : "No");
	}
}