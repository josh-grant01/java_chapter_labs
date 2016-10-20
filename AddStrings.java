//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class AddStrings
{
   private String first, last;
   private String sum;

   public AddStrings()
   {
   }

   public AddStrings(String one, String two)
   {		
   }

   public void setStrings(String one, String two)
   {
   		first = one;
   		last = two;
   }

 	public void add( )
 	{
		 sum = first + " " + last + "\n\n";
	}

 	public String toString()
 	{
 	//	String sum ="";
 		System.out.println("first :: " + first);
 		System.out.println("last :: " + last);
 		System.out.print("sum :: ");
 		return sum;
 		
 		
 		
		
	}
}