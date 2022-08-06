import java.util.*;

    public class Eratosthenes_Method{

        public static void main(String args[]) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            primesLessThanOrEqualTon(n);
        }

        // Method to print all primes less than or equal to n in ascending order
        static void primesLessThanOrEqualTon(int n) {
            // Write your code here
            List<Integer> list = new ArrayList<>();//create an arraylist
            for (int i = 0;i+2<=n;i++) {
                list.add(i+2);
            }
            List<Integer> marked = new ArrayList<>();
            for (int p: list) {
                if(!marked.contains(p)) {
                    //i => one position after p. list.get(0) = 2, this is the initial p=2, list.get(1) =3, this is p+1....etc.
                    //Therefore, the index to start the following loop is 1 = p-1.
                    for(int i=p-1; i<=list.size()-1; i++) {
                        if (list.get(i) % p == 0) {
                            marked.add(list.get(i));
                            //System.out.println(list.get(i) + "added");
                        }
                    }
                }
            }

            int primecount = 0;

            for(int i=0;i<=list.size()-1;i++) {
                if(!marked.contains(list.get(i))){
                    System.out.print(list.get(i)+" ");
                    primecount ++;
                }
            }

            if(primecount==0){

                System.out.print("There are no prime numbers less than or equal to " +n);

            }


        }
    }
/* Upgrade Solution
import java.util.*;

public class Source {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        primesLessThanOrEqualTon(n);
    }

    // Method to print all primes less than or equal to n in ascending order
    static void primesLessThanOrEqualTon(int n) {
        if(n<2){
            System.out.println("There are no prime numbers less than or equal to "+n);
        }
        else {
            boolean[] prime = new boolean[n + 1];
            // Initializing all values in boolean array to true
            Arrays.fill(prime, true);
            for (int i = 2; i <= n; i++)
                if (prime[i])
                    // Marking all multiples of i to false
                    for (int j = 2 * i; j <= n; j += i)
                        prime[j] = false;
            // Printing all primes in ascending order
            for (int i = 2; i <= n; i++)
                if (prime[i])
                    System.out.print(i + " ");
        }
    }
}*/

