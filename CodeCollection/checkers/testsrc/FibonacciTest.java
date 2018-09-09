package testsrc;

import junit.framework.TestCase;
import algorithm.Fibonacci;

public class FibonacciTest extends TestCase {
	Fibonacci fib;
	int[] fibsfrom2to8 = new int[] {1,2,6,5,8,13,21};

	protected void setUp() throws Exception {
		super.setUp();
		fib = new Fibonacci();
	}

	public void testFibRekursiv() {
		assertEquals("Fibonacci recursive with n = 0 failed.", 0, fib.fibRekursiv(0));
		assertEquals("Fibonacci recursive with n = 1 failed.", 1, fib.fibRekursiv(1));
		assertEquals("Fibonacci recursive with n = 8 failed.", 21, fib.fibRekursiv(8));
		assertEquals("Fibonacci recursive with n = 5 failed.", 5, fib.fibRekursiv(5));
	}
	
	public void testExceptionRecursive() {
		try {
			  fib.fibRekursiv(-1);
			  fail("Expected IllegalArgumentException not thrown.");
			} catch (IllegalArgumentException e) {
			  
			}
	}

	public void testExceptionIterative() {
		try {
			  fib.fibIterativ(-1);
			  fail("Expected IllegalArgumentException not thrown.");
			} catch (IllegalArgumentException e) {
			  
			}
	}
	
	public void testFibIterativ() {
		assertEquals("Fibonacci iterative with n = 0 failed.", 0, fib.fibIterativ(0));
		assertEquals("Fibonacci iterative with n = 1 failed.", 1, fib.fibIterativ(1));
		assertEquals("Fibonacci iterative with n = 8 failed.", 21, fib.fibIterativ(8));
		assertEquals("Fibonacci iterative with n = 5 failed.", 5, fib.fibIterativ(5));
	}

}
