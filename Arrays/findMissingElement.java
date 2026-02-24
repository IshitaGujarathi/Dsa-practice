import java.util.*;

public class findMissingElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Size of Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n-1; i++){
            arr[i] = sc.nextInt();
        }

        int[] hash = new int[n + 1];  

        for(int i = 0; i < n-1; i++){
            hash[arr[i]] = 1;
        }

        for(int i = 1; i <= n; i++){
            if(hash[i] == 0){
                System.out.println("Missing element is: " + i);
                break;
            }
        }

        sc.close();
    }
}