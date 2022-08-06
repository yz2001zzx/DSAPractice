import java.util.*;

public class numOfSwapBubble {
    static int totalBubbleSortSwaps(int[] array, int M) {
        int size = array.length;
        int totalSwaps = 0;
        //Write your code here
        for(int i=0; i<M; i++){
            for(int j=1; j<size-i; j++){
                //descending order !
                if(array[j-1]<array[j]){
                    swap(j-1,j,array);
                    totalSwaps++;
                }
            }
            if(totalSwaps==0){
                break;
            }
        }
        return totalSwaps;
    }


    public static void swap(int i,int j,int[] array){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(totalBubbleSortSwaps(arr,M));
    }

}
