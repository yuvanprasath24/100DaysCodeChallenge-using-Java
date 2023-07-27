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
		while(t-->0){
		    long x=s.nextLong();
		    long y=s.nextLong();
		    long z=(x*x*x*x)+(4*(y*y));
		    long c=(4*(x*x))*y;
		    if(z==c){
		        System.out.println("YES");
		    }else{
		        System.out.println("No");
		    }
		}
	}
}
