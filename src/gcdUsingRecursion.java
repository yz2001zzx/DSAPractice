import java.util.*;

public class gcdUsingRecursion {

        static int gcd(int x, int y) {
            /*
            The logic of using Recursion for finding GCD
            Using Euclidean Algorithm to find the GCD
            What the Euclidean Algorithm is?
            Suppose we want to find the GCD(a,b) we can always write a = qb + r where r is the reminder
            the GCD(a,b) = GCD (b,r1) where r1 = a mod b
            =GCD (r1,r2) where r1 becomes the new 'b' and r2 = b mode r1
            =GCD (r2,r3) where r2 becomes the new 'b' and r3 = r1 mode r2
            .....until
            =GCD (rn,0) => rn is the GCD(a,b)
            */
            if(y!=0){
                return gcd(y, x%y);
            }else{
                return x;//when the second argument = 0 triggers the return of the 1st argument.
            }


        }

        public static void main(String args[]) {
            int x, y;
            Scanner s = new Scanner(System.in);
            x = s.nextInt();
            y = s.nextInt();

            if(x>=y) {
                System.out.println(gcd(x, y) + "\n");
            }else{
                System.out.println(gcd(y, x) + "\n");
            }
        }

    }


