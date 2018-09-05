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
public class Selectionsort<T extends Comparable<T>> {
	
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
		for(int i = 0; i < array.length - 1; i++) {
			//position start entry for comparison
			int indexEntry = 0;
			if(sortMode == "ASC" || sortMode == null) {
				for(int j = 1; j < array.length - i; j++) {
					//if entry j is bigger than entryToCompare
					if(array[j].compareTo(array[indexEntry]) > 0) {
						//new position of entry to compare
						indexEntry = j;
					}
				}
			} else if(sortMode == "DESC") {
				for(int j = 1; j < array.length - i; j++) {
					//if entry j is smaller than entryToCompare
					if(array[j].compareTo(array[indexEntry]) < 0) {
						//new position of entry to compare
						indexEntry = j;
					}
				}
			} else {
				throw new IllegalArgumentException("Please choose correct sort mode.");
			}
			//if indexMax is not last position of currently unsorted entries
			if(indexEntry != array.length - 1 - i) {
				//switch
				T temp = array[array.length - 1 - i];
				array[array.length - 1 - i] = array[indexEntry];
				array[indexEntry] = temp;				
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
		//sort
		for(int i = 0; i < array.length - 1; i++) {
			//position max entry
			int indexMax = 0;
			
			for(int j = 1; j < array.length - i; j++) {
				if(array[j].compareTo(array[indexMax]) > 0) {
					//new max position
					indexMax = j;
				}
			}
			//if indexMax is not last position of currently unsorted entries
			if(indexMax != array.length - 1 - i) {
				//switch
				T temp = array[array.length - 1 - i];
				array[array.length - 1 - i] = array[indexMax];
				array[indexMax] = temp;				
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
		//sort
		for(int i = 0; i < array.length - 1; i++) {
			//position min entry
			int indexMin = 0;
			
			for(int j = 1; j < array.length - i; j++) {
				if(array[j].compareTo(array[indexMin]) < 0) {
					//new min position
					indexMin = j;
				}
			}
			//if indexMax is not last position of currently unsorted entries
			if(indexMin != array.length - 1 - i) {
				//switch
				T temp = array[array.length - 1 - i];
				array[array.length - 1 - i] = array[indexMin];
				array[indexMin] = temp;				
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
		//case: list empty
		if(list.size() == 0 || list == null) {
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
		//case: list empty
		if(list.size() == 0 || list == null) {
			return;
		}
		//case: list contains 1 element
		if(list.size() == 1) {
			return;
		}
		//sort
		for(int i = 0; i < list.size() - 1; i++) {
			//position entryToCompare
			int indexEntry = 0;
			
			for(int j = 1; j < list.size() - i; j++) {
				if(sortMode == ASC || sortMode == null) {
					//compare current with entryToCompare entry
					//if entry entryToCompare is smaller than j-entry
					if(list.get(indexEntry).compareTo(list.get(j)) < 0) {
						//switch entryToCompare
						indexEntry = j;
					}
				} else if(sortMode == DESC) {
					//compare current with entryToCompare entry
					//if entry entryToCompare is bigger than j-entry
					if(list.get(indexEntry).compareTo(list.get(j)) > 0) {
						//switch entryToCompare
						indexEntry = j;
					}
				} else {
					throw new IllegalArgumentException("Please choose correct sort mode.");
				}
			}
			//if entryToCompare is not last position of currently unsorted entries
			if(indexEntry != list.size() - 1 - i) {
				//switch entries
				T temp = list.get(list.size() - 1 - i);
				list.set(list.size() - 1 - i, list.get(indexEntry));
				list.set(indexEntry, temp);
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
		
		for(int i = 0; i < list.size() - 1; i++) {
			//position max entry
			int indexMax = 0;
			
			for(int j = 1; j < list.size() - i; j++) {
				//compare current with maxIndex entry
				//if entry indexMax is smaller than j-entry
				if(list.get(indexMax).compareTo(list.get(j)) < 0) {
					//switch indexMax
					indexMax = j;
				}
			}
			//if indexMay is not last position of currently unsorted entries
			if(indexMax != list.size() - 1 - i) {
				//switch entries
				T temp = list.get(list.size() - 1 - i);
				list.set(list.size() - 1 - i, list.get(indexMax));
				list.set(indexMax, temp);
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
		
		for(int i = 0; i < list.size() - 1; i++) {
			//position min entry
			int indexMin = 0;
			
			for(int j = 1; j < list.size() - i; j++) {
				//compare current with minIndex entry
				//if entry indexMin is bigger than j-entry
				if(list.get(indexMin).compareTo(list.get(j)) > 0) {
					//switch indexMin
					indexMin = j;
				}
			}
			//if indexMin is not last position of currently unsorted entries
			if(indexMin != list.size() - 1 - i) {
				//switch entries
				T temp = list.get(list.size() - 1 - i);
				list.set(list.size() - 1 - i, list.get(indexMin));
				list.set(indexMin, temp);
			}
		}
	}
}