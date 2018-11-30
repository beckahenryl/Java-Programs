// Person.java
// ----------------------------------------------------------------------
// Program: Person
// Programmer: Rebeka Henry
// Date: November 30, 2018
// ----------------------------------------------------------------------
// The Person takes four Strings called name, street, cityStateZip, and
// phone and displays them using the toString method. This class has
// three constructors, four mutators, four accessors, and one overridden
// method.
// ---------1---------2---------3---------4---------5---------6---------7
// 1234567890123456789012345678901234567890123456789012345678901234567890

public class Person
{
	private String name;
	private String street;
	private String cityStateZip;
	private String phone;

	/** 
	 The constructor Person takes no arguments and initializes the private
	 fields of the class Person to blank values
	*/
	public Person()
	{
		name = "";
		street = "";
		cityStateZip = "";
		phone = "";
	}

	/** 
	 The constructor Person takes four arguments of type String and
	 initializes the private fields of the class Person.
	 @param name of type String is passed into the constructor
	 @param street of type String is passed into the constructor
	 @param cityStateZip of type String is passed into the constructor
	 @param phone of type String is passed into the constructor
	*/
 
	public Person(String name, String street, String cityStateZip,
	 String phone)
	{
		this.name = name;
		this.street = street;
		this.cityStateZip = cityStateZip;
		this.phone = phone;
	}

	/** 
	 The constructor Person is a copy constructor that makes an exact
	 copy of the class and provides a copy of the object
	 @param person of the class Person is passed as an argument and it
	 represents the class and the fields within the class
	*/

	public Person(Person person)
	{
		name = person.name;
		street = person.street;
		cityStateZip = person.cityStateZip;
		phone = person.phone;
	}

	/** 
	 The method setName takes name of type String as an argument
	 and uses this reference the object name
	 @param name of type String is passed as an arugment
	*/
	public void setName(String name)
	{
		this.name = name;
	}

	/** 
	 The method setStreet takes street of type String as an argument
	 and uses this reference the object street
	 @param street of type String is passed as an arugment
	*/
	public void setStreet(String street)
	{
		this.street = street;
	}

	/** 
	 The method setCityStateZip takes cityStateZip of type String 
	 as an argument and uses this reference the object cityStateZip
	 @param cityStateZip of type String is passed as an arugment
	*/
	public void setCityStateZip(String cityStateZip)
	{
		this.cityStateZip = cityStateZip;
	}

	/** 
	 The method setPhone takes phone of type String 
	 as an argument and uses this reference the object phone
	 @param phone of type String is passed as an arugment
	*/
	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	/** 
	 The method getName returns name and it does not take
	 any arguments
	*/
	public String getName()
	{
		return name;
	}

	/** 
	 The method getStreet returns street and it does not take
	 any arguments
	*/
	public String getStreet()
	{
		return street;
	}

	/** 
	 The method getCityStateZip returns cityStateZip and 
	 it does not take any arguments
	*/
	public String getCityStateZip()
	{
		return cityStateZip;
	}

	/** 
	 The method getPhone returns phone and it does not
	 take any arguments
	*/
	public String getPhone()
	{
		return phone;
	}

	/** 
	 The method toString returns the name, street, cityStateZip,
	 and phone. It does not take any arugments
	*/	 
	public String toString()
	{
		return name + "\n" + street + "\n" + cityStateZip + "\nPhone: "
		 + phone;
	}
}