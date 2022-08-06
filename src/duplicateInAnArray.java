import java.util.Scanner;

public class duplicateInAnArray {

        static int duplicate(int arr[], int n)
        {
            //Write code here
            int[] count = new int[n+1];
            /* the reason why adding 1 to the n is that the arr goes from 1 to n so to store count of number n
            at the index n in the count array requires the size of n+1 because the array's index starts from 0 t n d*/
            for(int i=0; i<n; i++){
                count[arr[i]]++;
                if(count[arr[i]]==2){
                    return arr[i];
                }
            }

            return -1;
        }

        public static void main(String args[])
        {
            int n;
            Scanner s = new Scanner(System.in);
            n = s.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = s.nextInt();

            System.out.println(duplicate(arr, n));
        }

}
