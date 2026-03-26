package Recursion;
import java.util.*;
// parameterized
public class productOfNnumber {
    public static void printMul(int i,int mul) {
        if(i==1){
            System.out.println(mul);
            return;
        }
        printMul(i-1 ,mul *i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int N = sc.nextInt();
        printMul(N, 1);
        sc.close();
    }

    // By functional Method 
    // public static int printMul(int N){
    //     if(N == 1){
    //         return 1;
    //     }
    //     return N * printMul(N-1);
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the value of N:");
    //     int N = sc.nextInt();

    //     System.out.println(printMul(N));
    //     sc.close();
    // }

    
}
