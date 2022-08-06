import java.util.*;

public class unSuccessfulAttempts {

    public int getBinarySearchUnsuccessfulComparisonCount(int[] inputArr, int key) {
        // Write your code here
        int left = 0;// start index of the array
        int right = inputArr.length - 1; // end index of the array
        int failCount = 0; // fail count starts with 0
        // once left > right is satisfied but return #1 is not triggered inside the while loop, then return the accumulated count at the end.
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (inputArr[middle] == key) {
                return failCount; // return #1
            } else if (inputArr[middle] > key) {
                right = middle - 1;
                failCount++;
            } else {
                left = middle + 1;
                failCount++;
            }
        }
        return failCount;
    }

    public static void main(String args[] ) throws Exception {
        unSuccessfulAttempts bs = new unSuccessfulAttempts();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        System.out.println(bs.getBinarySearchUnsuccessfulComparisonCount(array, key));
    }
}


