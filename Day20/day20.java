/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int max=0,lead=0,x1=0,y1=0;
		while(t-->0)
		{
		    
		    int ply1=sc.nextInt();
		    int ply2=sc.nextInt();
		    x1+=ply1;
		    y1+=ply2;
		    lead=x1-y1;
		    if(Math.abs(lead)>Math.abs(max))
		    {
		        max=lead;
		    }
		    
		    
		}
		if(max>0)
		    {
		        System.out.println(1+" "+(max));
		    }
		    else
		    {
		         System.out.println(2+" "+Math.abs(max));
		    }
		}
}
	

