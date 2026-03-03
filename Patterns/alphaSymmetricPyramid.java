package Patterns;
import java.util.*;
public class alphaSymmetricPyramid {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the value of n:");
    int n = sc.nextInt();
    for(int i =0;i<n;i++){
        // space
        for(int j =0;j<n-i-1;j++){
            System.out.print(" ");
        }
        // alphabets
        char ch ='A';
        int breakPoint= (2*i+1)/2;
        for(int j=1;j<=2*i+1;j++){
            System.out.print(ch);
            if(breakPoint>= j){
                ch++;            
            }else{
                ch--;
            }
        }
        // space
        for(int j =0;j<n-i-1;j++){
            System.out.print(" ");
        }
        System.out.println();
    }
    sc.close();
 }   
}
