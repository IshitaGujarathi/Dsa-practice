import java.util.*;

public class TwoSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of array:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target sum:");
        int k = sc.nextInt();

        Arrays.sort(arr);   

        int left = 0;
        int right = n - 1;

        while(left < right){

            int sum = arr[left] + arr[right];

            if(sum == k){
                System.out.println("Yes");
                sc.close();
                return;
            }
            else if(sum < k){
                left++;
            }
            else{
                right--;
            }
        }

        System.out.println("No");

        sc.close();
    }
}