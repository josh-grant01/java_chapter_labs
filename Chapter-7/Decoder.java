//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*; 

public class Decoder
{
	private char letter;
	
	public Decoder()
	{
		letter = '0';
	}

	public Decoder(char let)
	{
		setLetter(let);
	}
	
	public void setLetter(char let)
	{
		letter = let;
	}


	// look at the docs to see what needs to be returned
	// Remember 'A' is 65
	//          'a' is 97
	//          Note that they differ by 32
	//          '0' is 48
	//          These characters differ by 17 (48 to 65)
	public char deCode()
	{
		char result='0';

		if (letter >= 'a' && letter <= 'z')
			result = (char) (letter - 32);		
		else if ( letter >= 'A' && letter <= 'Z')
			result = (char) (letter + 32);
		else if (letter >= '0' && letter <= '9')
			result = (char) (letter + 17);
		else
			result = '#'; 
		
		return result;
	}


	public String toString()
	{
		return letter + " decodes to " + deCode(); 
	} 
}  

