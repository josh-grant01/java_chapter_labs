//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

public class Cube
{
	private int side;
	private int surfaceArea;

	public void setSide(int s)
	{
	side = s;
	
	}

	public void calculateSurfaceArea( )
	{
	surfaceArea = (side * side) * 6;
	}

	public void print( )
	{
	System.out.println("The surface area is ::" + surfaceArea);
	System.out.println();
	System.out.println();
	}
}