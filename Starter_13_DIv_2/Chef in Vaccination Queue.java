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
		    int n=sc.nextInt();
		    int p=sc.nextInt();
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int ar[]=new int[n];
		    for(int i=0;i<n;i++)
		    ar[i]=sc.nextInt();
		    int v=p-1;
		    int sum=0;
		    for(int i=v;i>=0;i--)
		    {
		        if(ar[i]==0)
		        sum+=x;
		        else
		        sum+=y;
		    }
		    System.out.println(sum);
		}
	}
}
