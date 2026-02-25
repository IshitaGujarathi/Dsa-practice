import java.util.*;

public class maxConsecutive1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of arrays:");
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        int maxi = 0;
        int count =0;
        for(int i=0 ;i< arr.length;i++){
            if(arr[i]==1){
                count++;
                maxi = Math.max(count,maxi);
            }
            else{
                count = 0;
            }
        }
        System.out.println(maxi);
        sc.close();
    }
    
}
