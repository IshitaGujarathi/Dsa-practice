package Matrix;
import java.util.*;
public class RotateMatrixin90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row:");
        int n = sc.nextInt();
        System.out.println("Enter the size of col:");
        int m = sc.nextInt();

        int[][] mat = new int[n][m];
        System.out.println("Enter the element of matrix:");
        for(int i= 0;i< n; i++){
            for(int j= 0 ;j< m;j++){
                mat[i][j] =sc.nextInt();
            }
        }

        // transpose the maatrix
        for(int i=0;i< n-1;i++){
            for(int j = i+1;j< m ;j++){
                // swap then 
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        // reverse 
        for(int i=0;i< n ;i++){
             int left = 0 ;
            int right = n-1;
            while(left < right){
            // reverse the element 
            int temp = mat[i][left];
            mat[i][left] = mat[i][right];
            mat[i][right] = temp ;
            left ++;
            right--;
            }
           
            // print the rotate array ::::::::
            System.out.println("the rotated matrix is :");
            for (int k=0;k< n ;k++){
                for(int l=0;l< m ;l++){
                    System.out.println(mat[k][l] +" ");
                }

            }
            
            
        }
        sc.close();

    }
}
