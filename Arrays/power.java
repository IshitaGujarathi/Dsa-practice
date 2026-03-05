import java.util.*;

public class power {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n (power):");
        int n = sc.nextInt();

        System.out.println("Enter the value of number x:");
        int x = sc.nextInt();

        power(x, n);   // calling the method

        sc.close();
    }

    public static void power(int x, int n) {
        int ans = 1;

        while (n > 0)
        {  
            if (n % 2 == 1) {
                ans = ans * x;
                n = n - 1;
            } else {
                n = n / 2;
                x = x * x;
            }
        }

        System.out.println(ans);
    }
}