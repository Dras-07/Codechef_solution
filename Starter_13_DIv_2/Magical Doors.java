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
		    String st=sc.next();
		    int c=0;
		    if(st.charAt(0)=='0')
		    c++;
		    char prev=st.charAt(0);
		    for(int i=0;i<st.length();i++)
		    {
		        char ch=st.charAt(i);
		        if(ch!=prev)
		        {
		            c++;
		         
		        }
		      prev=ch;
		    }
		    System.out.println(c);
		}
	}
}
