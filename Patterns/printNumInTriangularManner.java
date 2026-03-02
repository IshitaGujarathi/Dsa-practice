package Patterns;
import java.util.*;
public class printNumInTriangularManner {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n =sc.nextInt();
        int num=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(num);
                num+=1;
            }
            System.out.println();
        }
        sc.close();
    }
}
