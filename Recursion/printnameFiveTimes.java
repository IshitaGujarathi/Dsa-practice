package Recursion;
import java.util.*;

public class printnameFiveTimes {

    public static void printName(String name, int cnt){

        if(cnt == 5){
            return;
        }

        System.out.println(name);

        printName(name, cnt + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Name: ");
        String name = sc.next();

        printName(name, 0);

        sc.close();
    }
}