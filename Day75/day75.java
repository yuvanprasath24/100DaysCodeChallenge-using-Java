/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Codechef cc=new Codechef();
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0){
		  int D=s.nextInt();
		  int N=s.nextInt();
		  int sum=0;
		  int i=0;
		  for (i=1;i<=D ;i++ ){
             sum = N*(N+1)/2;
		     N=sum;
	      }
	   	  System.out.println(sum);
		}
	}
}
