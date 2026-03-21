package Recursion;
import java.util.*;
public class printNumbybacktrackingfromN {
    public class printVal(int n , int i ){
        if(i==0){
            return;
        }
        printVal(N-1 , i );
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i ;

        printVal(N-1, i);
    }
}
