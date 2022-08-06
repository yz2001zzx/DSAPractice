import java.util.*;

public class quickSortNames {

    public static void quickSort(String[] array, int left, int right) {
        if (left < right) {
            int position = partition(array, left, right);
            quickSort(array, 0, position - 1);
            quickSort(array, position + 1, right);
        }
    }

    private static int partition(String[] array, int left, int right) {
        String pivot = array[right]; //
        int p = left; //initialize an index p to start with 0
        for (int i = left; i < right; i++) {
            if (compare(array[i],pivot) < 0) {
                swap(p, i, array);
                p++;
            }
        }
        swap(right, p, array);
        return p;
    }

    private static void swap(int i, int j, String[] arr) {
        String temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int compare(String o1, String o2){
        if(o1.length()!=o2.length()) {
            return (o1.length()-o2.length())<0?-1:1;
        }else{
            return o1.compareTo(o2);
        }
    }

    //Driver's function
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//n size of the array
        String[] array = new String[n];
//Question: If I use sc to scan in the for loop, the code does not work as expected.
//However, after I re-instantiated another scanner object, the code worked why?
        Scanner sc1 = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            sc1.nextLine();// to skip "\n"
            array[i] = sc1.nextLine();
        }

        quickSort(array, 0, array.length - 1);
        for (String name : array) {
            System.out.println(name);
        }
    }
}


