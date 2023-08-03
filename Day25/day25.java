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
		    double S=s.nextInt();
		    int A=s.nextInt();
		    int B=s.nextInt();
		    double C=s.nextInt();
		    double percent;
		    double positive=C;
		    if(C<0)
		    positive=C*-1;
            
            percent=(positive/100)*S;
            if(C>0){
                S=S+percent;
            }else{
                S=S-percent;
            }
            
            if(S>=A&&S<=B){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
		}
	}
}
