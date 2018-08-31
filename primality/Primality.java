import java.io.*;
import java.util.*;

public class Primality {
    
    static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i ==0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int n = 0;
        
        for (int i = 0; i < t; i++) {
            n = scan.nextInt();
            
            if (n >= 2 && isPrime(n)) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
        scan.close();
    }
}
