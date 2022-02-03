import java.util.*;

class Codechef{
    public static void main(String[] args)throws Exception{
        try (Scanner sc = new Scanner(System.in)) {
            int t=sc.nextInt();
            while(t-->0)
            {
               int a=sc.nextInt();
                int b=sc.nextInt();
                int c=sc.nextInt();
                int p=sc.nextInt();
                int q=sc.nextInt();
                int r=sc.nextInt();
                //int max=Math.max(p,Math.max(q,r));
                double val=(double)(p+q+r)/2;
             int ans1=p+b+c;
             int ans2=a+q+c;
             int ans3=a+b+r;
                    if(ans1>val || ans2>val || ans3>val)
                    System.out.println("YES");
                    else
                    System.out.println("NO");

               
                
            }
        }
    }
}
