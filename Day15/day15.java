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
		    int n=s.nextInt();
		    int a[]=new int[n];
		    int x=0;
		    int y=0;
		    for (int i=0;i<n ;i++ ){
		        a[i]=s.nextInt();
		        if(a[i]<0){
		            x++;
		        }
		        if(a[i]==0){
		            y++;
		        }
		        
		    }
		    if(y>=1||x%2 == 0){
		        System.out.println("0");
		    }
		    else{
		        System.out.println("1");
		    }
		    
	}
}
}
