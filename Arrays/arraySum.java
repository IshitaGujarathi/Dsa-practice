import java.util.*;

public class arraySum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter the elements of array:");

        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("The sum of the array is: " + sum);
    }
}
