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
		while(t -->0){
		    int n=s.nextInt();
		    int x[]=new int[n];
		    for(int i=0;i<n;i++){
		        int y=s.nextInt();
		        x[i]=y;
		    }
		    Arrays.sort(x);
		    for (int j=n-1;j>=0 ; ){
		        if(x[j]!=x[j-1]){
		            System.out.println(x[j]+x[j-1]);
		            break;
		        }
		        else{
		            j--;
		        }
		    } 
		    
		}
	}
}
