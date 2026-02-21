import java.util.*;

public class rotateFrom1st {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of array:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter value of d:");
        int d = sc.nextInt();

        d = d % n;   

        int[] temp = new int[n];

        for(int i = 0; i < n; i++){
            temp[i] = arr[(i + d) % n];
        }

        for(int i = 0; i < n; i++){
            arr[i] = temp[i];
        }

        System.out.println("Array after left rotation:");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
