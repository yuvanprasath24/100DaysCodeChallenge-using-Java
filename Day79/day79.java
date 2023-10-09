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
		    int N=s.nextInt();
		    int H=s.nextInt();
		    int x=s.nextInt();
		    int T[]=new int[N];
		    String ans="NO";
		    for(int i=0;i<N;i++){
		        T[i]=s.nextInt();
		        if(T[i]+x>=H){
		            ans="YES";
		        }
		    }
	    System.out.println(ans);
	}
}
