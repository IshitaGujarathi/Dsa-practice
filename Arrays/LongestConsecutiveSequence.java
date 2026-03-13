import java.util.*;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        System.out.println("Enter the elements of array:");
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < n; i++){
            set.add(arr[i]);
        }

        int longest = 0;

        for(int num : set){

            if(!set.contains(num - 1)){

                int current = num;
                int count = 1;

                while(set.contains(current + 1)){
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        System.out.println("Longest Consecutive Length: " + longest);

        sc.close();
    }
}