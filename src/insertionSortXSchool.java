import java.util.*;

public class insertionSortXSchool {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String[] firstNames = new String[size];
        String[] lastNames = new String[size];
        for (int i = 0; i < size; i++) {
            firstNames[i] = scanner.next().toLowerCase();
        }
        for (int i = 0; i < size; i++) {
            lastNames[i] = scanner.next().toLowerCase();
        }
        insertionSortAscending(firstNames);
        insertionSortDescending(lastNames);
    }
    //Sort the array into one with descending order.
    private static void insertionSortDescending(String[] arr) {
        for(int i =1; i<arr.length;i++){
            String v = arr[i]; // store the element at current index to v for comparison purpose and carry this value to
            //the target index for every outer iteration
            int j = i;
            while(j>=1 && arr[j-1].compareTo(v)<0){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=v;//give the value stored in v to the arr at index when not executing the while loop anymore.
        }

        for(String name: arr){
            System.out.println(name);
        }
    }

    //Sort the array into one with ascending order.
    private static void insertionSortAscending(String[] arr) {
        for(int i =1; i<arr.length;i++){
            String v = arr[i];
            int j = i;
            while(j>=1 && arr[j-1].compareTo(v)>0){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=v;//give the value stored in v to the arr at index when not executing the while loop anymore.
        }

        for(String name: arr){
            System.out.println(name);
        }
    }


}
