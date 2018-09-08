package algorithm;

public class Factorial {

	//0,1,2,3,4,5,6,7
	//1,1,2,6,24,120,720,5040
	
	//TODO test
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
	
	//TODO test
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
