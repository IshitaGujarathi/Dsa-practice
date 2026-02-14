import java.util.*;

public class min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr= new int[5];

        System.out.println("Enter the elements of array:");
        int min = Integer.MAX_VALUE;
        for(int i =0 ; i< arr.length ;i++){
            arr[i] = sc.nextInt();
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The minimum element is: "+min);
        sc.close();
    }
    
}
