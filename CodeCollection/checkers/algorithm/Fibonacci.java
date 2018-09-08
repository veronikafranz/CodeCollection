package algorithm;

public class Fibonacci {

	//TODO: test
	long fibRekursiv(int n) {
		if(n < 0) {
			throw new IllegalArgumentException();
		}
		//case: n equals fist values (indexes) 0 or 1
		if(n == 0 || n == 1) {
			return n;
		}
		//calculate next values (recursive sum of two prior values)
		return fibRekursiv(n - 1) + fibRekursiv(n - 2);
	}
	
	//TODO test
	long fibIterativ(int n) {
		//negative n
		if(n < 0) {
			throw new IllegalArgumentException();
		}
		//first fibonacci values
		long a = 0;
		long b = 1;
		//if n equals 0 or 1
		if(n == a) {
			return a;
		} else if(n == b) {
			return b;
		}
		long fib = 0;
		//calculate fib from n = 2 on
		for(int i = 2; i <= n; i++) {
			//fib = sum of two prior values
			fib = a + b;
			//hand over values to variables for next calc round
			a = b;
			b = fib;
		}
		return b;
	}
}
