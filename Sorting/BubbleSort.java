import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the element in array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // Bubble Sort
        for(int i = n;i>=1;i--){
            for(int j =0;j<i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]= temp;
                }
            }
            }
            System.out.println("The sorted Array is :");
            for(int i=0;i< n;i++){
                System.out.println(arr[i]+" ");
        }
        sc.close();
    }

}

// opposite to the selection sort it first find the max and swap with adjacent 
// like check adjacent numbers in array find the max from them and then 
// swap with each other and goes on until the array is get totally sorted 
