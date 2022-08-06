import java.util.Scanner;

public class unsuccessfulAttemptsLinearSearch {
    public int getLinearSearchUnsuccessfulComparisonCount(int[] inputArr, int key) {
        int failcount = 0;
        for(int i=0; i<inputArr.length; i++){
            if(inputArr[i]==key){
                return failcount;
            }else{
                failcount++;
            }
        }
        return failcount;
    }

    public static void main(String args[] ) throws Exception {
        unsuccessfulAttemptsLinearSearch ls = new unsuccessfulAttemptsLinearSearch();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        System.out.println(ls.getLinearSearchUnsuccessfulComparisonCount(array, key));
    }

}
