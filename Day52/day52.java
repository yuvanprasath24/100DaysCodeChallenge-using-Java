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
		    String letter=s.next();

		    if(letter.equals("b")||letter.equals("B")){
		        System.out.println("BattleShip");
		    }
		    else if(letter.equals("c")||letter.equals("C")){
		        System.out.println("Cruiser");
		    }
		    else if(letter.equals("d")||letter.equals("D")){
		        System.out.println("Destroyer");
		    }
		    else if(letter.equals("f")||letter.equals("F")){
		        System.out.println("Frigate");
		    }
		  
		  
		}
	}
}
