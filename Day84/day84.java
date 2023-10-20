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
		    int ar[]=new int[n];
		    for(int i=0;i<n;i++){
		        ar[i]=s.nextInt();
		    }
		    int count=1;
		    int max=0;
		    Arrays.sort(ar);
			for (int i = 0; i < ar.length-1; i++) {
				
				if (ar[i] == ar[i+1]) {
					count++ ;
				}
				else {
					if (count > max) {
						max = count ;
					}
					count = 1 ;
				}
			}
			
			if (count > max) {
				max = count ;
			}

			System.out.println(n - max);
		}
	}
}
