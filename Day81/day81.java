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
		    int goals[]=new int[N];
		    int fouls[]=new int[N];
		    for(int i=0;i<N;i++){
		        goals[i]=s.nextInt()*20;
		    }
		    for(int i=0;i<N;i++){
		        fouls[i]=s.nextInt()*10;
		    }
		    int winner=0;
		    for(int i=0;i<N;i++){
		        for (int j=0;j<N ;j++ ){
		            int points=goals[i]-fouls[i];
		            if(winner<points){
		                winner=points;
		            }
		        } 
		    }
		    System.out.println(winner);
		}
	}
}
