//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private double xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{

	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		setCoordinates(x1,y1,x2,y2);


	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void calcDistance()
	{
		distance = Math.sqrt(((xTwo - xOne)*(xTwo- xOne)) + ((yTwo - yOne)*(yTwo - yOne)));


	}

	public void print( )
	{
		System.out.println("Enter X1 :: " + (int)xOne);
		System.out.println("Enter X1 :: " + (int)yOne);
		System.out.println("Enter X1 :: " + (int)xTwo);
		System.out.println("Enter X1 :: " + (int)yTwo);
		System.out.printf("distance == " + "%.3f",distance);
		System.out.println("");


	}
}