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
		    double M=s.nextInt();
		    double H=s.nextInt();
		    
		    double BMI=M/Math.pow(H,2);
		    
		    if(BMI<=18)
		    System.out.println(1);
		    else if(BMI>18&&BMI<=24)
		    System.out.println(2);
		    else if(BMI>24&&BMI<=29)
		    System.out.println(3);
		    else if(BMI>29)
		    System.out.println(4);
		}
	}
}
