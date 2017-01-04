//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

// Lab Chapter 8 - #5  MultTable    2016

// Uses files MultTableRunner.java and MultTable.java


public class MultTableRunner
{
	public static void main ( String[] args )
	{
		
		out.println("Lab Chapter 8 - #5  MultTable    2016");
		out.println();
		out.println();
		
		// ***** fill in your name
		out.println("My name is Sam Hollenbeck");
		out.println();		
		out.println();		

		
		// STEP 1: **************************************************
		// create a MultTable object and pass it the values 5,5
		
		MultTable obj = new MultTable(5, 5);
		
		
		
		// STEP 2: **************************************************
		// call the printTable( ) method of your MultTable object to print out the MultTable
		obj.printTable();
		
		obj.setTable(3, 7);
		obj.printTable();
		
		obj.setTable(1, 6);
		obj.printTable();
		
		obj.setTable(9, 9);
		obj.printTable();
		
		obj.setTable(7, 8);
		obj.printTable();
		

		// add more test cases
		// modify or change the number and stop values inside your MultTable object
		// DO NOT CREATE A NEW MultTable OBJECT (YOU ALREADY HAVE ONE)
		// call the MultTable object's setTable() method and pass it your new data
		

		
		
		
		
		// add more test cases
		
	}
}