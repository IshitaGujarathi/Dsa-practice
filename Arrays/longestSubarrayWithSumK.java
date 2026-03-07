import java.util.*;

public class longestSubarrayWithSumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of array  n :");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter the element of arrays:");
        for(int i =0;i< n;i++){
            a[i]= sc.nextInt();
        }
        System.out.println("Enter the value of k:");
        int k = sc.nextInt();

        sc.close();
    }
    
}
