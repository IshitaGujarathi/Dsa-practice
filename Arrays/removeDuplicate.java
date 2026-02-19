import java.util.*;

public class removeDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        int j = 0;   

        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }
        for(int i = 0; i <= j; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
} 
