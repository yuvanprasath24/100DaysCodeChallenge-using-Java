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
		    int[] str=new int[N];
		    for(int i=0;i<N;i++){
		        str[i]=s.nextInt();
		    }
            long x = 0;
	        for(int j=0; j<N-1; j++){
	            if(str[j]!=0){
	                x = x + Math.abs(str[j] - str[j+1]);
	            }
	        }
	        System.out.println(x - N + 1);
		}
	}
}
