=//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;


// Lab Chapter 6 - #2  StringEquality    2015

// Uses files StringEqualityRunner.java and StringEquality.java


public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		out.println("Lab Chapter 6 - #2  StringEquality    2015");
		out.println();
		out.println();
		
		out.println("My name is Sam Hollenbeck");
		out.println();		
		out.println();		
		
	    StringEquality test = new StringEquality("hello","goodbye");
	   
	    out.println(test);  
		out.println();
		
		test.setWords("one","two");
		out.println(test);  
		out.println();
		
		test.setWords("three","four");
		out.println(test);  
		out.println();
		
		test.setWords("TCEA","UIL");
		out.println(test);  
		out.println();
		
		test.setWords("State","Champions");
		out.println(test);  
		out.println();
		
		test.setWords("ABC","ABC");
		out.println(test);  
		out.println();
		
		test.setWords("ABC","CBA");
		out.println(test);  
		out.println();
		
		test.setWords("Same","Same");
		out.println(test);  
		out.println();
		
		
	}
}
