import java.util.*;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= new int [10];
        System.out.println("Enter the element of array:");
        
        int even =0;
        int odd =0;
        for(int i =0; i< arr.length;i++){
            arr[i] = sc.nextInt();
            if(arr[i] % 2 ==0)
                even++;
            else
                odd++;
        }
        
        System.out.println("The odd count is:"+odd);
        System.out.println("The even count is:"+even);
        sc.close();
    }
}
