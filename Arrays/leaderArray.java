import java.util.*;

public class leaderArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Elements of array:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> ans = new ArrayList<>();

        int maxi = Integer.MIN_VALUE;

        for(int i = n - 1; i >= 0; i--){

            if(arr[i] > maxi){
                ans.add(arr[i]);
            }

            maxi = Math.max(maxi, arr[i]);
        }

        Collections.reverse(ans);

        System.out.println("Leaders are: " + ans);

        sc.close();
    }
}