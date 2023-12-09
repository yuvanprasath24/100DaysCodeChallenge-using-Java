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

		    int jacketcost=s.nextInt();
		    int sockcost=s.nextInt();
		    int money=s.nextInt();
		    int rm=money-jacketcost;
		    rm=rm/sockcost;
		    System.out.println(rm%2==0?"Lucky Chef":"Unlucky Chef");
		    
	}
}
