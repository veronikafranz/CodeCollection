package lists.sort;

import java.util.LinkedList;

public class Selectionsort<T extends Comparable<T>> {

	public void sortAscending(T[] array) {

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
		//TODO check whether it's:  set(index, T value)
				list.set(list.size() - 1 - i, list.get(indexMax));
				list.set(indexMax, temp);
			}
		}
		
	}
}
