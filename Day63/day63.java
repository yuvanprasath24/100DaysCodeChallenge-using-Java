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
		    int A=s.nextInt();
		    int B=s.nextInt();
		    int C=s.nextInt();
		    if((A+B==1)||(A+C==1)||(B+C==1)){
		        System.out.println(1);
		    }
		    else{
		        System.out.println(0);
		    }
		}
	}
}
