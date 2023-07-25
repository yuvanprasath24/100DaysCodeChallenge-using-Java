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
		for (int i=1;i<=t ;i++ ){
		    int r1=s.nextInt();
		    int w1=s.nextInt();
		    int c1=s.nextInt();
		    int r2=s.nextInt();
		    int w2=s.nextInt();
		    int c2=s.nextInt();
		    
		    int a=0;
		    int b=0;
		    if(r1>r2){
		        a++;
		    }else{
		        b++;
		    }
		    if(w1>w2){
		        a++;
		    }else{
		        b++;
		    }
		    if(c1>c2){
		        a++;
		    }else{
		        b++;
		    }
		    if (a>b){
		        System.out.println("A");
		    }else{
		        System.out.println("B");
		    }
		} 
	}
}
