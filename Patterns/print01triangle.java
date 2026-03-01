package Patterns;
import java.util.*;
public class print01triangle {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int Start;
            if(i % 2==0){
                Start =1;
            }
            else{
                Start =0;
            }
            for(int j=0;j<=i;j++){
                System.out.print(Start);
                Start=1-Start;
            }
            System.out.println();
        }
        sc.close();
    }
}