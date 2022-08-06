import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class sumTriangle {

    public static void main(String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Create the array num of size n
        int num[] = new int[n];


        // Array of string type to store the input
        String[] strNums;

        Scanner sc2 = new Scanner(System.in);

        if(sc2.nextLine()!=null){

            strNums = sc2.nextLine().split(" ");
            for (int i = 0; i < n; i++) {
                num[i] = Integer.parseInt(strNums[i]);
            }
        }

        System.out.println(getSumTriangle(num));

    }

    public static int getSumTriangle(int[] num) {
        if(num.length==0){
            return -1;
        }
        int n = num.length;//Total number of level
        int m = num.length;//Array Length
        int[][] temp = new int[n][m];

        // read the bottom array into the 1st level
        for(int i=0; i<m; i++){
            temp[0][i] = num[i];
        }

        //Starting from the 2nd level do the following:
        for (int j = 1; j < n; j++) {
            for (int i = 0; i < m-1; i++) {
                temp[j][i] = temp[j-1][i] + temp[j-1][i + 1];
            }
        }

        return temp[n-1][0];
    }

}

// Recursion way of doing it.

/*

public class Source
{
    // Function to generate Special Triangle.
    public static void getTopMostelement(int[] A)
    {
        // Base case
        if (A.length == 1){
            System.out.println(A[0]);
            return;
        }
        int[] temp = new int[A.length - 1];
        for (int i = 0; i < A.length - 1; i++)
        {
            int x = A[i] + A[i + 1];
            temp[i] = x;
        }
        getTopMostelement(temp);
    }

    // Driver function
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n>=1){
            int[] A = new int[n];
            for(int i=0;i<n;i++){
                A[i] = in.nextInt();
            }
            getTopMostelement(A);
        }
        else{System.out.println(-1);}
    }*/
