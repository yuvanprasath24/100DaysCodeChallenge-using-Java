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
		    double q=s.nextInt();
		    double p=s.nextInt();
		    
		    double no_dis=q*p;
		    double percentage=(no_dis/100)*10;
		    double discount=no_dis-percentage;
		    
		    if(q>1000){
		        System.out.println(String.format("%.6f", discount));
		    }else{
		        System.out.println(String.format("%.6f", no_dis));
		    }
		}
	}
}
