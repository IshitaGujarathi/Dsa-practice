import java.util.*;
// only for the +ve value
public class longestSubArraysWithK {
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

        int right =0;
        int left =0;
        long sum =0;
        int maxLen=0;

        while(right < n){
            while(sum > k && left <= right){
                sum-= a[left];
                left ++;
            }
            if(sum ==k){
                maxLen = Math.max(maxLen, right-left+1);
            }
            right++;
            if(right < n){
                sum+= a[right];
            }
        }
        System.out.println("The Longest Subarray length sum with k is:"+maxLen);
        

        sc.close();

    }
}
