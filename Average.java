//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

public class Average
{
	
	
	private double one, two, average;

	public void setNums(double num1, double num2)
	{
	one=num1;
	two=num2;
	
	}

	public void average( )
	{
		 average = (one + two) * 0.5;
	}
	public void print( )
	{
	System.out.printf(one + " + " + two + " has an average of " + "%.2f\n",average);
	System.out.println();
	}
}