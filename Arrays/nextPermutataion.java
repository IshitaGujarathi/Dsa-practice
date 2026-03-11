import java.util.*;
public class nextPermutataion {
    // in this there are mainly 3 step to reach the next permutation i.e
    // 1) finding the breakpoint by using condition a[i] < a[i+1] to understand the index where we have to make changes 
    // 2) finding the element greater than the the ind ...and less than the remaining element and swap them with each other 
    // 3) arrange the remaining element in shortest order 
    
    // reverse function to reverse the array when the ind is -1
     static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of array is :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Array elements are:");
        for(int i =0;i<n ;i++){
            arr[i]= sc.nextInt();
        }

        int ind = -1;
        
        for(int i= n-2 ; i>=0; i--){
            if(arr[i] < arr[i+1]){
                ind = i;
                break;
            }
        }
        if(ind == -1){
            reverse(arr,0,n-1);
        }
        for(int i= n-1;i>= ind;i--){
            if(arr[i]> arr[ind]){
               int temp = arr[i];
                arr[i] = arr[ind];
                arr[ind] = temp;
                break;
            }
        }
        reverse(arr,ind+1,n-1);

       System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
