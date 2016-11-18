//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

// Lab Chapter 6 - #3  WordsCompare    2015

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		out.println("Lab Chapter 6 - #3  WordsCompare    2015");
		out.println();
		out.println();
		
		
		out.println("My name is Sam Hollenbeck");
		out.println();		
		
	    WordsCompare test = new WordsCompare("abe", "ape");
	   
	    out.println(test);  
	    out.println();
	    
	    test.setWords("giraffe","gorilla");
	    out.println(test);  
	    out.println();
	    
	    test.setWords("one","two");
	    out.println(test);  
	    out.println();
	    
	    test.setWords("fun","funny");
	    out.println(test);  
	    out.println();
	    
	    test.setWords("123","19");
	    out.println(test);  
	    out.println();
	    
	    test.setWords("193", "1910");
	    out.println(test);  
	    out.println();
	    
	    
	    test.setWords("goofy","godfather");
	    out.println(test);  
	    out.println();
	    
	    test.setWords("funnel","fun");
	    out.println(test);  
	    out.println();
   	
   	
		
		
		

   }
}
