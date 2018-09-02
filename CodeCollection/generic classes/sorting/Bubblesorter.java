package sorting;

import java.util.LinkedList;

public class Bubblesorter<T extends Comparable<T>> {

	//TODO test
	public void sortAscending(T[] array) {
		
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
	
	//TODO test
	public void sortAscending(LinkedList<T> list) {
		
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
	
	public static void main(String[] args) {
		
		/*
		String[] array1 = new String[] {"abc", "jkl", "def", "pqi", "ghi", "mno"};
		String[] array4 = new String[] {"Pqj", "aac", "Aac", "pqj", "Aab", "aab", "Mnn", "mnn"};
		
		String[] array1a = new String[] {"abc", "def", "ghi", "jkl", "mno", "pqi" };
		
		for(int i = 0; i < array4.length; i++) {
			System.out.print(array4[i] + " ");
		}
		System.out.println("");
		
		Bubblesorter<String> bubble1 = new Bubblesorter<String>();
		bubble1.sortAscending(array4);
		
		for(int i = 0; i < array4.length; i++) {
			System.out.print(array4[i] + " ");
		}
		System.out.println("");
		for(int i = 0; i < array1a.length; i++) {
			System.out.print(array1a[i] + " ");
		}*/

		
	}
}