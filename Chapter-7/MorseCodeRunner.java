//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*; 

// Lab Chapter 7 - #4  MorseCode    2015

// Uses files MorseCodeRunner.java and MorseCode.java

// HINT:  Look back at previous programs that you have
//        written to help you. 
//        Draw a picture of your MorseCode object.
//        Look at your doc file to see the correct output.

public class MorseCodeRunner
{
	public static void main( String args[] )
	{
		out.println("Lab Chapter 7 - #4  MorseCode    2016");
		out.println();
		out.println();
		
		// ***** fill in your name
		out.println("My name is Sam Hollenbeck");
		out.println();		
		out.println();		
		

	    MorseCode obj = new MorseCode('A');

		out.println(obj.getMorseCode());
		
		out.println(obj);		
		out.println();
	
		obj.setChar('B');
		out.println(obj.getMorseCode() + "\n" + obj + "\n");
		
		obj.setChar('3');
		out.println(obj.getMorseCode() + "\n" + obj + "\n");
		
		
		obj.setChar('Z');
		out.println(obj.getMorseCode() + "\n" + obj + "\n");
		
		
		obj.setChar('8');
		out.println(obj.getMorseCode() + "\n" + obj + "\n");
		
		
		obj.setChar('F');
		out.println(obj.getMorseCode() + "\n" + obj + "\n");
		
		
		obj.setChar('0');
		out.println(obj.getMorseCode() + "\n" + obj + "\n");
		
		
	}
}
