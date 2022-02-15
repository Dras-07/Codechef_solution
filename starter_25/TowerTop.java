import java.util.*;
 
class Codechef
{

    public static long solve(long x,long m,long v)
    {
        if(v>m)
        {
            return 0;
        }
        long t=1+(m-v);
        return t;
    }
    public static void main(String[] args)throws Exception
    {
        try (Scanner sc = new Scanner(System.in)) {
            int t=sc.nextInt();
            while(t-->0)
            {
              long x=sc.nextLong();
              long m=sc.nextLong();
             
            long v=1;
             long h=1;
             while(h<x)
             {
                 h=h*2;
                 v++;
             }
             System.out.println(solve(x,m,v));
            }
        }
    }
}
