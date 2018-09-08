package testsrc;

import junit.framework.TestCase;
import algorithm.Factorial;

public class FactorialTest extends TestCase {
	
	Factorial fa;

	protected void setUp() throws Exception {
		super.setUp();
		
		fa = new Factorial();
	}

	public void testFactorialIterativ() {
		assertEquals("Factorial iterativ with n = 0 failed.", 1, fa.factorialIterativ(0));
		assertEquals("Factorial iterativ with n = 1 failed.", 1, fa.factorialIterativ(1));
		assertEquals("Factoral iterativ with n = 2 failed.", 2, fa.factorialIterativ(2));
		assertEquals("Factorial iterativ with n = 7 failed.", 5040, fa.factorialIterativ(7));
	}

	public void testFactorialRecursive() {
		assertEquals("Factorial recursive with n = 0 failed.", 1, fa.factorialRecursive(0));
		assertEquals("Factorial recursive with n = 1 failed.", 1, fa.factorialRecursive(1));
		assertEquals("Factoral recursive with n = 2 failed.", 2, fa.factorialRecursive(2));
		assertEquals("Factorial recursive with n = 7 failed.", 5040, fa.factorialRecursive(7));
	}

}
