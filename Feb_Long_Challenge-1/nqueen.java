import java.util.*;
class Codechef{
    public static void main(String[] args)throws Exception{
        try (Scanner sc = new Scanner(System.in)) {
            int t=sc.nextInt();
            while(t-->0)
            {
int n=sc.nextInt();
double x=(double)Math.pow(0.143*n,n);
System.out.println(Math.round(x));
            }
        }
    }
}
