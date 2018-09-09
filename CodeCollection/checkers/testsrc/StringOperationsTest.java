package testsrc;

import junit.framework.TestCase;
import algorithm.StringOperations;

public class StringOperationsTest extends TestCase {
	
	StringOperations so;

	char[] testarray1;
	char[] testarray2a;
	char[] testarray2b;
	char[] testarray3;
	char[] testarray4;
	char[] testarray5;
	
	String word1;
	String word2;
	String word3;
	String word4;
	String word5;
	String word6;
	
	protected void setUp() throws Exception {
		super.setUp();
		
		so = new StringOperations();
		
		testarray1 = new char[] {'z', 'e', 'l', 'd', 'a', '/', '3', '3', 'w', 'o', 'o', 'd', 'o', 'k', 'a', 'y'};
		testarray2a = new char[0];
		testarray3 = new char[] {'a'};
		
		word1 = "wood";
		word2 = "zelda";
		word3 = "okay";
		word4 = "/";
		word5 = "33";
	}

	public void testStringMatchingLongChar() {
		assertEquals("StringMatching failed with String, which is" 
				+ " not part of array.", -1, so.stringMatching(testarray1, "hallo"));
		assertEquals("StringMatching failed with String, which is" 
				+ " part of array.", 8, so.stringMatching(testarray1, word1));
		assertEquals("StringMatching failed with String, which is" 
				+ " part of array.", 0, so.stringMatching(testarray1, word2));
		assertEquals("StringMatching failed with String, which is" 
				+ " part of array.", 12, so.stringMatching(testarray1, word3));
		assertEquals("StringMatching failed with String, which is" 
				+ " part of array.", 5, so.stringMatching(testarray1, word4));
		assertEquals("StringMatching failed with String, which is" 
				+ " part of array.", 6, so.stringMatching(testarray1, word5));
		assertEquals("StringMatching failed with String, which is" 
				+ " longer than number of characters in the test array.", -1, so.stringMatching(testarray3, word3));
		
	}
	
	public void testStringMatchingCharLength0() {
		boolean passed = false;
		String message = "";
		try {
			so.stringMatching(testarray2a, word1);
		} catch (NullPointerException e) {
			passed = true;
			message = e.getMessage();
		}
		assertEquals("StringMatching failed with empty array.", true, passed);	
		assertEquals("StringMatching failed due to wrong exception message.", 
				"Array is empty.", message);
	}
	
	public void testStringMatchingEmptyChar() {
		boolean passed = false;
		String message = "";
		try {
			so.stringMatching(testarray2b, word1);
		} catch (NullPointerException e) {
			passed = true;
			message = e.getMessage();
		}
		assertEquals("StringMatching failed with empty array.", true, passed);	
		assertEquals("StringMatching failed due to wrong exception message.", 
				"Array is empty.", message);
	}
	
	public void testStringMatchingEmptyWord() {
		boolean passed = false;
		String message = "";
		try {
			so.stringMatching(testarray1, word6);
		} catch (NullPointerException e) {
			passed = true;
			message = e.getMessage();
		}
		assertEquals("StringMatching failed with empty word.", true, passed);	
		assertEquals("StringMatching failed due to wrong exception message.", 
				"The given word does not contain any characters.", message);
	}
}
