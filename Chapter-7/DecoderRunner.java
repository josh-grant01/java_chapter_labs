//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*; 
import java.util.Scanner;



public class DecoderRunner
{
	public static void main( String args[] )
	{
		out.println("Lab Chapter 7 - #3  Decoder    2016");
		out.println();
		out.println();
		
		
		out.println("My name is Sam Hollenbeck");
		out.println();		
		out.println();		
		
		
		// Step 1:
		// Create a Scanner object to read in the letter or character
		// make sure that variable keyboard refers to a Scanner object
		Scanner keyboard = new Scanner(System.in);


		
		out.println("Enter a character :: ");
		char let = keyboard.next().charAt(0);
		
	    Decoder test = new Decoder(let);
		
		out.println(test);
		out.println();
		
		out.println("Enter a character :: ");
		let = keyboard.next().charAt(0);
		test.setLetter(let);
		out.println(test);
		
		out.println("Enter a character :: ");
		let = keyboard.next().charAt(0);
		test.setLetter(let);
		out.println(test);
		
		out.println("Enter a character :: ");
		let = keyboard.next().charAt(0);
		test.setLetter(let);
		out.println(test);
	}
}
