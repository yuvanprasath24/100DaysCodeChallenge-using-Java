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
		    int a1=s.nextInt();
		    int a2=s.nextInt();
		    int b1=s.nextInt();
		    int b2=s.nextInt();
		    int c1=s.nextInt();
		    int c2=s.nextInt();
		    int a=a1+a2;
		    int b=b1+b2;
		    int c=c1+c2;
		    if(a>b&&a>c)
		    System.out.println(a);
		    else if(b>a&&b>c)
		    System.out.println(b);
		    else
		    System.out.println(c);
		}
	}
}
