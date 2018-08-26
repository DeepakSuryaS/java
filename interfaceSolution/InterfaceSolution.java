package interfaceSolution;

import java.util.Scanner;
import java.util.Stack;

interface AdvancedArithmetic {
	int divisorSum (int n);
}

class Calculator implements AdvancedArithmetic {

	public int divisorSum (int n) {
		int sum = 0;
		Stack<Integer> divisors = new Stack<Integer>();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				divisors.push(i);
			}
		}
		for (int i : divisors) {
			sum = sum + i;
		}
		return sum;
	}

}

class InterfaceSolution {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		AdvancedArithmetic myCalculator = new Calculator();
		int sum = myCalculator.divisorSum(n);
		System.out.println("I implemented " + myCalculator.getClass().getInterfaces()[0].getName());
		System.out.println(sum);
	}

}
