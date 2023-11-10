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
		    int a[]=new int[N];
		    for(int i=0;i<N;i++){
		        a[i]=s.nextInt();
		    }
		    int k=s.nextInt();
		    int p=a[k-1];
		    Arrays.sort(a);
		    for(int j=0;j<N;j++){
		        if(a[j]==p){
		            System.out.println(j+1);
		        }
		    }
		    
		}
	}
}
