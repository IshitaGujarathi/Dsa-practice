import java.util.*;

public class MaxSubArraySum {
    // here Kadane's Algorithm is get used...
    // in which we just have to neglate the zero sum...
    // and sum have to get back to zero 
    // compare with max and sum 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the element of array:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int sum = 0;

        int ansS = -1;
        int ansE = -1;
        int start = 0;

        for(int i = 0; i < n; i++){

            if(sum == 0){
                start = i;
            }

            sum += arr[i];

            if(sum > max){
                max = sum;
                ansS = start;
                ansE = i;
            }

            if(sum < 0){
                sum = 0;
            }
        }

        System.out.println("Maximum Sum: " + max);
        System.out.println("Subarray index: " + ansS + " to " + ansE);

        sc.close();
    }
}