//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*; 
import java.util.Scanner;

// Lab Chapter 7 - #2  HexToBinary    2015

// Uses files HexToBinaryRunner.java and HexToBinary.java

// HINT:  Look back at previous programs that you have
//        written to help you. 
//        Draw a picture of your HexToBinary object.
//        Look at your doc file to see the correct output.


public class HexToBinaryRunner
{
	public static void main( String args[] )
	{
		out.println("Lab Chapter 7 - #2  HexToBinary    2016");
		out.println();
		out.println();
		
		
		out.println("My name is Sam Hollenbeck");
		out.println();		
		out.println();		
		
		
		
		Scanner keyboard = new Scanner(System.in);
		
		
		
		out.println("Enter a letter :: ");
		char hexChar = keyboard.next().charAt(0);
		
	    HexToBinary test = new HexToBinary(hexChar);
		
		out.println(test);
		out.println();
		
		out.println("Enter a letter :: ");
		hexChar = keyboard.next().charAt(0);
		
		test.setHex(hexChar);
		out.println(test);
		
		out.println("Enter a letter :: ");
		hexChar = keyboard.next().charAt(0);
		
		test.setHex(hexChar);
		out.println(test);
		
		out.println("Enter a letter :: ");
		hexChar = keyboard.next().charAt(0);
		
		test.setHex(hexChar);
		out.println(test);
		
	
		
		

		
		// add more test cases
		// make sure that your above code works before 
		//     adding more test cases


	

	}
}
