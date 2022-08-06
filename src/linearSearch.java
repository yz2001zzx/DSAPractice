import java.util.*;

public class linearSearch {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        //Declare the array here
        int count = input.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = input.nextInt();
        }
        int key = input.nextInt();
        input.close();
        //write your code here
        for(int i=array.length-1; i>=0;i--){
            if(array[i]==key){
                System.out.println(array.length-i-1);
                break;
            }
        }
}

}
