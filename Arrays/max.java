import java.util.*;

public class max {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int[] arr = new int[10];
    
    System.out.println("Enter the elements of array:");
    int max =0;
    for(int i =0 ; i< arr.length ;i++){
        arr[i] = sc.nextInt();
        if(arr[i] > max){
            max = arr[i];
        }
    }
    System.out.println("The maximum element is: "+max);
    sc.close();
    }
}
