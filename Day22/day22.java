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
		    int a1=s.nextInt();
		    int b1=s.nextInt();
		    int a2=s.nextInt();
		    int b2=s.nextInt();
		    if((a==a1&&b==b1)||(a==b1&&b==a1)){
		        System.out.println("1");
		    }else if((a==a2&&b==b2)||(a==b2&&b==a2)){
		        System.out.println("2");
		    }else{
		        System.out.println("0");
		    }
		    
		}
	}
}
