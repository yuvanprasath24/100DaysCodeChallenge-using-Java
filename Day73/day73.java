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
		double A=s.nextInt();
		double B=s.nextInt();
		String operator=s.next();
		switch(operator){
		     case "+":
		         System.out.println(A+B);
		         break;
		     case "-":
		         System.out.println(A-B);
		         break;
		     case "*":
		         System.out.println(A*B);
		         break;
		     case "/":
		         System.out.println(A/B);
		         break;
		}
		
	}
}
