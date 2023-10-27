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
		    double t1=s.nextInt();
		    double t2=s.nextInt();
		    double r1=s.nextInt();
		    double r2=s.nextInt();
		    t1=Math.pow(t1,2);
		    t2=Math.pow(t2,2);
		    r1=Math.pow(r1,3);
		    r2=Math.pow(r2,3);
		    if(t1/r1==t2/r2){
		        System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }
		}
	}
}
