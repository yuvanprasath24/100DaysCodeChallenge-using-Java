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
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int c=0,f=0,e=0;
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    int a[]=new int[n];
		    for(int j=0;j<n;j++)
		    {
		        a[j]=sc.nextInt();
		    }
		    for(int m=1;m<=n;m++)
		    {
		        for(int j=0;j<n;j++)
    		    {
    		        if(m!=a[f] && m==a[j])
    		        {
    		            c++;
    		        }
    		    }
    		    f++;
        	    if(c>=k)
        		  {
        		      e++;
        		  }
        		c=0;
		    }
		    System.out.println(e);
		    e=0;
		}
	}
}
