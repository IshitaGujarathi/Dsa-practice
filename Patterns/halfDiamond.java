package Patterns;
import java.util.*;

public class halfDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 2 * n - 1; i++) {
            
            int star;
            
            if (i <= n) {
                star = i;
            } else {
                star = 2 * n - i;
            }

            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}