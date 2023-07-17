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
		    int a=s.nextInt();
		    int b=s.nextInt();
		    int c=s.nextInt();
		    int d=s.nextInt();
		    int e=s.nextInt();
		    int f=s.nextInt();
		    int g=s.nextInt();
		   int x=a+b+c+d+e+f+g;
		   if(x>=4){
		       System.out.println("YES");
		   }else{
		       System.out.println("NO");
		   }
		    
		} 
		
	}
}
