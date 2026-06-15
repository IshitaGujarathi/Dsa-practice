import java.util.*;
public class InsertionSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the element of the array:");
        for(int i=0;i< n;i++){
            arr[i] = sc.nextInt();
        }
        // insertion Sort
        
        for(int i=0;i<n-1;i++){
            int j = i;
            while(j > 0 && arr[j-1]>arr[j]){
                int temp =arr[j -1];
                arr[j - 1] = arr[j];
                arr[j] = temp ;

                j--;
            }
        }
        System.out.println("Sorted Array:");
        for(int i=0;i <n-1;i++){
            System.out.println(arr[i]+ " ");
        }
        sc.close();
    }
}

//  this is the algo which select the element 
//  and try to place that element on the exact position as they belong 
