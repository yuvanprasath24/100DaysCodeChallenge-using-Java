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
		    int A=s.nextInt();
		    int B=s.nextInt();
		    int Limak=0;
		    int Bob=0;
		    if(Limak<A){
		        for (int i=1;i<=A ;i++ ) {
		            int q=Limak+((2*i)-1);
		            if(q<=A){
		                Limak=q;
		            }
		        }
		    } 
		    if(Bob<B){
		        for (int i=1;i<=B ;i++ ) {
		            int q=(Bob+(2*i));
		            if(q<=B){
		                Bob=q;
		            }
		        }
		    } 
		    if(Limak>Bob)
		    System.out.println("Limak");
		    else
		    System.out.println("Bob");
		}
	}
}
