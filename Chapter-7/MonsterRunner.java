//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*; 

// Lab Chapter 7 - #5  Monster    2015

// Uses files MonsterRunner.java and Monster.java

// HINT:  Look back at previous programs that you have
//        written to help you. 
//        Draw a picture of your Monster object.
//        Look at your doc file to see the correct output.

public class MonsterRunner
{
	public static void main( String args[] )
	{
		out.println("Lab Chapter 7 - #5  Monster    2016");
		out.println();
		out.println();
		
		// ***** fill in your name
		out.println("My name is Sam Hollenbeck");
		out.println();		
		out.println();		
				
		
		Scanner keyboard = new Scanner(System.in);
		
		// ******* monster 1***********************************		
		// ask for the name and size
		System.out.print("Enter the name of monster 1 :: ");		
		String n = keyboard.nextLine();
		
		System.out.print("Enter the size of monster 1 :: ");
		int size = keyboard.nextInt();
		keyboard.nextLine();
		
		// instantiate monster1 (new Monster ???)
		Monster monster1 = new Monster(n,size);
		
		
		// ******* monster 2***********************************		
		// ask for the name and size of monster 2
		System.out.print("Enter the name of monster 2 :: ");		
		n = keyboard.nextLine();
		
		System.out.print("Enter the size of monster 2 :: ");
		size = keyboard.nextInt();
		keyboard.nextLine();
		
		// instantiate monster2 (new Monster ???)
		Monster monster2 = new Monster(n,size);


		System.out.println();
		
		// print out Monster 1 - name and size
		// this will call the monster's toString() method
		System.out.println("Monster 1 - " + monster1.toString());
		
		// print out Monster 2 - name and size
		// call the monster 2'S toString() method
		System.out.println("Monster 2 - " + monster2.toString()); 
		System.out.println(); // prints a blank line
		
		
		
		if (monster1.isSmaller(monster2))
		  	  System.out.println("Monster 1 is SMALLER than Monster 2.");
			else
		    System.out.println("Monster 1 is BIGGER than Monster 2.");
		
	
		if (monster1.namesTheSame(monster2))
		    System.out.println("Monster 1 does have the SAME NAME as Monster 2.");
		else
		    System.out.println("Monster 1 does NOT HAVE THE SAME NAME as Monster 2.");
		
		System.out.println();
		System.out.println();
		System.out.println();
		//***************************************
		
		System.out.print("Enter the name of monster 3 :: ");		
		n = keyboard.nextLine();
		
		System.out.print("Enter the size of monster 3 :: ");
		size = keyboard.nextInt();
		keyboard.nextLine();
		
		Monster monster3 = new Monster(n,size);
		
		System.out.print("Enter the name of monster 4 :: ");		
		n = keyboard.nextLine();
		
		System.out.print("Enter the size of monster 4 :: ");
		size = keyboard.nextInt();
		keyboard.nextLine();
		
		Monster monster4 = new Monster(n,size);

		System.out.println("Monster 3 - " + monster3.toString());
		
		// print out Monster 2 - name and size
		// call the monster 2'S toString() method
		System.out.println("Monster 4 - " + monster4.toString()); 
		System.out.println(); // prints a blank line
		
		
		
		
		if (monster3.isSmaller(monster4))
		  	  System.out.println("Monster 3 is SMALLER than Monster 4.");
			else
		    System.out.println("Monster 3 is BIGGER than Monster 4.");
		    
		    if (monster3.namesTheSame(monster4))
		    System.out.println("Monster 3 does have the SAME NAME as Monster 4.");
		else
		    System.out.println("Monster 3 does NOT HAVE THE SAME NAME as Monster 4.");
	}
}
