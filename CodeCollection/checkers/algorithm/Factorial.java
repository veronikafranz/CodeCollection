package algorithm;


public class Factorial {


	/**
	 * Calculates the factorial n! iteratively.
	 * 
	 * @throws IllegalArgumentException, if n < 0	 * 
	 * @param n
	 * @return factorial n!
	 * 
	 */
	public long factorialIterativ(int n) {
		//case: n is negative
		if(n < 0) {
			throw new IllegalArgumentException();
		}
		long factorial = 1;
		for(int i = 2; i <= n; i++) {
			factorial *= i;
		}
		return factorial;
	}
	
	/**
	 * Calculates the factorial n! recursively.
	 * 
	 * @throws IllegalArgumentException, if n < 0	 * 
	 * @param n
	 * @return factorial n!
	 * 
	 */
	public long factorialRecursive(int n) {
		//case: n is negative
		if(n < 0) {
			throw new IllegalArgumentException();
		}
		//case n == 0
		if(n == 0) {
			return 1;
		}
		return n * factorialRecursive(n-1);
	}
}
