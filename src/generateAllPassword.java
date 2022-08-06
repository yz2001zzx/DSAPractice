//Very good practice to understand the use of recursion.

import java.util.*;

public class generateAllPassword {
    static void genPW(char[] arr, int n)
    {
        //Write code here
        String pwd =""; //initialize the pwd with an empty String.
        for(int i=1; i<=n; i++){//i is the varying length goes from 1 to n
            helper(arr,i,pwd, arr.length);
            }
    }

    public static void main(String[] args)
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        char arr[] = new char[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.next().charAt(0);
        genPW(arr, n);
    }

    public static void helper(char[] arr, int i, String s, int len){
        //base case
        if(i==0){
            //when the length gets to 0. Here, the i is the varying length of the passcode string
            //print out the String with collected characters so far.
            System.out.println(s);

        }else{
            for (int j=0; j<len; j++){
                // Here the len is the length of the char array
                String appended = s + arr[j];
                helper(arr,i-1, appended, len);// appended value pass to the recursion
            }
        }
    }
}





