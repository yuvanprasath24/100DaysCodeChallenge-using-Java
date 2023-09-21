/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		int cases = scn.nextInt();
		
		while(cases-- > 0) {
		    int num_dolls = scn.nextInt();
		    int type = 0;
		    
		    for(int i = 0; i < num_dolls; ++i)
		        type ^= scn.nextInt();
		  
		    System.out.println(type);
		}
	}
}
