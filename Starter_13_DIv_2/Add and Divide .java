import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
   public static List<Integer> primeFactors(int numbers) {
        int n = numbers;
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            factors.add(n);
        }
        return factors;
    }
    public static boolean solve(int a,int b)
    {
       List<Integer>lst= new ArrayList<>();
       lst=primeFactors(a);
       for(int i:lst)
       {
           if(b%i!=0)
           return false;
       }
       return true;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int  a=sc.nextInt();
		    int b=sc.nextInt();
		   boolean ans=(solve(a,b));    
		   if(ans)
		   System.out.println("YES");
		   else
		   System.out.println("NO");
		}
	}
}
