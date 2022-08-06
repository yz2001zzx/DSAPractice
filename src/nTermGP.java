// This question has some ambiguity why do we have put %m inside the recursion？

import java.util.*;

public class nTermGP {

    static long gp(long a, long r, long n, long m)
    {
        //Write code here
        return (a*sum(r,n,m))%m;
    }
    static long sum(long r, long n, long m){

        /*  use the recursive relationship
      sum(r,2*n+1) = (1+r)*sum(r^2,n)
      sum(r,2*n) = 1 + (r*(1+r)*sum(r^2,n-1))
      with the base cases:
      sum(r,0) = 1
      sum(r,1) = 1 + r
        */
        long ans;
        if(n==0){
            return 1;
        }else if(n==1) {
            return (1 + r) % m;
        }else if (n%2==1){
            //when n is odd
            ans = (1+r) * sum((r*r)%m,(n-1)/2, m);
        }else{
            //when n is even
            ans = 1 + r*(1+r)*sum((r*r)%m,n/2-1, m);
        }
        return ans%m;
    }

    public static void main(String args[])
    {
        int a, r, n, m;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        r = s.nextInt();
        n = s.nextInt();
        m = s.nextInt();

        System.out.println(gp(a, r, n, m) + "\n" );
    }

}
