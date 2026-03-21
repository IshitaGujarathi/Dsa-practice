package Recursion;
import java.util.*;
// in which we are printing num from 1 to n using back tracking
public class PrintNumByUsingBacktrack{
    public static void printNum(int i,int N){
        if(i < 1){
            return;
        }
        printNum(i-1 , N);       //first the call the function to use / apply backtrack
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int N = sc.nextInt();
        printNum(N ,N);
        sc.close();
    }
}