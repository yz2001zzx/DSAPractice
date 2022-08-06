import java.util.*;

public class mergeSortDecreasing {
    public static int[] sort(int[] randomNumbers) {
        mergeSort(randomNumbers, new int[randomNumbers.length],0, randomNumbers.length - 1);
        return randomNumbers;
    }

    public static void mergeSort(int[] numbers, int[] temp, int first, int last) {
        // first denotes the starting index of the "numbers" array
        // last denotes the ending index of the "numbers" array
        // base case:
        if (first>=last){
            return;
        }
        //recursion:
        int middle = (first+last)/2;
        mergeSort(numbers,temp,first,middle);
        mergeSort(numbers, temp,middle+1,last);
        mergeHavies(numbers, temp, first, last);

    }

    private static void mergeHavies(int[] numbers, int[] temp,int first, int last) {

        int leftEnd = (first+last)/2;
        int rightStart = leftEnd + 1;
        int size = last - first + 1;

        //initialize the indices
        int leftIndex = first; // defines the index in the 1st half of the array
        int rightIndex = rightStart; // defines the index in the 2nd half of the array
        int newIndex = first;// defines the new temp array

        //Get the one which is bigger and assign the value to the new temp array and move the pointers.
        while(leftIndex<=leftEnd && rightIndex<= last) {
            if (numbers[rightIndex] >= numbers[leftIndex]) {
                temp[newIndex] = numbers[rightIndex];
                rightIndex++;
            } else {
                temp[newIndex] = numbers[leftIndex];
                leftIndex++;
            }
            newIndex++;
        }
            //copy the remaining elements in either left or right part of the number array.
            System.arraycopy(numbers,leftIndex,temp,newIndex,leftEnd-leftIndex+1);
            System.arraycopy(numbers,rightIndex,temp,newIndex, last-rightIndex+1);
            //Copy the temp elements back to the original number array.
            //Question: If I replace the variable 'first' with value '0' my sorting algorithm stops working why?
            System.arraycopy(temp, first, numbers, first, size);

    }

    //Driver Function:
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = scanner.nextInt();
        }
        int[] sortedNumbers;
        sortedNumbers = sort(randomNumbers);
        System.out.println(Arrays.toString(sortedNumbers));
    }
}
