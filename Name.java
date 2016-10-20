//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Name
{
	private String name;
	private int location;
	public Name()
	{
	}

	public Name(String s)
	{
		setName(s);
		
	}

   public void setName(String s)
   {
   		name = s;
   }

	public String getFirst()
	{
		location = name.indexOf(" ");
		String first = name.substring(0,location);
		return first;
	}

	public String getLast()
	{
		location = name.indexOf(" ");
		String last = name.substring(location + 1);
		return last;
		
	}

 	public String toString()
 	{
 		return name + "\n\n";
	}
}