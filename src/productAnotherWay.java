import java.util.Scanner;

public class productAnotherWay {
    /* This method returns the product of a and b using recursion */
    static int findProduct(int a, int b) {

        // Write your code here
        if(a>0){
            //When a>0 and b can be positive or negative or 0
            return b + findProduct(a-1,b);

        }else if(a<0){
                //if b<0, the result must be positive so need to change the sign of b;
                //if b>0, the result must be negative so also need to change the sign of b.
                return -b + findProduct(a+1,b);
        }else{
            //base case
            return 0;
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

       /* If Math.abs(b) is greater than Math.abs(a), then find the product of b and
        a by passing b and a to 'findProduct' */
        if (Math.abs(b) > Math.abs(a)) {
            System.out.println(findProduct(b, a));
        } else {
            System.out.println(findProduct(a, b));
        }
    }
}
