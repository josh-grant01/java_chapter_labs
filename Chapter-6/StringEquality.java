//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringEquality
{
	// instance variables wordOne and wordTwo are declared
	// these variables (aka attributes, properties, data elements, fields, etc.)
	//    hold onto the data (values) permanently
	// ALL methods inside this class have access to these instance variables

	private String wordOne, wordTwo;

	
	// default constructor (no parameters)
	// assign default values "" to instance variables wordOne and wordTwo	
	public StringEquality()
	{
		
		
	}



	// initializer constructor 
	// receives beginning values for our instance variables wordOne and wordTwo
	public StringEquality(String one, String two)
	{
		
		
	}



	// setter or modifier method setWords 
	// receives new values for our instance variables wordOne and wordTwo
	public void setWords(String one, String two)
	{
		
		
		
	}


	// this method returns the value true if
	//    wordOne is equal to wordTwo
	// DO NOT USE ==
	// == is used for comparison of primitive types
	// In order to compare string objects, call the equals() method
	// For example:
	// if (??????.equals(?????))
	public boolean checkEquality( )
	{
		// ***** DO NOT USE System.out.println() in this method
		// a return method should generally NEVER use a System.out.println()
		// it should find the return value and return it!!!!!!!!!!!!!!!!!!!!
		 
		
		
		
		return false;
	}



	// the toString() method returns a String that contains
	//    info about the instance variables
	public String toString()
	{
		// ***** DO NOT USE System.out.println() in this method
		// a return method should generally NEVER use a System.out.println()
		// it should find the return value and return it!!!!!!!!!!!!!!!!!!!!
		 


		// ****** change me
		// you should return does have or does NOT have
		// you should probably think about using an if else statement
		// you should probably call the method above
		
		
		return wordOne + " does NOT have the same letters as " + wordTwo + "\n";
	}
}