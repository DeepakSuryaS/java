import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BubbleSort{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = 0;
        int totalSwaps = 0;
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if(a[j] > a[j+1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    totalSwaps++;
                }
            }
            if (totalSwaps == 0) {
                break;
            }
        }
        System.out.println("Array is sorted in " + totalSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n-1]);
    }
}
