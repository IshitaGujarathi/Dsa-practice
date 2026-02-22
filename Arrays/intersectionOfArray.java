import java.util.*;

public class intersectionOfArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of matrix:");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        System.out.println("Enter matrix elements:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        boolean found = false;

        for(int col = 0; col < n; col++){

            int element = arr[0][col]; 
            int count = 1;

            for(int row = 1; row < n; row++){

                for(int k = 0; k < n; k++){
                    if(arr[row][k] == element){
                        count++;
                        break;
                    }
                }
            }

            if(count == n){
                System.out.println("Common element is: " + element);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("No common element found.");
        }

        sc.close();
    }
}