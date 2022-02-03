/* package codechef; // don't place package name! */

import java.util.*;

class Codechef{
    public static void main(String[] args)throws Exception{
        try (Scanner sc = new Scanner(System.in)) {
            int t=sc.nextInt();
            while(t-->0)
            {
                int n=sc.nextInt();
                int k=sc.nextInt();

                if(n-k==0)
                System.out.println(2*n-1);
                else
                {
                    int r=n-k;
                    int val=k*2+r;
                    System.out.println(val);
                }
                
            }
        }
    }
}
