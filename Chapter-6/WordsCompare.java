//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;


public class WordsCompare
{	
	// instance variables wordOne and wordTwo are declared
	// also instance variable compare is declared
	// these variables (aka attributes, properties, data elements, fields, etc.)
	//    hold on to the data (values) permanently
	// ALL methods inside this class have access to these instance variables

	private String wordOne, wordTwo;
    private int compare;



	// default constructor (no parameters)
	// assign default values ("") to instance variables wordOne and wordTwo
	public WordsCompare()
	{
		
	}



	// initializer constructor 
	// receives beginning values for our instance variables wordOne and wordTwo
	// one and two are created and receive those values 
	public WordsCompare(String one, String two)
	{
		
	} 
	


	// setter or modifier method 
	// receives new values for our instance variables wordOne and wordTwo
	// one and two are created and receive those new values 
	public void setWords(String one, String two)
	{

	} 



	// the compare() method sets the compare instance variable
	// notice that a method can have the same name as a variable
	// the compiler knows the difference between a method and a variable
	//     because the method has ()
	public void compare()
	{
		// compare wordOne and wordTwo
		// if wordOne comes before wordTwo in the dictionary, you will get a negative number
		// if wordOne comes after wordTwo in the dictionary, you will get a positive number
		// if wordOne is the same as wordTwo in the dictionary, you will get a zero
		
		compare = wordOne.compareTo(wordTwo);
			
	}


	public String toString()
	{
		compare(); // calls the compare() method above which sets the compare variable
		
		if(compare<0)  // compares the compare variable to see if it is less than zero
		{
			return ???? + " should be placed before " + ????? + "\n";
		}
		else
		{
			return ???? + " should be placed after " + ?????? + "\n";
		}
	}
}