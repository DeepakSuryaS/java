package nestedLogic;

import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int da = sc.nextInt();
		int ma = sc.nextInt();
        	int ya = sc.nextInt();
        	int de = sc.nextInt();
        	int me = sc.nextInt();
        	int ye = sc.nextInt();
		int fine = 0;
        	sc.close();
        
        	if (ye == ya) {
        	    	if (me == ma || me < ma) {
				if (de == da || da < de) {
					System.out.println(fine);
				} else {
					fine = 15 * (da - de);
					System.out.println(fine);
				}
			} else {
				fine = 500 * (ma - me);
				System.out.println(fine);
			}
        	} else {
			fine = 10000;
			System.out.println(fine);
		}
	}

}
