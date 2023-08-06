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
		    int m=s.nextInt();
		    int k=s.nextInt();
		    int x=m-k;
		    if(x>=n){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		} 
	}
}
