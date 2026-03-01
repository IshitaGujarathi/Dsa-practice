package Patterns;
import java.util.*;

public class symmetricNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j);
            }

            for (int j = 1; j <= 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }

            for (int j = i + 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }

        sc.close();
    }
}