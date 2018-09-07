package searching;

import java.util.LinkedList;

public class Search<T extends Comparable<T>> {
	
	//TODO test
	public boolean contains(T value, T[] unsortedField) {
		for(T i : unsortedField) {
			//if field contains value i
			if(i.compareTo(value) == 0) {
				return true;
			}
		}
		//value not found
		return false;
	}
	
	//TODO test
	public boolean contains(T value, LinkedList<T> unsortedList) {
		for(int i = 0; i < unsortedList.size(); i++) {
			if(unsortedList.get(i).compareTo(value) == 0) {
				return true;
			}
		}
		return false;	
	}
	
	//TODO test
	public boolean containsAscSortedArray(T value, T[] sortedField) {
		for(T i : sortedField) {
			if(i.compareTo(value) == 0) {
				return true;
			}
			if(i.compareTo(value) > 0) {
				//value can not be found within rest of sortedField
				return false;
			}
		}
		//value not found
		return false;
	}
	
	//TODO test
	public boolean containsAscSortedArray(T value, LinkedList<T> sortedList) {
		for(int i = 0; i < sortedList.size(); i++) {
			if(sortedList.get(i).compareTo(value) == 0) {
				return true;
			}
			if(sortedList.get(i).compareTo(value) > 0) {
				return false;
			}
		}
		return false;
	}
	
	//TODO test
	public T getMin(T[] array) {
		T min = array[0];
		for(T i : array) {
			if(i.compareTo(min) < 0) {
				min = i;
			}
		}
		return min;
	}
	
	//TODO test
	public T getMin(LinkedList<T> list) {
		T min = list.getFirst();
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).compareTo(min) < 0) {
				min = list.get(i);
			}
		}
		return min;
	}
	
	//TODO test
	public T getMax(T[] array) {
		T max = array[0];
		for(T i : array) {
			if(i.compareTo(max) > 0) {
				max = i;
			}
		}
		return max;
	}
	
	//TODO test
	public T getMax(LinkedList<T> list) {
		T max = list.getFirst();
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).compareTo(max) > 0) {
				max = list.get(i);
			}
		}
		return max;
	}
	
	//TODO test
	//TODO rename in English
	public boolean istTeilfolge(T[] array, T[] searchedArray) {
		//it's not necessary to search till the end because
		//complete searchedArray can not be found
		for(int i = 0; i < array.length - searchedArray.length + 1; i++) {
			for(int j = 0; i < searchedArray.length; j++) {
				if(array[i + j] != searchedArray[j]) {
					//value in array at i + j does not match j value in searchedArray
					//continue i + 1
					break;
				} else if(j == searchedArray.length - 1) {
					//searched array found
					return true;
				}
			}
		}
		//searched array could not completely be found
		return false;
	}
	
	//TODO test
	//TODO rename in English
	public boolean istTeilfolge(LinkedList<T> list, LinkedList<T> searchedList) {
		//it's not necessary to search till the end because
		//complete searchedList can not be found
		for(int i = 0; i < list.size() - searchedList.size() + 1; i++) {
			for(int j = 0; i < searchedList.size(); j++) {
				if(!(list.get(i + j).equals(searchedList.get(j)))) {
					//value in list at i + j does not match j value in searchedList
					//continue i + 1
					break;
				} else if(j == searchedList.size() - 1) {
					//searched array found
					return true;
				}
			}
		}
		//searched list could not completely be found
		return false;
	}
	
	//TODO test
	//TODO rename in English
	public boolean istTeilfolge(LinkedList<T> list, T[] searchedArray) {
		//it's not necessary to search till the end because
		//complete searchedArray can not be found
		for(int i = 0; i < list.size() - searchedArray.length + 1; i++) {
			for(int j = 0; i < searchedArray.length; j++) {
				if(!(list.get(i + j).equals(searchedArray[j]))) {
					//value in list at i + j does not match j value in searchedArray
					//continue i + 1
					break;
				} else if(j == searchedArray.length - 1) {
					//searched array found
					return true;
				}
			}
		}
		//searched list could not completely be found
		return false;
	}
	
	
	//TODO test
	//TODO rename in English
	public boolean istTeilfolge(T[] array, LinkedList<T> searchedList) {
		//it's not necessary to search till the end because
		//complete searchedList can not be found
		for(int i = 0; i < array.length - searchedList.size() + 1; i++) {
			for(int j = 0; i < searchedList.size(); j++) {
				if(!(array[i + j].equals(searchedList.get(j)))) {
					//value in array at i + j does not match j value in searchedList
					//continue i + 1
					break;
				} else if(j == searchedList.size() - 1) {
					//searched list found
					return true;
				}
			}
		}
		//searched list could not completely be found
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
