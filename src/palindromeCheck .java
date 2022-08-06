import java.util.Scanner;

class palindromeCheck {
    public static boolean palindrome(int[] num, int index) {
        //write the logic here
        while(index!=2){// stops at the middle
            if(num[0+index]==num[num.length-1-index]){ //The last position of array is [array.size-1]
                return true && palindrome(num, index+1);//push towards the middle from both ends recursively.
            }else{
                return false;
            }
        }
        return true;//base case
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        for(int i=0; i< 5;i++)
            num[i]=sc.nextInt();
        boolean answer =palindrome(num, 0);
        System.out.println(answer);
    }
}

//Solution by Upgrad:

/*class Source{
    public static boolean palindrome(int[] num, int index) {
        if (index > num.length/ 2)
            return true;
        if (num[index] == num[num.length - index - 1])
            return palindrome(num, index + 1);
        else
            return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        for(int i=0; i< 5;i++)
            num[i]=sc.nextInt();
        boolean answer =palindrome(num, 0);
        System.out.println(answer);
    }
}*/

