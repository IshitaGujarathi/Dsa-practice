package Recursion;
import java.util.*;

public class pallindromeUsingRecursion {

    public static boolean pallindrome(char[] arr, int l, int r){
        if(l >= r){
            return true;
        }
        if(arr[l] != arr[r]){
            return false;
        }
        return pallindrome(arr, l+1, r-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Value of n:");
        int n = sc.nextInt();

        char[] arr = new char[n];
        System.out.println("element of array:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.next().charAt(0);
        }

        if(pallindrome(arr, 0, n-1)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}