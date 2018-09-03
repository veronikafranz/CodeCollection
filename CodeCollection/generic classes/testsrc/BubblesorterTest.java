package testsrc;

import junit.framework.TestCase;
import java.util.LinkedList;
import sorting.Bubblesorter;

public class BubblesorterTest extends TestCase {
	
	Bubblesorter<String> bubble1;
	Bubblesorter<Integer> bubble2;
	
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
		//Bubblesorter array String
		bubble1 = new Bubblesorter<String>();
		bubble2 = new Bubblesorter<Integer>();
		//test arrays Strings
		array1 = new String[] {"mno", "jkl", "def", "pqi", "ghi", "abc"};
		array2 = new String[] {"mno", "mno", "def", "pqi", "ghi", "abc"};
		array3 = new String[] {"mno", "mnn", "aac", "pqi", "ghi", "aab"};
		array4 = new String[] {"Pqj", "aac", "Aac", "pqj", "Aab", "aab", "Mnn", "mnn"};
		//test arrays Integer
		array5 = new Integer[] {456, 789, 258, 796, 235, 845, 1, -89, -1, 0};
		array6 = new Integer[] {456, 456, 258, 796, 1, 845, 1, -89, -1, 0};
		
		//solution String ascending
		array1s = new String[] {"abc", "def", "ghi", "jkl", "mno", "pqi" };
		array2s = new String[] {"abc", "def", "ghi", "mno", "mno", "pqi" };
		array3s = new String[] {"aab", "aac", "ghi", "mnn", "mno", "pqi" };
		array4s = new String[] {"Aab", "Aac", "Mnn", "Pqj", "aab", "aac", "mnn", "pqj"};
		//solution Integer ascending
		array5s = new Integer[] {-89, -1, 0, 1, 235, 258, 456, 789, 796, 845};
		array6s = new Integer[] {-89, -1, 0, 1, 1, 258, 456, 456, 796, 845};
		
