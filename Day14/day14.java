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
		    int a=s.nextInt();
		    int b=s.nextInt();
		    int c=s.nextInt();
		    
		    int x=Math.min(b,c);
		    b=b-x;
		    c=c-x;
		    int y=Math.min(a,b);
		    a=a-y;
		    b=b-y;
		    int z=Math.min(a,c);
		    a=a-z;
		    c=c-z;
		    if(a>b&&a>c){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
	}
}
