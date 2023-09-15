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
		    String str=s.next();
		    int point=0;
		    for(int i=0;i<str.length();i++){
		        if(str.charAt(i)=='1'){
		            point++;
		        }
		    }
            if(point>str.length()/2){
                System.out.println("WIN");
            }else{
                System.out.println("LOSE");
            }
		}
	}
}
