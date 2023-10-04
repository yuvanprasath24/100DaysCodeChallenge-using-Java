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
		    int N=s.nextInt();
		    String str=s.next();
		    int indian=0,not_indian=0,not_sure=0;
		    for(int i=0;i<N;i++){
		        if(str.charAt(i)=='Y'){
		            not_indian++;
		        }else if(str.charAt(i)=='I'){
		            indian++;
		        }else{
		            not_sure++;
		        }
		    }
		    if(not_indian!=0)
		    System.out.println("NOT INDIAN");
		    else if(indian!=0)
		    System.out.println("INDIAN");
		    else
		    System.out.println("NOT SURE");
	}
   }
}
