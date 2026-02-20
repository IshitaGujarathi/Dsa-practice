import java.util.*;

public class buyAndSell {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of elements in array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int maxProfit = 0;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            else{
                int profit = arr[i] - min;
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        System.out.println("Maximum Profit: " + maxProfit);

        sc.close();
    }
}
