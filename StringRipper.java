//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringRipper
{
	private String word,rippedword;
	
	public StringRipper()
	{
		
	}

	public StringRipper(String s)
	{
	setString(s);
	}
	
   public void setString(String s)
   {
   	word = s;
   }	

	public String ripString(int x, int y)
	{
		rippedword = word.substring(x,y);
		return rippedword;
	}

 	public String toString()
 	{
 		
 		return word + "\n\n";
	}
}