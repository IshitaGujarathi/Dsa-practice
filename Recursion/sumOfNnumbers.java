package Recursion;
import java.util.*;
// parameterised 
public class sumOfNnumbers {
    public static void printSum(int i ,int Sum){
        if(i == 0){
            System.out.println(Sum);
            return;
        }
        printSum(i-1 ,Sum+i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int N = sc.nextInt();

        printSum(N ,0);
        sc.close();
    }


    // By functional Method
//     public static int printSum(int N){
//     if(N == 0){
//         return 0;
//     }
//     return N + printSum(N-1);
//     }

// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the value of N:");
//     int N = sc.nextInt();

//     System.out.println(printSum(N));
//     sc.close();
// }

}


