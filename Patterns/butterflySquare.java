package Patterns;
import java.util.*;

public class butterflySquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        
        int inSp = 0;

        // Upper half
        for(int i = 0; i < n; i++){
            
            // Left stars
            for(int j = 0; j < n - i; j++){
                System.out.print("*");
            }
            
            // Spaces
            for(int j = 0; j < inSp; j++){
                System.out.print(" ");
            }
            
            // Right stars
            for(int j = 0; j < n - i; j++){
                System.out.print("*");
            }
            
            inSp += 2;
            System.out.println();
        }

        // Reset space correctly
        inSp = 2*n - 2;

        // Lower half
        for(int i = 1; i <= n; i++){
            
            // Left stars
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            
            // Spaces
            for(int j = 0; j < inSp; j++){
                System.out.print(" ");
            }
            
            // Right stars
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            
            inSp -= 2;
            System.out.println();
        }

        sc.close();
    }
}