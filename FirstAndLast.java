//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class FirstAndLast
{
	private String word ;

	public FirstAndLast(String s)
	{
		setString(s);
	}

	public void setString(String s)
	{
		word = s;
	}

	public String getFirst()
	{
		String firstletter = word.substring(0,1);
		return firstletter;
	}
	
	public String getLast()
	{
		int location = word.length() - 1;
		String lastletter = word.substring(location);
		return lastletter;
	}

 	public String toString()
 	{
 		return word;
	}
}