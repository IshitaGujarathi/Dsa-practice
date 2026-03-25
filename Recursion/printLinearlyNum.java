package Recursion;
import java.util.*;
// in this have to print 1 to n using recursion function 
public class printLinearlyNum {
    public static void printNum(int num,int N) {
        if(num >= N){
            return;
        }
        System.out.println(num);
        printNum(num +1, N);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int N = sc.nextInt();
        int num = 0;
        printNum(num +1,N);
        sc.close();

    }
}
