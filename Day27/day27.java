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
		    int C=s.nextInt();
		    int D=s.nextInt();
		    int E=s.nextInt();

            boolean x;
            if((A+B<=D)&&(C<=E)){
                x=true;
            }else if((A+C<=D)&&(B<=E)){
                x=true;
            }else if((B+C<=D)&&(A<=E)){
                x=true;
            }else{
                x=false;
            }
            
            if(x==true){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }    
	}
}