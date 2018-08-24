package ExceptionsPart2Solution;

import java.util.*;
import java.io.*;

class Calculator {
	int answer = 1;
	int power(int n, int p) throws Exception {
		if(n < 0 || p < 0) {
			throw new Exception("n and p should be non-negative");
		} else {
			if(p == 0) answer = 1;
			else if(p == 1) answer = n;
			else {
				for (int i = 1; i <= p; i++) {
					answer *= n;
				}
			}
		}
		return answer;
	}
}

class ExceptionsPart2Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- > 0) {
			int n = in.nextInt();
			int p = in.nextInt();
			Calculator calc = new Calculator();
			try {
				int answer = calc.power(n, p);
				System.out.println(answer);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		in.close();
	}
}
