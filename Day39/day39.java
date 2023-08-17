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
		    int at=s.nextInt();
		    int bt=s.nextInt();
		    int ap=s.nextInt();
		    int bp=s.nextInt();
		    int chef=at+(ap*10);
		    int chefina=bt+(bp*10);
		    if(chef<chefina)
		    System.out.println("Chef");
		    else if(chef==chefina)
		    System.out.println("Draw");
		    else
		    System.out.println("Chefina");
		}
	}
}
