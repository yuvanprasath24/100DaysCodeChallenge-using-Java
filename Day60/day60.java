/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++){
		    int X=s.nextInt();
		    int Y=s.nextInt();
		    int Z=s.nextInt();
		    
		    if(X>=Y){
		        System.out.println("PIZZA");
		    }else if(X<Y&&X>=Z){
		        System.out.println("BURGER");
		    }else{
		        System.out.println("NOTHING");
		    }
		}
	}
}
