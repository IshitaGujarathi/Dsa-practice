package Patterns;
import java.util.*;
public class wingStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n = sc.nextInt();
        int InSp = 2*n-2;

        for(int i=1;i <= 2*n-1;i++){
            int star = i;
            

            if(i > n){
                star = 2*n-i;
            }
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            // space
            for(int j=1;j<=InSp;j++){
                System.out.print(" ");
            }
            // star
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            if( i < n){
                InSp-=2;
            }
            else{
                InSp+=2;
            }
            System.out.println();
        }
        sc.close();
    }
}
