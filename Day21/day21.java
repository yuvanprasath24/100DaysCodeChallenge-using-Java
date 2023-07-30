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
		    if(a>b||a==b){
		        b=b+c;
		    }else{
		        a=a+c;
		    }
		   // System.out.println(a+" "+b);
		    if(a>b||a==b){
		        b=b+d;
		    }else{
		        a=a+d;
		    }
		    if(a>b||a==b)
		    System.out.println("N");
		    else
		    System.out.println("S");
		}
	}
}
