import java.util.*;
class Codechef{
   
    public static void main(String[] args)throws Exception{
        try (Scanner sc = new Scanner(System.in)) {
            int t=sc.nextInt();
            while(t-->0)
            {
              int n=sc.nextInt();
              int k=sc.nextInt();
              String st=sc.next();
            
            int c=0;
            for(int i=0;i<n/2;i++) {
                if(st.charAt(i)!=st.charAt(n-i-1))
                {
                    c++;
                }
            }
            
         //   System.out.println(c);
            
            if(c<=k)
            {
                   if((k-c)%2==0)
                   {
                       System.out.println("YES");
                   }
                   else if(n%2!=0)
                   {
                       System.out.println("YES");
                   }
                   else
                   {
                       System.out.println("NO");
                   }
            }
            else
            {
                System.out.println("NO");
            }
            }
        }
    }
}
