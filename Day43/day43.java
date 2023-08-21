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
		    double x1=s.nextInt();
		    double x2=s.nextInt();
		    double y1=s.nextInt();
		    double y2=s.nextInt();
		    double d=y1/x1;
		    double p=y2/x2;
		    if(d<p)
		    System.out.println(-1);
		    else if(d==p)
		    System.out.println(0);
		    else
		    System.out.println(1);
		}
	}
}
