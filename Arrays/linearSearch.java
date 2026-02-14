import java.util.*;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int searchElement;
        System.out.println("Enter the elements of array:");
        for(int i=0 ;i <arr.length ;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search:");
        searchElement = sc.nextInt();

        for(int i=0 ;i <arr.length ;i++){
            if(arr[i] == searchElement){
                System.out.println("Element found at index: "+i);
                sc.close();
                return;
            }
        }
        System.out.println("Element not found");    
        sc.close();

    }
}
