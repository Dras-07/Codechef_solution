import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    long P=sc.nextLong();
		     long a=sc.nextLong();
		      long b=sc.nextLong();
		       long c=sc.nextLong();
		        long x=sc.nextLong();
		         long y=sc.nextLong();
		         
		         long val1=a*x+b;
		         long val2=a*y+c;
		         long min=Math.min(val2,val1);
		         long sum=0;
		         sum=sum+P/min;
		         System.out.println(sum);
		         
	}
	}
}
