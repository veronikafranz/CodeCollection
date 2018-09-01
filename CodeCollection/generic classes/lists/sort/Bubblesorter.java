package lists.sort;

import java.util.LinkedList;

public class Bubblesorter<T extends Comparable<T>> {

	public void sortAscending(T[] feld) {
		
		for(int i = 0; i < feld.length - 1; i++) {
			//assumption field is sorted = true
			boolean sorted = true;
			//parse the field
			//for each i round (j less i) 
			//as the last indexes (j - i - 1) are considered to be sorted after each j-round
			for(int j = 0; j < feld.length - 1 - i; j++) {
				//compare j and j+1
				//if j is larger that j+1
				if(feld[j].compareTo(feld[j+1]) > 0) {
					//switch
					T temp = feld[j];
					feld[j] = feld[j+1];
					feld[j+1] = temp;
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
//TODO check whether it's: set(index, value)
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