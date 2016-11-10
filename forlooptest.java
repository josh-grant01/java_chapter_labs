import java.util.Scanner;

public class forlooptest {
        
    public forlooptest() {
    }
    
    public static void main(String[] args) {
        
        
        int total=0;
		int x = 19;
		int y = 1;
		
		for(int s=y; s<x; s++)
		{
   			total=total+s;
			System.out.println(total);
		}
		System.out.println("Final Answer"  + "\n" + total);
    
    	//Math equation to solve For Loop Sums:
    	
    	System.out.println("Math Equation");
    	System.out.println((int)((x - 1 + y)*((x - 1)*.5)));
    
    
    }
}
