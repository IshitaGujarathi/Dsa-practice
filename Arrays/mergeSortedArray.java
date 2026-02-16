import java.util.*;

public class mergeSortedArray {
    public static void main(String[] args) {

        int[] m = {1,2,3,4,0,0,0};  
        int[] n = {2,3,5};

        int validM = 4;  
        int validN = 3;

        int i = validM - 1;
        int j = validN - 1;
        int k = validM + validN - 1;

        while(i >= 0 && j >= 0){

            if(m[i] > n[j]){
                m[k] = m[i];
                i--;
            }
            else{
                m[k] = n[j];
                j--;
            }

            k--;
        }

        while(j >= 0){
            m[k] = n[j];
            j--;
            k--;
        }

        System.out.println(Arrays.toString(m));
    }
}
