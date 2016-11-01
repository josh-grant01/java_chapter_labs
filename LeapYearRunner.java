//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -

import static java.lang.System.*; 
import java.util.Scanner;

public class LeapYearRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		LeapYear demo = new LeapYear();
		out.println("Enter a year :: ");
		int y = keyboard.nextInt();
		demo.setYear(y);
		if (demo.isLeapYear(y)== true)
			out.println( y + " is a leap year.");
		else
			out.println( y + " is NOT a leap year.");
			
		out.println("Enter a year :: ");
		y = keyboard.nextInt();
		demo.setYear(y);
		if (demo.isLeapYear(y)== true)
			out.println( y + " is a leap year.");
		else
			out.println( y + " is NOT a leap year.");
				
		out.println("Enter a year :: ");
		y = keyboard.nextInt();
		demo.setYear(y);
		if (demo.isLeapYear(y)== true)
			out.println( y + " is a leap year.");
		else
			out.println( y + " is NOT a leap year.");	
			
			
		
	}

}