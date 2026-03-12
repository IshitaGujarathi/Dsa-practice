import java.util.*;
public class leaderArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of array:");
        int n = sc.nextInt();
        System.out.println("Elements of array:");
        int[] arr= new int[n];
        for(int i=0;i< n ;i++){
            arr[i]=sc.nextInt();
        }

    sc.close();
    }
}