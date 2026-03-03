package Patterns;
import java.util.*;
public class printalpha{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("ENter the value of n:");
        int n =sc.nextInt();

        for(int i=0;i< n;i++){
            char ch =(char)('E'-i);
            for(ch='E';ch>='E'-(i);ch--){
                System.out.print(ch);
            }
            System.out.println();
        }
            sc.close();
    }
}
