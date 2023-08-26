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
		    int a=s.nextInt();
		    int b=s.nextInt();
		    int c=s.nextInt();
		    int d=s.nextInt();
		    
		    int x=7*b;
		    int y=((c*a)+d*(7-a));
		    
		    if(x>y)
		    System.out.println(x);
		    else
		    System.out.println(y);
		}
	}
}
