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
		for (int i=1;i<=t ;i++ ){
		    int x=s.nextInt();
		    int y=s.nextInt();
		    for (int j=1;j<=y ;j++ ){
		        if (x%2==0){
		            x++;
		        }else{
		            x--;
		        } 
		    }
		    if (x%2==0){
		        System.out.println("Janmansh");
		    } else{
		        System.out.println("Jay");
		    }
		} 
	}
}
