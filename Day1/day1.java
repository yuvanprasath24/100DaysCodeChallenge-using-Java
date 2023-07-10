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
	        int n=s.nextInt();
	        int x=s.nextInt();
	        int z=n*x;
	        if(z>9999&&z<=99999){
	            System.out.println("YES");
	        }else{
	            System.out.println("NO");
	        }
	    } 
	}
}
