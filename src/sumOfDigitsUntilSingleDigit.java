import java.util.*;

public class sumOfDigitsUntilSingleDigit {

    static int sumOfDigitsSingle(int n)
    {
        //Write code here
        if(n==0){
            return 0;
        }else if(n%9==0){
            return 9;
        }else{
            return n%9;
        }
    }

    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        System.out.println(sumOfDigitsSingle(n) + "\n" );
    }

}
