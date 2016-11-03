//© A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Discount
{
	private static double bill;
	
	public static double getDiscountedBill(double amt)
	{
		if(amt > 2000)
			bill = amt;
		else
			bill = amt * .85;
		return bill;	
			 
	}
}
