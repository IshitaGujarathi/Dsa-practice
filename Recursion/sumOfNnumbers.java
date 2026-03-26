package Recursion;
import java.util.*;
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
}
