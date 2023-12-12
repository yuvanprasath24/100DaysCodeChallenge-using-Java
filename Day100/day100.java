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
		    int A[]=new int[N];
		    int sum=0;
		    for(int i=0;i<N;i++){
		        A[i]=s.nextInt();
		        sum+=A[i];
		    }
		    if(sum<0)
		        System.out.println("NO");
		    else
		        System.out.println("YES");
		}
	}
}
