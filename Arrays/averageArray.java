import java.util.*;
public class averageArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int arr[] = new int [10];
        System.out.println("Enter the element of array:");

        int sum =0;
        int avg=0;
        for(int i = 0;i < arr.length;i++){
            arr[i] =sc.nextInt();
            sum +=arr[i];
            avg=sum/arr.length;
        }
        System.out.println("The avg is :"+avg);
        sc.close();
    }
}
