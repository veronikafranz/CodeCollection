package testsrc;

import java.util.LinkedList;
import junit.framework.TestCase;
import sorting.Insertionsort;

public class InsertionsortTest extends TestCase {
	
	Insertionsort<String> insertion1;
	Insertionsort<Integer> insertion2;	

	LinkedList<String> list1, list2, list3; 
	LinkedList<String> list1s, list2s, list3s;
	LinkedList<Integer> list5, list6;
	LinkedList<Integer> list5s, list6s;
	
	String[] array1, array2, array3;
	String[] array1s, array2s, array3s;
	Integer[] array5, array6, array6s;
	Integer[] array5s;


	protected void setUp() throws Exception {
		super.setUp();
		
		insertion1 = new Insertionsort<String>();
		insertion2 = new Insertionsort<Integer>();
		//test arrays
		array1 = new String[] {"mno", "jkl", "def", "pqi", "ghi", "abc"};
		array2 = new String[] {"mno", "mno", "def", "pqi", "ghi", "abc"};
		array3 = new String[] {"mno", "mnn", "aac", "pqi", "ghi", "aab"};
		
		array5 = new Integer[] {456, 789, 258, 796, 235, 845, 1, -89, -1, 0};
		array6 = new Integer[] {456, 456, 258, 796, 1, 845, 1, -89, -1, 0};
		
		//solution ascending
		array1s = new String[] {"abc", "def", "ghi", "jkl", "mno", "pqi" };
		array2s = new String[] {"abc", "def", "ghi", "mno", "mno", "pqi" };
		array3s = new String[] {"aab", "aac", "ghi", "mnn", "mno", "pqi" };
		
		array5s = new Integer[] {-89, -1, 0, 1, 235, 258, 456, 789, 796, 845};
		array6s = new Integer[] {-89, -1, 0, 1, 1, 258, 456, 456, 796, 845};
		
		//test lists
		list1 = new LinkedList<String>();
		list2 = new LinkedList<String>();
		list3 = new LinkedList<String>();
		list1s = new LinkedList<String>();
		list2s = new LinkedList<String>();
		list3s = new LinkedList<String>();
		
		list5 = new LinkedList<Integer>();
		list6 = new LinkedList<Integer>();
		list5s = new LinkedList<Integer>();
		list6s = new LinkedList<Integer>();
		//add entries to lists
		for(int i = array1.length - 1; i <= 0; i--) {
			list1.add(array1[i]);
			list2.add(array2[i]);
			list3.add(array3[i]);
			
			list5.add(array5[i]);
			list6.add(array6[i]);
			
			list1s.add(array1[i]);
			list2s.add(array2[i]);
			list3s.add(array3[i]);
			
			list5s.add(array5s[i]);
			list6s.add(array6s[i]);
		}
		
	}

	public void testSortAscendingStringArray() {
		
		insertion1.sortAscending(array1);
		for(int i = 0; i < array1.length; i++) {
			assertEquals("Ascending sorting of String" 
					+ "failed.", true, array1[i].equals(array1s[i]));
		}
		insertion1.sortAscending(array2);
		for(int i = 0; i < array2.length; i++) {
			assertEquals("Ascending sorting of String with duplicate " 
					+ "Strings failed.", true, array2[i].equals(array2s[i]));
		}
		insertion1.sortAscending(array3);
		for(int i = 0; i < array3.length; i++) {
			assertEquals("Ascending sorting of String with differences in 2nd or 3rd letter" 
					+ " failed.", true, array3[i].equals(array3s[i]));
		}
	}
	
public void testSortAscendingIntegerArray() {
		
	insertion2.sortAscending(array5);
		for(int i = 0; i < array5.length; i++) {
			assertEquals("Ascending sorting of Integer" 
					+ "failed.", true, array5[i].equals(array5s[i]));
		}
		insertion2.sortAscending(array6);
		for(int i = 0; i < array6.length; i++) {
			assertEquals("Ascending sorting of Integer with duplicate " 
					+ "values failed.", true, array6[i].equals(array6s[i]));
		}
	}

	public void testSortAscendingLinkedListOfString() {
		insertion1.sortAscending(list1);
		for(int i = 0; i < list1.size(); i++) {
			assertEquals("Ascending sorting of String" 
					+ "failed.", true, list1.get(0).equals(list1s.get(i)));
		}
		insertion1.sortAscending(list2);
		for(int i = 0; i < list2.size(); i++) {
			assertEquals("Ascending sorting of String" 
					+ "failed.", true, list2.get(0).equals(list2s.get(i)));
		}
		insertion1.sortAscending(list3);
		for(int i = 0; i < list3.size(); i++) {
			assertEquals("Ascending sorting of String" 
					+ "failed.", true, list3.get(0).equals(list3s.get(i)));
		}
	}
	
	public void testSortAscendingLinkedListOfInteger() {
		insertion2.sortAscending(list5);
		for(int i = 0; i < list5.size(); i++) {
			assertEquals("Ascending sorting of Integer" 
					+ "failed.", true, list5.get(0).equals(list5s.get(i)));
		}
		insertion2.sortAscending(list6);
		for(int i = 0; i < list6.size(); i++) {
			assertEquals("Ascending sorting of Integer" 
					+ "failed.", true, list6.get(0).equals(list6s.get(i)));
		}
		
	}
	
}