		//solution String descending
		array1d = new String[] {"pqi", "mno", "jkl", "ghi", "def", "abc" };
		array2d = new String[] {"pqi", "mno", "mno", "ghi", "def", "abc" };
		array3d = new String[] {"pqi", "mno", "mnn", "ghi", "aac", "aab" };
		array4d = new String[] {"pqj", "mnn", "aac", "aab", "Pqj", "Mnn", "Aac", "Aab"};
		//solution Integer descending
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
			//entries test lists String
			list1.add(array1[i]);
			list2.add(array2[i]);
			list3.add(array3[i]);
			//entries test lists Integer
			list5.add(array5[i]);
			list6.add(array6[i]);
			//entries solution lists String ascending
			list1s.add(array1s[i]);
			list2s.add(array2s[i]);
			list3s.add(array3s[i]);
			//entries solution lists Integer ascending
			list5s.add(array5s[i]);
			list6s.add(array6s[i]);
			//solution list String descending
			list1d.add(array1d[i]);
			list2d.add(array2d[i]);
			list3d.add(array3d[i]);
			//solution lists Integer descending
			list5d.add(array5d[i]);
			list6d.add(array6d[i]);
		}
		for(int i = array4.length - 1; i <= 0; i++) {
			//test and solution list String ascending s and descending d
			list4.add(array4[i]);
			list4s.add(array4s[i]);
			list4d.add(array4d[i]);
		}
	}

	public void testDefaultSortModeAscendingStringArray() {
		
		bubble1.sort(array1);
		for(int i = 0; i < array1.length; i++) {
			assertEquals("Default sort mode (ASC) sorting of String" 
					+ "failed.", true, array1[i].equals(array1s[i]));
		}
		bubble1.sort(array2);
		for(int i = 0; i < array2.length; i++) {
			assertEquals("Default sort mode (ASC) sorting of String with duplicate " 
					+ "Strings failed.", true, array2[i].equals(array2s[i]));
		}
		bubble1.sort(array3);
		for(int i = 0; i < array3.length; i++) {
			assertEquals("Default sort mode (ASC) sorting of String with differences in 2nd or 3rd letter" 
					+ " failed.", true, array3[i].equals(array3s[i]));
		}
		bubble1.sort(array4);
		for(int i = 0; i < array4.length; i++) {
			assertEquals("Default sort mode (ASC) sorting of String with upper and lower case" 
					+ " failed.", true, array4[i].equals(array4s[i]));
		}
	}

	public void testDefaultSortModeAscendingIntegerArray() {
		
		bubble2.sort(array5);
		for(int i = 0; i < array5.length; i++) {
			assertEquals("Default sort mode (ascending) sorting of Integer" 
					+ "failed.", true, array5[i].equals(array5s[i]));
		}
		bubble2.sort(array6);
		for(int i = 0; i < array6.length; i++) {
			assertEquals("Default sort mode (ascending) sorting of Integer with duplicate " 
					+ "values failed.", true, array6[i].equals(array6s[i]));
		}
		//compare first and last elements of arrays
		assertEquals("Default sort mode (ascending) sorting of Integer "
				+ "failed.", true, array5[0].equals(array5s[0]));
		assertEquals("Default sort mode (ascending) sorting of Integer with duplicate "
				+ "failed.", true, array6[array6.length-1].equals(array6s[array6s.length-1]));
		
	}

	public void testSortModeAscDesc() {
		bubble1.sort("DESC", array1);
		for(int i = 0; i < array1.length; i++) {
			assertEquals("Descending sort mode sorting of String" 
					+ "failed.", true, array1[i].equals(array1d[i]));
		}
		bubble1.sort("ASC", array2);
		for(int i = 0; i < array2.length; i++) {
			assertEquals("Ascending sort mode sorting of String" 
					+ "failed.", true, array2[i].equals(array2s[i]));
		}
		bubble2.sort("DESC", array5);
		for(int i = 0; i < array5.length; i++) {
			assertEquals("Descending sort mode sorting of Integer" 
					+ "failed.", true, array5[i].equals(array5d[i]));
		}
		bubble2.sort("ASC", array6);
		for(int i = 0; i < array6.length; i++) {
			assertEquals("Descending sort mode sorting of Integer" 
					+ "failed.", true, array6[i].equals(array6s[i]));
		}
		/*bubble1.sort("ASC", list1);
		for(int i = 0; i < list1.size(); i++) {
			assertEquals("Sort mode ASC sorting of String list" 
					+ "failed.", true, list1.get(0).equals(list1s.get(i)));
		}
		bubble1.sort("DESC", list2);
		for(int i = 0; i < list2.size(); i++) {
			assertEquals("DESC sort mode sorting of String list" 
					+ "failed.", true, list2.get(0).equals(list2d.get(i)));
		}*/
	}
	
	public void testSortAscendingStringArray() {
		
		bubble1.sortAscending(array1);
		for(int i = 0; i < array1.length; i++) {
			assertEquals("Ascending sorting of String" 
					+ "failed.", true, array1[i].equals(array1s[i]));
		}
		bubble1.sortAscending(array2);
		for(int i = 0; i < array2.length; i++) {
			assertEquals("Ascending sorting of String with duplicate " 
					+ "Strings failed.", true, array2[i].equals(array2s[i]));
		}
		bubble1.sortAscending(array3);
		for(int i = 0; i < array3.length; i++) {
			assertEquals("Ascending sorting of String with differences in 2nd or 3rd letter" 
					+ " failed.", true, array3[i].equals(array3s[i]));
		}
		bubble1.sortAscending(array4);
		for(int i = 0; i < array4.length; i++) {
			assertEquals("Ascending sorting of String with upper and lower case" 
					+ " failed.", true, array4[i].equals(array4s[i]));
		}
		//compare first and last elements of arrays
		assertEquals("Ascending sorting of String with differences in 2nd or 3rd letter"
				+ " failed.", true, array3[array3.length-1].equals(array3s[array3s.length - 1]));
		assertEquals("Ascending sorting of String with upper and lower case" 
				+ " failed.", true, array4[0].equals(array4s[0]));
	}

	public void testSortDescendingStringArray() {
		
		bubble1.sortDescending(array1);
		for(int i = 0; i < array1.length; i++) {
			assertEquals("Descending sorting of String" 
					+ "failed.", true, array1[i].equals(array1d[i]));
		}
		bubble1.sortDescending(array2);
		for(int i = 0; i < array2.length; i++) {
			assertEquals("Descending sorting of String with duplicate " 
					+ "Strings failed.", true, array2[i].equals(array2d[i]));
		}
		bubble1.sortDescending(array3);
		for(int i = 0; i < array3.length; i++) {
			assertEquals("Descending sorting of String with differences in 2nd or 3rd letter" 
					+ " failed.", true, array3[i].equals(array3d[i]));
		}
		bubble1.sortDescending(array4);
		for(int i = 0; i < array4.length; i++) {
			assertEquals("Descending sorting of String with upper and lower case" 
					+ " failed.", true, array4[i].equals(array4d[i]));
		}
		//compare first and last element of arrays
		assertEquals("Descending sorting of String with duplicate Strings "
				+ "failed.", true, array2[0].equals(array2d[0]));
		assertEquals("Descending sorting of String"
				+ " failed.", true, array1[array1.length-1].equals(array1d[array1d.length-1]));
	}
	
	public void testSortAscendingIntegerArray() {
		
		bubble2.sortAscending(array5);
		for(int i = 0; i < array5.length; i++) {
			assertEquals("Ascending sorting of Integer" 
					+ "failed.", true, array5[i].equals(array5s[i]));
		}
		bubble2.sortAscending(array6);
		for(int i = 0; i < array6.length; i++) {
			assertEquals("Ascending sorting of Integer with duplicate " 
					+ "values failed.", true, array6[i].equals(array6s[i]));
		}
		//compare first and last elements of arrays
		assertEquals("Ascending sorting of Integer "
				+ "failed.", true, array5[0].equals(array5s[0]));
		assertEquals("Ascending sorting of Integer with duplicate "
				+ "failed.", true, array6[array6.length-1].equals(array6s[array6s.length-1]));
	}

	public void testSortDescendingIntegerArray() {
		
		bubble2.sortDescending(array5);
		for(int i = 0; i < array5.length; i++) {
			assertEquals("Descending sorting of Integer" 
					+ "failed.", true, array5[i].equals(array5d[i]));
		}
		bubble2.sortDescending(array6);
		for(int i = 0; i < array6.length; i++) {
			assertEquals("Descending sorting of Integer with duplicate " 
					+ "values failed.", true, array6[i].equals(array6d[i]));
		}
		//compare first and last elements of array
		assertEquals("Descending sorting of Integer"
				+ " failed.", true, array5[0].equals(array5d[0]));
		assertEquals("Descending sorting of Integer "
				+ "failed.", true, array6[array6.length-1].equals(array6d[array6d.length-1]));
	}
	
	public void testSortAscendingLinkedListOfString() {
		bubble1.sortAscending(list1);
		for(int i = 0; i < list1.size(); i++) {
			assertEquals("Ascending sorting of String" 
					+ "failed.", true, list1.get(0).equals(list1s.get(i)));
		}
		bubble1.sortAscending(list2);
		for(int i = 0; i < list2.size(); i++) {
			assertEquals("Ascending sorting of String" 
					+ "failed.", true, list2.get(0).equals(list2s.get(i)));
		}
		bubble1.sortAscending(list3);
		for(int i = 0; i < list3.size(); i++) {
			assertEquals("Ascending sorting of String" 
					+ "failed.", true, list3.get(0).equals(list3s.get(i)));
		}
		bubble1.sortAscending(list4);
		for(int i = 0; i < list4.size(); i++) {
			assertEquals("Ascending sorting of String" 
					+ "failed.", true, list4.get(0).equals(list4s.get(i)));
		}
	}

	public void testSortDescendingLinkedListOfString() {
		bubble1.sortDescending(list1);
		for(int i = 0; i < list1.size(); i++) {
			assertEquals("Descending sorting of String" 
					+ "failed.", true, list1.get(0).equals(list1d.get(i)));
		}
		bubble1.sortDescending(list2);
		for(int i = 0; i < list2.size(); i++) {
			assertEquals("Descending sorting of String" 
					+ "failed.", true, list2.get(0).equals(list2d.get(i)));
		}
		bubble1.sortDescending(list3);
		for(int i = 0; i < list3.size(); i++) {
			assertEquals("Descending sorting of String" 
					+ "failed.", true, list3.get(0).equals(list3d.get(i)));
		}
		bubble1.sortDescending(list4);
		for(int i = 0; i < list4.size(); i++) {
			assertEquals("Descending sorting of String" 
					+ "failed.", true, list4.get(0).equals(list4d.get(i)));
		}
	}

	
	public void testSortAscendingLinkedListOfInteger() {
		bubble2.sortAscending(list5);
		for(int i = 0; i < list5.size(); i++) {
			assertEquals("Ascending sorting of Integer" 
					+ "failed.", true, list5.get(0).equals(list5s.get(i)));
		}
		bubble2.sortAscending(list6);
		for(int i = 0; i < list6.size(); i++) {
			assertEquals("Ascending sorting of Integer" 
					+ "failed.", true, list6.get(0).equals(list6s.get(i)));
		}
	}

	public void testSortDescendingLinkedListOfInteger() {
		bubble2.sortDescending(list5);
		for(int i = 0; i < list5.size(); i++) {
			assertEquals("Descending sorting of Integer" 
					+ "failed.", true, list5.get(0).equals(list5d.get(i)));
		}
		bubble2.sortDescending(list6);
		for(int i = 0; i < list6.size(); i++) {
			assertEquals("Descending sorting of Integer" 
					+ "failed.", true, list6.get(0).equals(list6d.get(i)));
		}
	}

	
}
