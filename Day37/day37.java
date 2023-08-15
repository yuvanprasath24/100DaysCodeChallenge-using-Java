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
		    int x=s.nextInt();
		    if(x>=1&&x<100){
		        System.out.println("Easy");
		    }else if(x>=100&&x<200){
		        System.out.println("Medium");
		    }else if(x>=200&&x<=300){
		        System.out.println("Hard");
		    }
		}
	}
}
