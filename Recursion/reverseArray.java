package Recursion;
import java.util.*;

public class reverseArray {

    public static void revArray(int[] arr, int l, int r){
        if(l >= r){
            return; //if l and r crosses or goes beyond each other then return 
        }

        int temp = arr[l];    //swap 
        arr[l] = arr[r];
        arr[r] = temp;

        revArray(arr, l + 1, r - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array N");
        int N = sc.nextInt();

        int[] arr = new int[N];
        System.out.println("Enter the element of array:");
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        revArray(arr, 0, N - 1); //function call

        System.out.println("Reversed array:");
        for(int i = 0; i < N; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close(); 
    }
}