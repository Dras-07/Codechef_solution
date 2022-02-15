import java.util.*;

class Codechef{


    public static String solve(HashMap<Integer, Integer> hm,int max,int n)
    {
         int c=0;
       // System.out.println(hm);
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(i)==false)
return "YES";
else
{
    if(hm.get(i)==1)
    return "NO";
}

       
    }
    return "YES";
}
    public static void main(String[] args)throws Exception
    {
        try (Scanner sc = new Scanner(System.in)) {
            int t=sc.nextInt();
            while(t-->0)
            {
             HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
                int n=sc.nextInt();
                int max=0;
               // int key[]=new int[10000000];
              //  int ar[]=new int[n];
                for(int i=0;i<2*n;i++)
                {
                    int a=sc.nextInt();
                      hm.put(a,hm.getOrDefault(a, 0)+1);
                      max=Math.max(a,max);
                }

  
                System.out.println(solve(hm,max,n));
            }
        }
    }
}
