//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.lang.Math;

public class Circle
{
	private double radius;
	private double area;

	public void setRadius(double rad)
	{
	radius = rad;
	}

	public void calculateArea( )
	{
	double pi = Math.PI; 
	area = pi * (radius * radius);
		 
	}

	public void print( )
	{
	System.out.printf("The area is :: " + "%.4f\n",area);
	System.out.println();
	System.out.println();
	}
}