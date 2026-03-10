import java.util.*;

public class rearrangeArrayNaddRemainAtEnd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Elements of array:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int[] pos = new int[n];
        int[] neg = new int[n];

        int posCount = 0;
        int negCount = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] >= 0){
                pos[posCount++] = arr[i];
            }
            else{
                neg[negCount++] = arr[i];
            }
        }

        int i = 0, p = 0, ne = 0;

        while(p < posCount && ne < negCount){
            arr[i++] = pos[p++];
            arr[i++] = neg[ne++];
        }

        while(p < posCount){
            arr[i++] = pos[p++];
        }

        while(ne < negCount){
            arr[i++] = neg[ne++];
        }

        System.out.println("Rearranged array:");
        for(int j = 0; j < n; j++){
            System.out.print(arr[j] + " ");
        }

        sc.close();
    }
}