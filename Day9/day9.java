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
		for (int i=1;i<=t ;i++ ){
		    int k=s.nextInt();
		    int x=k/2;
		    int y=(k-x)*3-x;
		    System.out.println(y);
		} 
	}
}
