//© A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{
	}

	public CharacterAnalyzer(char c)
	{
	}

	public void setChar(char c)
	{
		theChar = c;
	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{
		if((int)theChar >= 65)
			if((int)theChar <= 90)
			return true;
		return false;
	}

	public boolean isLower( )
	{
		if((int)theChar >= 97)
			if((int)theChar <= 122)
				return true;
	
		return false;
	}
	
	public boolean isNumber( )
	{
		if((int)theChar >= 48)
			if((int)theChar <= 57)
				return true;
	
		return false;
	}	

	public int getASCII( )
	{
		return (int)theChar;
	}

	public String toString()
	{
		if (isLower() == true)
			return "" + getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";	  
		else if (isUpper() == true)
			return "" + getChar() + " is a uppercase character. ASCII == " + getASCII() + "\n";
		else 
			return "" + getChar() + " is a number. ASCII == " + getASCII() + "\n";
	
	}
}
