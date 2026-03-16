package Recursion;
import java.util.*;

public class printReverseLinearly {

    public static void printNums(int num){

        if(num == 0){
            return;
        }

        System.out.println(num);

        printNums(num - 1);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Value of N: ");
        int N = sc.nextInt();

        printNums(N);

        sc.close();
    }
}