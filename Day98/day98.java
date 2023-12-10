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
		    int w[]=new int[n];
		    for(int i=0;i<n;i++){
		        w[i]=s.nextInt();
		    }
		    int trips=1,currrent=0;
		    for(int i=0;i<n;i++){
		        if(w[i]<=k){
		           
		            if(currrent+w[i]<=k){
                        currrent= currrent+w[i];
                    }
                    else{
                        trips++;
                        currrent = w[i];
                    }
		        }
		        else{
		            trips=-1;
		            break;
		        }
		    }
		    System.out.println(trips);
		}
	}
}
