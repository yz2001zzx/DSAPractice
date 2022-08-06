import java.util.*;

public class nobleInteger {
    static int nobleNum(int arr[], int n)
    {
        //Write code here

        int[] countGreater = new int[n];

        for(int i=0; i<n; i++){
            for(int j=0;j<n;j++){
                if(arr[j]>arr[i]){
                    countGreater[i]++;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(countGreater[i]==arr[i]){
                return 1;
            }
        }
        return -1;

    }

    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();//input the size of the array
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        System.out.println(nobleNum(arr, n) + "\n" );
    }
}



