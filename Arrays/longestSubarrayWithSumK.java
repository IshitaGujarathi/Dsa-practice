import java.util.*;

public class longestSubarrayWithSumK {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array n:");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the elements of array:");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the value of k:");
        int k = sc.nextInt();

        HashMap<Long, Integer> preSumMap = new HashMap<>();

        long sum = 0;
        int maxLen = 0;

        for(int i = 0; i < n; i++){

            sum += a[i];

            if(sum == k){
                maxLen = Math.max(maxLen, i + 1);
            }

            long rem = sum - k;

            if(preSumMap.containsKey(rem)){
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            if(!preSumMap.containsKey(sum)){
                preSumMap.put(sum, i);
            }
        }

        System.out.println("Longest length: " + maxLen);

        sc.close();
    }
}