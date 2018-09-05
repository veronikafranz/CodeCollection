package sorting;

import java.util.LinkedList;


/**
 * A generic class for sorting LinkedList and array entries 
 * of different data types ascending or descending.
 * 
 * Sorting is case-sensitive. First, upper case is sorted A-Z, 
 * followed by lower case letters a-z.
 * 
 * @author veron
 *
 * @param <T> data type
 */
public class Insertionsort<T extends Comparable<T>> {
	
	final static String ASC = "ASC";
	final static String DESC = "DESC";
	
	/**
	 * Sorts a specified array ascending.
	 * 
	 * Sorting is case-sensitive. First, upper case is sorted A-Z, 
	 * followed by lower case letters a-z.
	 * 
	 * @param array
	 */
	public void sort(T[] array) {
		//case: array is empty
		if(array == null || array.length <= 0) {
			return;
		}
		//case: array contains only 1 element
		if(array.length == 1) {
			return;
		}
		//sort default mode ASC
		sort("ASC", array);
	}
	
	/**
	 * Sorts a specified array according to specified sortMode,
	 * whereas "ASC" needs to be chosen for ascending and
	 * "DESC" for descending sorting.
	 * 
	 * Sorting is case-sensitive. First, upper case is sorted A-Z, 
	 * followed by lower case letters a-z.
	 * 
	 * @param sortMode
	 * @param array
	 */
	public void sort(String sortMode, T[] array) {
		//case: array is empty
		if(array == null || array.length <= 0) {
			return;
		}
		//case: array contains only 1 element
		if(array.length == 1) {
			return;
		}
		//sort
		for(int i = 1; i < array.length; i++) {
			for(int j = i; j > 0; j--) {
				//case: sortMode ASC
				if(sortMode == ASC || sortMode == null) {
					//if j-1 entry is bigger than j
					if(array[j-1].compareTo(array[j]) > 0) {
						//switch
						T temp = array[j-1];
						array[j-1] = array[j];
						array[j] = temp;					
					} else {
						break;
					}
				} else if(sortMode == DESC) {
					//if j-1 entry is smaller than j
					if(array[j-1].compareTo(array[j]) < 0) {
						//switch
						T temp = array[j-1];
						array[j-1] = array[j];
						array[j] = temp;					
					} else {
						break;
					}
				} else {
					throw new IllegalArgumentException("Please choose correct sortMode.");
				}
			}
		}
	}

	/**
	 * Sorts a specified array ascending.
	 * 
	 * Sorting is case-sensitive. First, upper case is sorted A-Z, 
	 * followed by lower case letters a-z.
	 * 
	 * @param array
	 */
	public void sortAscending(T[] array) {
		//case: array is empty
		if(array == null || array.length <= 0) {
			return;
		}
		//case: array contains only 1 element
		if(array.length == 1) {
			return;
		}
		for(int i = 1; i < array.length; i++) {
			for(int j = i; j > 0; j--) {
				//if j-1 entry is bigger than j
				if(array[j-1].compareTo(array[j]) > 0) {
					//switch
					T temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;					
				} else {
					break;
				}
			}
		}
	}
	
	/**
	 * Sorts a specified array descending.
	 * 
	 * Sorting is case-sensitive. For e.g. ascending this means, upper case is sorted A-Z, 
	 * followed by lower case letters a-z, for descending it's reverse.
	 * 
	 * @param array
	 */
	public void sortDescending(T[] array) {
		//case: array is empty
		if(array == null || array.length <= 0) {
			return;
		}
		//case: array contains only 1 element
		if(array.length == 1) {
			return;
		}
		for(int i = 1; i < array.length; i++) {
			for(int j = i; j > 0; j--) {
				//if j-1 entry is bigger than j
				if(array[j-1].compareTo(array[j]) < 0) {
					//switch
					T temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;					
				} else {
					break;
				}
			}
		}
	}
	
	/**
	 * Sorts a specified list ascending.
	 * 
	 * Sorting is case-sensitive. For e.g. ascending this means, upper case is sorted A-Z, 
	 * followed by lower case letters a-z, for descending it's reverse.
	 * 
	 * @param list
	 */
	public void sort(LinkedList<T> list) {
		//case: list is empty
		if(list == null || list.size() <= 0) {
			return;
		}
		//case: list contains 1 element
		if(list.size() == 1) {
			return;
		}
		//sort default mode ASC
		sort("ASC", list);
	}

	/**
	 * Sorts a specified list according to chosen sort Mode,
	 * whereas "ASC" is used for ascending and
	 * "DESC" for descending sorting.
	 * 
	 * Sorting is case-sensitive. For e.g. ascending this means, upper case is sorted A-Z, 
	 * followed by lower case letters a-z, for descending it's reverse.
	 * 
	 * @param sortMode
	 * @param list
	 */
	public void sort(String sortMode, LinkedList<T> list) {
		//case: list is empty
		if(list.size() <= 0) {
			return;
		}
		//case: list contains 1 element
		if(list.size() == 1) {
			return;
		}
		//sort
		for(int i = 1; i < list.size(); i++) {
			for(int j = i; j > 0; j--) {
				if(sortMode == ASC || sortMode == null) {
					//go through list
					if(list.get(j-1).compareTo(list.get(j)) > 0) {
						//switch
						T temp = list.get(j-1);
						list.set((j-1), list.get(j));
						list.set(j, temp);
					} else {
						//nothing to switch till current node/entry
						break;
					}
				} else if(sortMode == DESC) {
					//go through list
					if(list.get(j-1).compareTo(list.get(j)) < 0) {
						//switch
						T temp = list.get(j-1);
						list.set((j-1), list.get(j));
						list.set(j, temp);
					} else {
						//nothing to switch till current node/entry
						break;
					}
				} else {
					throw new IllegalArgumentException("Please choose correct sort mode.");
				}
			}
		}
	}	

	
	/**
	 * Sorts specified list ascending.
	 * 
	 * Sorting is case-sensitive. For e.g. ascending this means, upper case is sorted A-Z, 
	 * followed by lower case letters a-z, for descending it's reverse.
	 * 
	 * @param list
	 */
	public void sortAscending(LinkedList<T> list) {
		//case: list is empty
		if(list.size() <= 0) {
			return;
		}
		//sort
		for(int i = 1; i < list.size(); i++) {
			for(int j = i; j > 0; j--) {
				//go through list
				if(list.get(j-1).compareTo(list.get(j)) > 0) {
					//switch
					T temp = list.get(j-1);
					list.set((j-1), list.get(j));
					list.set(j, temp);
				} else {
					//nothing to switch till current node/entry
					break;
				}
			}
		}
	}	

	/**
	 * Sorts a specified list descending.
	 * 
	 * Sorting is case-sensitive. For e.g. ascending this means, upper case is sorted A-Z, 
	 * followed by lower case letters a-z, for descending it's reverse.
	 * 
	 * @param list
	 */
	public void sortDescending(LinkedList<T> list) {
		//case: list is empty
		if(list.size() <= 0 || list == null) {
			return;
		}
		//sort
		for(int i = 1; i < list.size(); i++) {
			for(int j = i; j > 0; j--) {
				//go through list
				if(list.get(j-1).compareTo(list.get(j)) < 0) {
					//switch
					T temp = list.get(j-1);
					list.set((j-1), list.get(j));
					list.set(j, temp);
				} else {
					//nothing to switch till current node/entry
					break;
				}
			}
		}
	}		

}