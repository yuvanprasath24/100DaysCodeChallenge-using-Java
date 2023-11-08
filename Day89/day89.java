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
		    int M=s.nextInt();
		    int tic=0;
		    for(int i=1;i<=N;i++){
		        for(int j=1;j<=M;j++){
		            if((i%2!=0)&&(j%2!=0)){
		                tic++;
		            }
		        }
		    }
		    System.out.println(tic);
		}
	}
}
