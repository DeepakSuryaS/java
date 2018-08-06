public class MultiplyUsingAddition {
	
	// multiply n by k using addition
	private static int nTimesk (int n, int k) {
		System.out.println("n: " + n);
		//recursive case
		if (n > 1) {
			return k + nTimesk(n - 1, k);
		} 
		//base case
		else {
			return k;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(nTimesk(4 ,3));
	}
	
}
