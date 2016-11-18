//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringEquality
{
	private String wordOne, wordTwo;
	
	public StringEquality()
	{
		wordOne = "";
		wordTwo = "";	
		
	}
	// initializer constructor 
	// receives beginning values for our instance variables wordOne and wordTwo
	public StringEquality(String one, String two)
	{
		setWords(one, two);
		
	}



	// setter or modifier method setWords 
	// receives new values for our instance variables wordOne and wordTwo
	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}
	
	public boolean checkEquality( )
	{
		if(wordOne.equals(wordTwo))
			return true;
		return false; 	 
	}



	// the toString() method returns a String that contains
	//    info about the instance variables
	public String toString()
	{
		if(checkEquality())
			return wordOne + " has the same letters as " + wordTwo + "\n";
		return wordOne + " does NOT have the same letters as " + wordTwo + "\n";
	}
}
