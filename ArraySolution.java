import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArraySolution {

	public static void printArray(int[] array) {
		for(int k : array) {
			System.out.print(k + " ");			
		}
	}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];
        int[] arrRev = new int[n];
        int i, j;
        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        
        for (i = n-1, j = 0;i > -1 && j <= n-1;i--, j++) {
            arrRev[j] = arr[i];
        }
        
        arr = arrRev;
        
        scanner.close();
        printArray(arr);
        System.out.println();
    }
}

