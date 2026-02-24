import java.util.*;

public class intersectionOfArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of matrix: ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        System.out.println("Enter matrix elements:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int[] result = new int[n];   
        int index = 0;               

        for(int col = 0; col < n; col++) {

            int element = arr[0][col];

            boolean alreadyChecked = false;
            for(int x = 0; x < col; x++) {
                if(arr[0][x] == element) {
                    alreadyChecked = true;
                    break;
                }
            }
            if(alreadyChecked) continue;

            int row;
            for(row = 1; row < n; row++) {

                boolean present = false;

                for(int k = 0; k < n; k++) {
                    if(arr[row][k] == element) {
                        present = true;
                        break;
                    }
                }

                if(!present)
                    break;
            }

            if(row == n) {         
                result[index] = element;
                index++;
            }
        }

        if(index == 0) {
            System.out.println("No common elements found.");
        } else {
            System.out.print("Common elements: ");
            for(int i = 0; i < index; i++) {
                System.out.print(result[i] + " ");
            }
        }

        sc.close();
    }
}