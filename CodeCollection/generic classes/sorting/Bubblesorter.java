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
public class Bubblesorter<T extends Comparable<T>> {
	
	public final static String ASC = "ASC";
	public final static String DESC = "DESC";
	
	
	/**
	 * Sorts a specified array ascending.
	 * 
	 * Sorting is case-sensitive. First, upper case is sorted A-Z, 
	 * followed by lower case letters a-z.
	 * 
	 * @param array
	 */
	public void sort(T[] array) {
		//case: array == null
		if(array == null || array.length == 0) {
			throw new NullPointerException();
		}
		//case: array contains 1 element
		if(array.length == 1) {
			return;
		}
		//default sortMode Ascending
		sort(ASC, array);
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
		//case: array == null
		if(array == null || array.length <= 0 || sortMode == null) {
			throw new NullPointerException();
		}
		//case: sortMode wrong
		if((!(sortMode.equals(ASC))) 
				&& (!(sortMode.equals(DESC)))) {
			throw new IllegalArgumentException();
		}
		//case: array contains 1 element
		if(array.length == 1) {
			return;
		}
		//sort
		for(int i = 0; i < array.length - 1; i++) {
			//assumption field is sorted = true
			boolean sorted = true;
			//parse the field
			//for each i round (j less i) 
			//as the last indexes (j - i - 1) are considered to be sorted after each j-round
			for(int j = 0; j < array.length - 1 - i; j++) {
				//case: sortMode ASC
				if(sortMode.equals(ASC)) {
					//compare j and j+1
					//if j is larger that j+1
					if(array[j].compareTo(array[j+1]) > 0) {
						//switch
						T temp = array[j];
						array[j] = array[j+1];
						array[j+1] = temp;
						//assumption field is sorted = false,
						//as unsorted values had been found
						sorted = false;					
					}
				} else if(sortMode.equals(DESC)) {
				//case: sortMode DESC
					//compare j and j+1
					//if j is larger that j+1
					if(array[j].compareTo(array[j+1]) < 0) {
						//switch
						T temp = array[j];
						array[j] = array[j+1];
						array[j+1] = temp;
						//assumption field is sorted = false,
						//as unsorted values had been found
						sorted = false;					
					}
				} else {
					throw new IllegalArgumentException("Please choose a sort mode ASC for ascending or DESC for descending sorting.");
				}				
			}
			if(sorted) {
				//no changes need to be made
				break;
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
		//case: array == null
		if(array == null || array.length == 0) {
			throw new NullPointerException();
		}
		//case: array contains 1 element
		if(array.length == 1) {
			return;
		}
		//sort
		for(int i = 0; i < array.length - 1; i++) {
			//assumption field is sorted = true
			boolean sorted = true;
			//parse the field
			//for each i round (j less i) 
			//as the last indexes (j - i - 1) are considered to be sorted after each j-round
			for(int j = 0; j < array.length - 1 - i; j++) {
				//compare j and j+1
				//if j is larger that j+1
				if(array[j].compareTo(array[j+1]) > 0) {
					//switch
					T temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					//assumption field is sorted = false,
					//as unsorted values had been found
					sorted = false;					
				}
			}
			if(sorted) {
				//no changes need to be made
				break;
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
		//case: array == null
		if(array == null || array.length == 0) {
			throw new NullPointerException();
		}
		//case: array contains 1 element
		if(array.length == 1) {
			return;
		}
		//sort
		for(int i = 0; i < array.length - 1; i++) {
			//assumption field is sorted = true
			boolean sorted = true;
			//parse the field
			//for each i round (j less i) 
			//as the last indexes (j - i - 1) are considered to be sorted after each j-round
			for(int j = 0; j < array.length - 1 - i; j++) {
				//compare j and j+1
				//if j is smaller than j+1
				if(array[j].compareTo(array[j+1]) < 0) {
					//switch
					T temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					//assumption field is sorted = false,
					//as unsorted values had been found
					sorted = false;					
				}
			}
			if(sorted) {
				//no changes need to be made
				break;
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
		//case: list == null
		if(list == null) {
			throw new NullPointerException();
		}
		//list contains 1 element
		if(list.size() == 1) {
			return;
		}
		//default sort: ascending
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
		//case: list == null
		if(list == null) {
			throw new NullPointerException();
		}
		//case sort mode wrong
		if((!(sortMode.equals(ASC))) 
				&& (!(sortMode.equals(DESC)))) {
			throw new IllegalArgumentException();
		}
		//list contains 1 element
		if(list.size() == 1) {
			return;
		}
		//sort
		for (int i = 0; i < list.size(); i++) {
			//assumption: list is sorted = true;
			boolean sorted = true;
			//parse list
			for(int j = 0; j < list.size() - 1 - i; j++) {
				//case: sortModeASC || null (default)
				if(sortMode.equals(ASC)) {
					//if j is larger than j+1
					if(list.get(j).compareTo(list.get(j+1)) > 0) {
						//switch
						T temp = list.get(j);
						list.set(j, list.get(j+1));
						list.set((j+1), temp);
						//set sorted false as unsorted elements found
						sorted = false;
					}
				} else if(sortMode.equals(DESC)) {
				//case: sortMode == DESC
					//if j is smaller than j+1
					if(list.get(j).compareTo(list.get(j+1)) < 0) {
						//switch
						T temp = list.get(j);
						list.set(j, list.get(j+1));
						list.set((j+1), temp);
						//set sorted false as unsorted elements found
						sorted = false;
					}
				}
			}
			if(sorted) {
				break;
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
		//case: list == null
		if(list == null) {
			throw new NullPointerException();
		}
		//list contains 1 element
		if(list.size() == 1) {
			return;
		}
		//sort descending
		for (int i = 0; i < list.size(); i++) {
			//assumption: list is sorted = true;
			boolean sorted = true;
			//parse list
			for(int j = 0; j < list.size() - 1 - i; j++) {
				//if j is larger than j+1
				if(list.get(j).compareTo(list.get(j+1)) > 0) {
					//switch
					T temp = list.get(j);
					list.set(j, list.get(j+1));
					list.set((j+1), temp);
					//set sorted false as unsorted elements found
					sorted = false;
				}
			}
			if(sorted) {
				break;
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
		//case: list == null
		if(list == null) {
			throw new NullPointerException();
		}
		//list contains 1 element
		if(list.size() == 1) {
			return;
		}	
		//sort
		for (int i = 0; i < list.size(); i++) {
			//assumption: list is sorted = true;
			boolean sorted = true;
			//parse list
			for(int j = 0; j < list.size() - 1 - i; j++) {
				//if j is smaller than j+1
				if(list.get(j).compareTo(list.get(j+1)) < 0) {
					//switch
					T temp = list.get(j);
					list.set(j, list.get(j+1));
					list.set((j+1), temp);
					//set sorted false as unsorted elements found
					sorted = false;
				}
			}
			if(sorted) {
				break;
			}
		}	
	}
}