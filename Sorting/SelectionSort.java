import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of n :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the value element of array:");

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        // selection sort 

        for(int j = 0; j <= n-2;j++){
            int min = j;

            for(int k =j ;k <= n-1; k++){
                if(arr[k] < arr[min]){
                    min = k;
                
                int temp = arr[min];
                arr[min] = arr[j];
                arr[j] = temp;

                }
                System.out.println("Sorted Array:");
                for(int i =0; i< n;i++){
                    System.out.println(arr[i] +" ");

                }
            }
        }
        sc.close();

    }
}

// key concept is find min nd swap !!