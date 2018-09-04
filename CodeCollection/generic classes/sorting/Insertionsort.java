package sorting;

import java.util.LinkedList;

public class Insertionsort<T extends Comparable<T>> {
	
	final static String ASC = "ASC";
	final static String DESC = "DESC";
	
	//TODO test
	public void sort(T[] array) {
		//case: array empty
		if(array.length <= 0) {
			return;
		}
		//case: array contains 1 element
		if(array.length == 1) {
			return;
		}
		//sort default mode ASC
		sort("ASC", array);
	}
	
	//TODO test
	public void sort(String sortMode, T[] array) {
		//case: array empty
		if(array.length <= 0) {
			return;
		}
		//case: array contains 1 element
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

	//TODO test
	public void sortAscending(T[] array) {
		//case: array empty
		if(array.length <= 0) {
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
	
	//TODO test
	public void sortDescending(T[] array) {
		//case: array empty
		if(array.length <= 0) {
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
	
	//TODO test
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

	//TODO test
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

	
	//TODO test
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

	//TODO test
	public void sortDescending(LinkedList<T> list) {
		//case: list is empty
		if(list.size() <= 0) {
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
