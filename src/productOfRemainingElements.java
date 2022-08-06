import java.util.Scanner;

public class productOfRemainingElements {
        static void RPRE(int[] arr, int n)
        {
            if(arr.length==1){
                    System.out.println(0);//This exceptional case needs to be checked !
            }else{
                for(int i=0; i<n; i++){
                    System.out.print(productLeft(arr,i)*productRight(arr,i) + " ");
                }
            }
        }
        static int productLeft(int[] arr, int i){
            if(i>0){
                return arr[i-1]*productLeft(arr,i-1);
            }else{
                return 1;
            }
        }
        static int productRight(int[] arr, int i){
            if(i<arr.length-1){
                return arr[i+1]*productRight(arr,i+1);
            }else{
                return 1;
            }
        }

        public static void main(String[] args)
        {
            int n;
            Scanner s = new Scanner(System.in);
            n = s.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = s.nextInt();
            RPRE(arr, n);
        }

}
