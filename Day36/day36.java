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
		    int x1=s.nextInt();
		    int x2=s.nextInt();
		    int y1=s.nextInt();
		    int y2=s.nextInt();
		    int z1=s.nextInt();
		    int z2=s.nextInt();
		    boolean x=false;
		    boolean y=false;
		    boolean z=false;
		    if(x1<=x2){
		        x=true;
		    }
		    if(y1<=y2){
		        y=true;
		    }
		    if(z1>=z2){
		        z=true;
		    }
		    
		    if((x==true)&&(y==true)&&(z==true)){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
	}
}
