//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

// Lab Chapter 6 - #1  NumberCompare    2015

// Uses files NumberCompareRunner.java and NumberCompare.java

public class NumberCompareRunner
{
	public static void main( String args[] )
	{
		out.println("Lab Chapter 6 - #1  NumberCompare    2015");
		out.println();
		out.println();
		
		// ***** fill in your name
		out.println("My name is ????????  ????????????????");
		out.println();		
		out.println();		
		
		
		// this creates a new NumberCompare object and sends
		// the values 5 and 6 to the constructor 
	    NumberCompare test = new NumberCompare(5,6);
	   
	    out.println(test);  // this calls the toString() method
	    out.println("largest == "+test.getLargest());
	    out.println("smallest == "+test.getSmallest()+"\n\n");

	    // add more test cases (see the docs for your input values)
		
		


	}
}