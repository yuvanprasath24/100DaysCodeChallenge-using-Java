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
		    int n=s.nextInt();
		    if(n%4==1)
		    System.out.println("East");
		    else if(n%4==2)
		    System.out.println("South");
		    else if(n%4==3)
		    System.out.println("West");
		    else
		    System.out.println("North");
		}
	}
}
