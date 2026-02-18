import java.util.*;

public class singleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int[] arr = new int[] {1,2,3,3,2,6,6};

    for(int i=0 ; i< arr.length; i++){
        int count = 0;
        for(int j=0 ; j< arr.length;j++){
            if(arr[i]==arr[j]){
                count++;
            }
        }
        if(count ==1){
            System.out.println(arr[i]);
        }
    }
    sc.close();
}    
}
