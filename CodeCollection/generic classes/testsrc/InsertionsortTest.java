package testsrc;

import java.util.LinkedList;
import junit.framework.TestCase;
import sorting.Insertionsort;

public class InsertionsortTest extends TestCase {
	
	Insertionsort<String> insertion1;
	Insertionsort<Integer> insertion2;	

	LinkedList<String> list1, list2, list3, list4; 
	LinkedList<String> list1s, list2s, list3s, list4s;
	LinkedList<String> list1d, list2d, list3d, list4d;
	LinkedList<Integer> list5, list6;
	LinkedList<Integer> list5s, list6s;
	LinkedList<Integer> list5d, list6d;
	
	String[] array1, array2, array3, array4;
	String[] array1s, array2s, array3s, array4s;
	String[] array1d, array2d, array3d, array4d;
	Integer[] array5, array6;
	Integer[] array5s, array6s;
	Integer[] array5d, array6d;


	protected void setUp() throws Exception {
		super.setUp();
		
		insertion1 = new Insertionsort<String>();
		insertion2 = new Insertionsort<Integer>();
		//test arrays String
		array1 = new String[] {"mno", "jkl", "def", "pqi", "ghi", "abc"};
		array2 = new String[] {"mno", "mno", "def", "pqi", "ghi", "abc"};
		array3 = new String[] {"mno", "mnn", "aac", "pqi", "ghi", "aab"};
		array4 = new String[] {"Pqj", "aac", "Aac", "pqj", "Aab", "aab", "Mnn", "mnn"};
		//test arrays Integer
		array5 = new Integer[] {456, 789, 258, 796, 235, 845, 1, -89, -1, 0};
		array6 = new Integer[] {456, 456, 258, 796, 1, 845, 1, -89, -1, 0};
		//solution arrays String ascending
		array1s = new String[] {"abc", "def", "ghi", "jkl", "mno", "pqi" };
		array2s = new String[] {"abc", "def", "ghi", "mno", "mno", "pqi" };
		array3s = new String[] {"aab", "aac", "ghi", "mnn", "mno", "pqi" };
		array4s = new String[] {"Aab", "Aac", "Mnn", "Pqj", "aab", "aac", "mnn", "pqj"};
		//solution arrays Integer ascending
		array5s = new Integer[] {-89, -1, 0, 1, 235, 258, 456, 789, 796, 845};
		array6s = new Integer[] {-89, -1, 0, 1, 1, 258, 456, 456, 796, 845};
		//solution String descending
		array1d = new String[] {"pqi", "mno", "jkl", "ghi", "def", "abc" };
		array2d = new String[] {"pqi", "mno", "mno", "ghi", "def", "abc" };
		array3d = new String[] {"pqi", "mno", "mnn", "ghi", "aac", "aab" };
		array4d = new String[] {"pqj", "mnn", "aac", "aab", "Pqj", "Mnn", "Aac", "Aab"};
		//solution arrays Integer descending
		array5d = new Integer[] {845, 796, 789, 456, 258, 235, 1, 0, -1, -89};
		array6d = new Integer[] {845, 796, 456, 456, 258, 1, 1, 0, -1, -89};
		//test lists String
		list1 = new LinkedList<String>();
		list2 = new LinkedList<String>();
		list3 = new LinkedList<String>();
		list4 = new LinkedList<String>();
		//solution lists String ascending
		list1s = new LinkedList<String>();
		list2s = new LinkedList<String>();
		list3s = new LinkedList<String>();
		list4s = new LinkedList<String>();
		//solution lists String descending
		list1d = new LinkedList<String>();
		list2d = new LinkedList<String>();
		list3d = new LinkedList<String>();
		list4d = new LinkedList<String>();
		//test lists Integer
		list5 = new LinkedList<Integer>();
		list6 = new LinkedList<Integer>();
		//solution lists Integer ascending
		list5s = new LinkedList<Integer>();
		list6s = new LinkedList<Integer>();
		//solution lists Integer descending
		list5d = new LinkedList<Integer>();
		list6d = new LinkedList<Integer>();
		
		//add entries to lists
		for(int i = array1.length - 1; i <= 0; i--) {
			//test lists String
			list1.add(array1[i]);
			list2.add(array2[i]);
			list3.add(array3[i]);
			//test lists Integer
			list5.add(array5[i]);
			list6.add(array6[i]);
			//solution lists String ascending
			list1s.add(array1[i]);
			list2s.add(array2[i]);
			list3s.add(array3[i]);
			//solution lists Integer ascending
			list5s.add(array5s[i]);
			list6s.add(array6s[i]);
			//solution lists String ascending
			list1d.add(array1d[i]);
			list2d.add(array2d[i]);
			list3d.add(array3d[i]);
			//solution lists Integer ascending
			list5d.add(array5d[i]);
			list6d.add(array6d[i]);
		}
		for(int i = array4.length - 1; i <= 0; i++) {
			//test and solutionslists ascending s and descending d
			list4.add(array4[i]);
			list4s.add(array4s[i]);
			list4d.add(array4d[i]);
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
		insertion1.sortAscending(array4);
		for(int i = 0; i < array4.length; i++) {
			assertEquals("Ascending sorting of String with upper and lower case" 
					+ " failed.", true, array4[i].equals(array4s[i]));
		}
	}

	public void testSortDescendingStringArray() {
		
		insertion1.sortDescending(array1);
		for(int i = 0; i < array1.length; i++) {
			assertEquals("Descending sorting of String" 
					+ "failed.", true, array1[i].equals(array1d[i]));
		}
		insertion1.sortDescending(array2);
		for(int i = 0; i < array2.length; i++) {
			assertEquals("Descending sorting of String with duplicate " 
					+ "Strings failed.", true, array2[i].equals(array2d[i]));
		}
		insertion1.sortDescending(array3);
		for(int i = 0; i < array3.length; i++) {
			assertEquals("Descending sorting of String with differences in 2nd or 3rd letter" 
					+ " failed.", true, array3[i].equals(array3d[i]));
		}
		insertion1.sortDescending(array4);
		for(int i = 0; i < array4.length; i++) {
			assertEquals("Descending sorting of String with upper and lower case" 
					+ " failed.", true, array4[i].equals(array4d[i]));
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

	public void testSortDescendingIntegerArray() {
		
	insertion2.sortDescending(array5);
		for(int i = 0; i < array5.length; i++) {
			assertEquals("Descending sorting of Integer" 
					+ "failed.", true, array5[i].equals(array5d[i]));
		}
		insertion2.sortDescending(array6);
		for(int i = 0; i < array6.length; i++) {
			assertEquals("Descending sorting of Integer with duplicate " 
					+ "values failed.", true, array6[i].equals(array6d[i]));
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
		insertion1.sortAscending(list4);
		for(int i = 0; i < list4.size(); i++) {
			assertEquals("Ascending sorting of String" 
					+ "failed.", true, list4.get(0).equals(list4s.get(i)));
		}
	}

	public void testSortDescendingLinkedListOfString() {
		insertion1.sortDescending(list1);
		for(int i = 0; i < list1.size(); i++) {
			assertEquals("Descending sorting of String" 
					+ "failed.", true, list1.get(0).equals(list1d.get(i)));
		}
		insertion1.sortDescending(list2);
		for(int i = 0; i < list2.size(); i++) {
			assertEquals("Descending sorting of String" 
					+ "failed.", true, list2.get(0).equals(list2d.get(i)));
		}
		insertion1.sortDescending(list3);
		for(int i = 0; i < list3.size(); i++) {
			assertEquals("Descending sorting of String" 
					+ "failed.", true, list3.get(0).equals(list3d.get(i)));
		}
		insertion1.sortDescending(list4);
		for(int i = 0; i < list4.size(); i++) {
			assertEquals("Descending sorting of String" 
					+ "failed.", true, list4.get(0).equals(list4d.get(i)));
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

	public void testSortDescendingLinkedListOfInteger() {
		insertion2.sortDescending(list5);
		for(int i = 0; i < list5.size(); i++) {
			assertEquals("Descending sorting of Integer" 
					+ "failed.", true, list5.get(0).equals(list5d.get(i)));
		}
		insertion2.sortDescending(list6);
		for(int i = 0; i < list6.size(); i++) {
			assertEquals("Descending sorting of Integer" 
					+ "failed.", true, list6.get(0).equals(list6d.get(i)));
		}
		
	}

	
}