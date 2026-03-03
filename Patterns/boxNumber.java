package Patterns;
import java.util.*;

public class boxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        for(int i = 0; i < 2*n - 1; i++){
            for(int j = 0; j < 2*n - 1; j++){

                int top = i;
                int left = j;
                int bottom = (2*n - 2) - i;
                int right = (2*n - 2) - j;

                int min = Math.min(Math.min(top, bottom),
                                   Math.min(left, right));

                System.out.print(n - min + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}