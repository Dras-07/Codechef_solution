import java.util.*;

class Codechef{
    public static void main(String[] args)throws Exception
    {
        try (Scanner sc = new Scanner(System.in)) {
            int t=sc.nextInt();
            while(t-->0)
            {
                int n=sc.nextInt();
                HashSet<Integer> hm1=new HashSet<Integer>();
                HashSet<Integer> hm2=new HashSet<Integer>();
                for(int i=0;i<n;i++)
                {
             int a=sc.nextInt();
             int b=sc.nextInt();
             hm1.add(a);hm2.add(b);
                }
                System.out.println(hm1.size()+hm2.size());
            }
        }
        
    }
}
