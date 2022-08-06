import java.lang.String;
import java.sql.SQLOutput;
import java.util.Scanner;

//Print pattern via recursion.
//This solution is very tricky
// A tutorial is available at https://www.youtube.com/watch?v=EeS4a0mpXRQ

public class recursionPatternPrint{
        // function to print the required pattern
        public static String func(int n) {
            if (n <= 0) return "";
            String res = func(n-1);
            res = res + "*";
            System.out.println(res);
            return res;
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            func(n);
        }
}




