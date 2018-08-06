public class Recursion {
	
	//summation
	public static int Summation(int n) {
		//base case
		if (n <= 0) return 0; //0 is the additive identity property
		//recursive case		
		else {
			return n + Summation(n-1); 
		}
	}
	
	//factorial
	public static int Factorial(int n) {
		//base case
		if (n <= 0) return 1; //1 is the multiplicative identity property
		//recursive case
		else {
			return n * Factorial(n-1);
		}
	}
	
	//exponentiation
	//5^3 - 5 * 5 * 5 (or) 5 * 5^2 (or) 5 * 5 * 5^1 (or) 5 * 5 * 5 * 5^0
	public static int Exponentiation(int n, int p) { //the parameters are the number and the power of the number
		//base case
		if (p <= 0) return 1;
		else {
			return n * Exponentiation(n, p-1);
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(Summation(3));
		System.out.println(Factorial(6));
		System.out.println(Exponentiation(5, 3));		
	}
}
