import java.util.*;

public class factoriallastdigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(lastNonZeroDigit(n));
    }

    // Method to find the last digit of n!
    static int lastNonZeroDigit(int n) {
        // Write your code here
        int factorial = 1;
        for(int i=n;i>=1; i--){
            factorial = factorial*i;
        }
        return findLastNonZeroDigit(factorial);
    }

    static int findLastNonZeroDigit(int factorial){

        if(factorial%10==0){
            return findLastNonZeroDigit(factorial/10);
        }else{
            return factorial%10;
        }
    }

}
