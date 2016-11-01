//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -

import static java.lang.System.*; 
import java.util.Scanner;

public class LeapYear
{
	private int year;
	
	public void setYear(int y)
   		{
   			year=y;
  		}
   	public boolean isLeapYear(int year)
   	{	   	
   		if( year % 4 != 0)
   			{	
   				return false;
   			}
   		else
   			{
   				if(year % 400 == 0)
   				{
   					return true;
   				}
   				else
   				{
   					if(year % 100 == 0)
   					{
   						return false;
   					}
   					else
   					{
   						return true;
   					}
   				}
   			}
   		
   	}
	
}