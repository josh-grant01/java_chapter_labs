//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private double distance, hours, minutes, olddistance, oldhours, oldminutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{


	}

	public void setNums(int dist, int hrs, int mins)
	{
	distance = dist;
	hours = hrs;
	minutes = mins;
	olddistance = dist;
	oldhours = hrs;
	oldminutes = mins;
	}

	public void calcMPH()
	{
	minutes = (hours*60) + minutes;
	hours = minutes/60;
	mph = distance/hours;
	
	if (oldminutes>60)
	{
	  	oldhours = oldhours + (Math.floor(oldminutes/60));
	  	oldminutes = oldminutes%60;
	}
	
	}

	public void print()
	{
	System.out.println();
	System.out.print((int)olddistance + " miles in " + oldhours + " hour(s) and ");
	System.out.println((int)oldminutes + " minutes = " + mph + " MPH.");

	}
}