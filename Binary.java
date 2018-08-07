import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Binary {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    
    	LinkedList<Integer> binValues = new LinkedList<Integer>();
    	LinkedList<Integer> ones = new LinkedList<Integer>();
    	int counter = 0, count = 0;
    	
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        
        while (n > 0) {
        	binValues.push(n % 2);
        	if(n % 2 == 1) { 
        		counter++;
        		if(counter > count) count = counter;
        	} else {
        		counter = 0;
        	}
        	n /= 2;
        } 
        
        //System.out.println("Binary values : " + binValues);
        System.out.println(count);
    }
}

