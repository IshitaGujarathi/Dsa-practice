import java.util.*;
public class findMissingRepeatedElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [][] arr = new int[][]{{1,2,4},{4,5,6}};

        int n = arr.length;
        int t = n * n;
        int repeated =-1;
        int missing =-1;

        for(int i=0; i <= t;i++){
            int count=0;

            for(int row=0; row < n;row++){
                for(int col=0; col< n;col++){
                    if(arr[row][col]==i){
                        count++;
                    }
                }
                if(count==2){
                    repeated = i;
                }
                else if(count==0){
                    missing = i;
                }

                if(repeated !=-1 && missing!= -1)
                    break;
            }
        }
        System.out.println(repeated+" " +missing); 
        sc.close();

    }
}
