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
		    int c=0;
		    for (int j=1;j<=n ;j++ ){
		        int y=s.nextInt();
		        if(y>=x){
		            c++;
		        }
		    } 
		    System.out.println(c);
		} 
	}
}
