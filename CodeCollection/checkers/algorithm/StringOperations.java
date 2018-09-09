package algorithm;

public class StringOperations {
	
	
	
	/**
	 * Methods, which is searching whether a specified word can be found in a specified array.
	 * 
	 * @param array
	 * @param word
	 * @return index of the found word's start, else
	 * -1, if word does not match array characters
	 * 
	 * @throws NullPointerException if array or word is empty
	 */
	public int stringMatching(char[] array, String word) {
		//case: array equals null
		if(array == null || array.length == 0) {
			throw new NullPointerException("Array is empty.");
		}
		//case: word equals null
		if(word == null) {
			throw new NullPointerException("The given word does not contain any characters.");
		}
		//case: word has more characters than array
		if(array.length < word.length()) {
			return -1;
		}
		//loop through array
		//until array length minus length of searched word, 
		//because word can not be found, when number of letters to go through is not enough
		for(int i = 0; i < array.length - word.length() + 1; i++) {
			//check word 
			for(int j = 0; j < word.length(); j++) {
				//if array at position i + j does not match word at position j
				if(array[i + j] != word.charAt(j)) {
					//break inner loop, go on with i loop
					break;
				} else if(j == word.length() - 1) {
					//if inner loop j reached end of word, return i
					return i;
				}
			}
		}
		return -1;			
	}

	public static void main(String[] args) {

	}
}
