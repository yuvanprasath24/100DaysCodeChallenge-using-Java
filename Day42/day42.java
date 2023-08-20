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
		    int year=s.nextInt();
		    int hosted[]={2010,2015,2016,2017,2019};
		    boolean val=false;
		    for(int i=0;i<hosted.length;i++){
		        if(hosted[i]==year)
                    val=true;
		    }
		    if(val==true)
		    System.out.println("HOSTED");
		    else
		    System.out.println("NOT HOSTED");
		}
	}
}
