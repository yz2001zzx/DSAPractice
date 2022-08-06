import java.util.*;

//This is a very interesting question



public class hanoiTower{
    static  void towerOfHanoi(int n, char source, char dest, char aux){
        if (n <= 1) {
            System.out.println(n+" "+source +" "+dest );
        }else{
            towerOfHanoi(n-1,source,aux,dest);
            System.out.println(n+" "+source +" "+dest );
            towerOfHanoi(n-1,aux,dest,source);
        }
    }


    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        towerOfHanoi(n, 'A', 'C', 'B');
    }

}


