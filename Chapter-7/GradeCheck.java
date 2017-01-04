//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*; 
import java.util.Scanner;

// Lab Chapter 7 - #1  Grade    2015

// Uses files GradeCheck.java and Grade.java

// HINT:  Look back at previous programs that you have
//        written to help you.
//        Draw a picture of your Grade object.
//        Look at your doc file to see the correct output.

public class GradeCheck
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.println("Lab Chapter 7 - #1  Grade    2015");
		out.println();
		out.println();
		
		
		out.println("My name is Sam Hollenbeck");
		out.println();		
		out.println();		
		
		out.println("Enter a numerical grade...");
		int grade = keyboard.nextInt();
		Grade test = new Grade(grade);
		
		out.println(test);
		out.println();
		
		out.println("Enter a numerical grade...");
		grade = keyboard.nextInt();
		test.setGrade(grade);
		out.println(test);
		out.println();
		
		out.println("Enter a numerical grade...");
		grade = keyboard.nextInt();
		test.setGrade(grade);
		out.println(test);
		out.println();
		
		out.println("Enter a numerical grade...");
		grade = keyboard.nextInt();
		test.setGrade(grade);
		out.println(test);
		out.println();
		
			
	}
}
