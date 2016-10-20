//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class FirstRunner
{
	public static void main ( String[] args )
	{
		FirstAndLast demo = new FirstAndLast("Hello");
		
		System.out.println("word ::  " + demo );
		System.out.println( "first letter :: " + demo.getFirst() );
		System.out.println( "last letter :: " + demo.getLast() );
		System.out.println();
		System.out.println();
		
		demo.setString("World");
		System.out.println("word ::  " + demo );
		System.out.println( "first letter :: " + demo.getFirst() );
		System.out.println( "last letter :: " + demo.getLast() );
		System.out.println();
		System.out.println();
		
		demo.setString("JukeBox");
		System.out.println("word ::  " + demo );
		System.out.println( "first letter :: " + demo.getFirst() );
		System.out.println( "last letter :: " + demo.getLast() );
		System.out.println();
		System.out.println();
		
		demo.setString("TCEA");
		System.out.println("word ::  " + demo );
		System.out.println( "first letter :: " + demo.getFirst() );
		System.out.println( "last letter :: " + demo.getLast() );
		System.out.println();
		System.out.println();
		
		demo.setString("UIL");
		System.out.println("word ::  " + demo );
		System.out.println( "first letter :: " + demo.getFirst() );
		System.out.println( "last letter :: " + demo.getLast() );
		
		
		
		
		//add more test cases	
		
	}
}