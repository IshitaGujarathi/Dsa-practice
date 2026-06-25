package Matrix;
import java.util.*;
public class FindSetMatrixZeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        System.out.println("Enter matrix elements:");

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int col0 = 1;

        // Step 1: Mark rows and columns
        for(int i = 0; i < m; i++) {

            if(matrix[i][0] == 0) {
                col0 = 0;
            }

            for(int j = 1; j < n; j++) {

                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Step 2: Update matrix from bottom-right
        for(int i = m - 1; i >= 0; i--) {

            for(int j = n - 1; j >= 1; j--) {

                if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }

            if(col0 == 0) {
                matrix[i][0] = 0;
            }
        }

        System.out.println("Updated Matrix:");

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}