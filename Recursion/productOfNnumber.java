package Recursion;
import java.util.*;
public class productOfNnumber {
    public static void printMul(int i,int mul) {
        if(i==1){
            System.out.println(mul);
            return;
        }
        printMul(i-1 ,mul *i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        printMul(N, 1);
        sc.close();
    }
}
