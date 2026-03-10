import java.util.*;
public class rearrangeArrayifAllEquals{
    // in this only equal pos and neg are perfectly get arranged in prder relate to sign..
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Element of arrays are:");
        for(int i =0;i< n ;i++){
            arr[i]=sc.nextInt();
        }
    
        int[] ans = new int[n];

        int posIdx =0 , negIdx =1;
        for(int i=0;i< n ;i++){
            if(arr[i] < 0){
                ans[negIdx]=arr[i];
                negIdx +=2;
            }
            else{
                ans[posIdx]=arr[i];
                posIdx +=2;
            }  
    }
    System.out.println("Rearranged Array:");

        for(int i = 0; i < n; i++){
            System.out.print(ans[i] + " ");
        }
    sc.close();
    }

}
