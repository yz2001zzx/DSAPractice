import java.util.Scanner;

public class sumOfDigitsSingleRecursion {


    static int singleDigitSum(int n){

        if(n<=9){
            return n;
        }else{
            return singleDigitSum(digSumOnce(n));
        }

    }

    static int digSumOnce(int n)
    {
        //Write code here

        if(n<=9){
            return n;
        }else{
            return n%10 + digSumOnce(n/10);
        }

    }

    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        System.out.println(singleDigitSum(n) + "\n" );
    }
}
