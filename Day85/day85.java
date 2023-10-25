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
		    int k=s.nextInt();
		    int shoot=0;
		    for(int i=0;i<n;i++){
		        int h=s.nextInt();
		        if(h>k){
		            shoot++;
		        }
		    }
		    System.out.println(shoot);
		}
	}
}
