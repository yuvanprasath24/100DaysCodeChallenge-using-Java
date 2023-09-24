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
		    int Amin=s.nextInt();
		    int Bmin=s.nextInt();
		    int Cmin=s.nextInt();
		    int Tmin=s.nextInt();
		    int A=s.nextInt();
		    int B=s.nextInt();
		    int C=s.nextInt();
		    if(A>=Amin&&B>=Bmin&&C>=Cmin){
		        if((A+B+C)>=Tmin){
		            System.out.println("YES");
		        }
		        else{
		            System.out.println("NO");
		        }
		    }
		    else{
		        System.out.println("NO");
		    }
		 
		}
	}
}
