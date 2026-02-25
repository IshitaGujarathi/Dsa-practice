// import java.util.*;
// // Brute force Approach

// public class removeZeroToTheEnd {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the size of array:");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter the elements:");
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }

//         int[] temp = new int[n];
//         int index = 0;

//         for(int i = 0; i < n; i++){
//             if(arr[i] != 0){
//                 temp[index] = arr[i];
//                 index++;
//             }
//         }

//         for(int i = 0; i < n; i++){
//             arr[i] = temp[i];
//         }

//         System.out.println("Array after moving zeros to end:");
//         for(int i = 0; i < n; i++){
//             System.out.print(arr[i] + " ");
//         }

//         sc.close();
//     }
// }



// Optimal Solution
import java.util.*;

public class removeZeroToTheEnd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int j = 0;  

        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
        System.out.println("After moving zeros:");

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
