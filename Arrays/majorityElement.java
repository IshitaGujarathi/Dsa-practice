import java.util.*;

class majorityElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {1,2,3,4,2,2,3,3,3,3,3};

        for(int i = 0; i < arr.length; i++) {
            int count = 0;

            for(int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }

            if(count > arr.length / 2) {
                System.out.println(arr[i]);
                sc.close();
                return;
            }
        }

        System.out.println("No Majority Element Found");
        sc.close();
    }
}
