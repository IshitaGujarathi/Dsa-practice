package Recursion;
import java.util.*;

public class printNumbybacktrackingfromN {

    public static void printVal(int i, int N) {
        if (i > N) {
            return;
        }
        
        printVal(i + 1, N);   
        System.out.println(i); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        printVal(1, N);

        sc.close();
    }
}