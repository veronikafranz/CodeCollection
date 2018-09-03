package sorting;

import java.util.LinkedList;

public class Selectionsort<T extends Comparable<T>> {

	//TODO test
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
	
	//TODO test
	public void sortDescending(T[] array) {

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
	
	//TODO test
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
