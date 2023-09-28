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
		    int votes[]=new int[3];
		    votes[0]=s.nextInt();
		    votes[1]=s.nextInt();
		    votes[2]=s.nextInt();
		    if(votes[0]>50){
		        System.out.println("A");
		    }
		    else if(votes[1]>50){
		        System.out.println("B");
		    }
		    else if(votes[2]>50){
		        System.out.println("C");
		    }else{
		        System.out.println("NOTA");
		    }
		    
		}
	}
}
