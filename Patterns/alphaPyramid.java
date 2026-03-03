package Patterns;
import java.util.*;
public class alphaPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            char ch ='A';
            for(int j =1;j<=2*i+1;j++){
                System.out.print(ch);
                ch++;
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
