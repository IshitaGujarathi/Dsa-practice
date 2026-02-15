import java.util.*;
public class frequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

            int[] arr =new int[]{1,2,3,4,5,1,2,3,4,5};

            for(int i=0;i< arr.length;i++){
                int count=0;
                for(int j=0;j<arr.length;j++){
                    if(arr[i]==arr[j])
                        count++;
                }
                System.out.println("the frequency of " + arr[i] + " is " + count);
            }
        sc.close();                
    }
}
