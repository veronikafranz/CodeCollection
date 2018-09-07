package algorithm;

public class StringOperations {
	
	//TODO test
	public int stringMatching(char[] array, String word) {
		
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
