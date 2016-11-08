//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a letter :: ");
		char c = keyboard.next().charAt(0);
		CharacterAnalyzer test = new CharacterAnalyzer(c);
		test.setChar(c);
		out.println(test); 
			
		out.print("Enter a letter :: ");
		c = keyboard.next().charAt(0);
		test.setChar(c);
		out.println(test);
		
		out.print("Enter a letter :: ");
		c = keyboard.next().charAt(0);
		test.setChar(c);
		out.println(test); 
	}
}
