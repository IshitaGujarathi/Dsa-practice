import java.util.*;
public class nextPermutataion {

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
