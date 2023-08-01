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
		    int A1=s.nextInt();
		    int A2=s.nextInt();
		    int A3=s.nextInt();
		    int B1=s.nextInt();
		    int B2=s.nextInt();
		    int B3=s.nextInt();
		    if(A1+A2+A3==B1+B2+B3)
		    System.out.println("Pass");
		    else
		    System.out.println("Fail");
		}
	}
}
