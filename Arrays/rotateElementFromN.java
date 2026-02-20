// rotate element in right by specific position
import java.util.*;

public class rotateElementFromN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter rotation count:");
        int k = sc.nextInt();

        k = k % n;   // important

        int[] result = new int[n];

        for(int i = 0; i < n; i++){
            result[(i + k) % n] = arr[i];
        }

        System.out.println("Rotated Array:");
        for(int num : result){
            System.out.print(num + " ");
        }

        sc.close();
    }
}
