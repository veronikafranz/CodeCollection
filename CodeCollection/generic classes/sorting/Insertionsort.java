package sorting;

import java.util.LinkedList;

public class Insertionsort<T extends Comparable<T>> {

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
}
