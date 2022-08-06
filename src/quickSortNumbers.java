import java.util.*;

public class quickSortNumbers {
    public static int[] sort(int[] array){
        quickSort(array,0,array.length-1);
        return array;
    }

    public static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int position = partition(array, left, right);
            quickSort(array, 0, position - 1);
            quickSort(array, position + 1, right);
        }
    }

    private static int partition(int[] array, int left, int right) {
        int pivot = array[right]; //the last element to be the pivot
        int p = left; //initialize an index p to start with the leftmost index
        for (int i=left; i<right; i++){
            if(array[i]>=pivot){
                swap(p,i,array);
                p++;
            }
        }
        swap(right,p,array);
        return p;
    }

    private static void swap(int i, int j, int[] arr) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //driver function
    public static void main(String[] args) {
        int[] array = {2,4,6,8,10,12,14,16,18,20};
        int[] arraySorted = sort(array);
        for (int j : arraySorted) {
            System.out.println(j);
        }

    }
}
