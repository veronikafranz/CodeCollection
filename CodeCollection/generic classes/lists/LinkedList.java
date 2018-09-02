package lists;

/**
 * @author veron
 *
 * @param <T>
 */
public class LinkedList<T extends Comparable<T>> {
	private ListNode<T> head;
	
	private static String ASC = "ascending";
	private static String DESC = "descending";
	
	/**
	 * Create new Linked List.
	 * 
	 */
	public LinkedList() {
		this.head = null;
	}
	
	/**
	 * Add new value to the Linked List.
	 * 
	 * @param value
	 */
	public void add(T value) {
		ListNode<T> newNode = new ListNode<T>(value, this.head);
		this.head = newNode;
	}
	
	/**
	 * Add new value to the Linked List at a specified index.
	 * 
	 * @param index
	 * @param value
	 */
	public void addAtIndex(int index, T value) {
		//case: index does not exist
		if(index < 0 || index > size()) {
			throw new IndexOutOfBoundsException("Index should be " 
					+ ">= 0 and < " + size() + ".");
		}
		//add value to this list at specified index
		this.head = addAtIndex(this.head, index, value);
	}
	
	
	private ListNode<T> addAtIndex(ListNode<T> node, int steps, T value) {
		//insertion point reached
		if(steps == 0) {
			//create new node with specified value
			return new ListNode<T>(value, node);
		}
		//the result of each recursive add (getNext node (steps-1)-times)
		//is a sublist, which is connected to the node,
		//which directed to the initial sublist (concatenation previous with new node)
		node.setNext(addAtIndex(node.getNext(), steps - 1, value));
		return node;
	}
	
	/**
	 * Returns the entry of the first node of the list.
	 * 
	 * @return entry of first node,
	 * null if list is empty
	 */
	public T getFirstEntry() {
		if(size() == 0) {
			return null;
		}
		return this.head.getEntry();
	}
	
	/**
	 * Returns the entry of the node at a specified index.
	 * 
	 * @param index
	 * @return entry
	 */
	public T getEntryAtIndexIterativ(int index) {
		//case: index does not exist
		if(index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException("Index should be " 
					+ ">= 0 and < " + size() + ".");
		}
		ListNode<T> current = this.head;
		//< (not <=), because index starts at 0 (e. g. 5. element is located at index 4)
		for(int i = 0; i < index; i++) {
				current = current.getNext();
		}
		return current.getEntry();
	}
	
	/**
	 * Set the entry of a ListNode located at a specified index.
	 * 
	 * @param index
	 * @param entry
	 */
	public void setEntryAtIndexIterativ(int index, T entry) {
		//case: index does not exist
		if(index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException("Index shoulb be "
					+ "<= 0 and < " + size() + ".");
		}//start at first node (head of list)
		ListNode<T> current = this.head;
		for(int i = 0; i < index; i++) {
			//go to index
			current = current.getNext();
		}
		//set entry
		current.setEntry(entry);
		
	}
	
	/**
	 * Returns the entry of the node at a specified index.
	 * 
	 * @param index
	 * @return entry
	 */
	public T getEntryAtIndexRekursiv(int index) {
		//case: index does not exist
		if(index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException("Index should be " 
					+ ">= 0 and < " + size() + ".");
		}
		return getEntryAtIndexRekursiv(index, this.head).getEntry();
	}
	
	private ListNode<T> getEntryAtIndexRekursiv(int index, ListNode<T> node) {
		//case: index found
		if(index == 0) {
			return node;
		}
		//recursive getNext node
		return getEntryAtIndexRekursiv(index - 1, node.getNext());
	}
	
	
	/**
	 * Specifies whether the list contains a specified value.
	 * 
	 * @param value
	 * @return true, if list contains the value, else false
	 */
	public boolean containsRekursiv(T value) {
		return containsRekursiv(value, this.head);
	}
	
	private boolean containsRekursiv(T value, ListNode<T> node) {
		//case: list is empty or no value
		if(node == null) {
			return false;
		}
		//case: value found
		if(node.getEntry() == value) {
			return true;
		}
		//recursive getNext node
		return containsRekursiv(value, node.getNext());
		
	}
	
	/**
	 * Removes a specified value from the list
	 * 
	 * @param value
	 */
	public void removeRekursiv(T value) {
		this.head = removeRekursiv(this.head, value);
	}
	
	private ListNode<T> removeRekursiv(ListNode<T> node, T value) {
		//case: list empty or no fitting node
		if(node == null) {
			return null;
		}
		//case: value found
		if(node.getEntry() == value) {
			return node.getNext();
		}
		node.setNext(removeRekursiv(node.getNext(), value));
		return node;
	}
	
	/**
	 * Returns the size of the list.
	 * 
	 * @return size
	 */
	public int size() {
		ListNode<T> current = this.head;
		int count = 0;
		while(current != null) {
			count++;
			current = current.getNext();
		}
		return count;
	}
	
	/**
	 * Returns the size of the list.
	 * 
	 * @return size
	 */
	public int sizeIterativ() {
		int count = 0;
		for(ListNode<T> current = this.head; current != null; current = current.getNext()) {
			count++;
		}
		return count;
	}
	
	/**
	 * Returns the size of the list.
	 * 
	 * @return size
	 */
	public int sizeRekursiv() {
		return sizeRekursiv(this.head);
	}
	
	private int sizeRekursiv(ListNode<T> node) {
		//case: node == null
		if(node == null) {
			return 0;
		}
		//recursive calculation of size
		return sizeRekursiv(node.getNext()) + 1;
	}
	
	
	/**
	 * Create a sublist of current list.
	 * 
	 * @param fromIndex
	 * @param toIndex
	 * @return sublist
	 */
	public LinkedList<T> subList(int fromIndex, int toIndex) {
		if(this.size() < toIndex 
				|| fromIndex < 0 
				|| toIndex < fromIndex
				|| toIndex > this.size()) {
			return null;
		}
		LinkedList<T> list = new LinkedList<T>();
		list.head = subList(this.head, fromIndex, toIndex - fromIndex);
		return list;
	}
	
	private ListNode<T> subList(ListNode<T> node, int steps, int size) {
		if(size == 0) {
			return null;
		}
		if(steps == 0) {
			ListNode<T> subListNode = new ListNode<T>(node.getEntry());
			subListNode.setNext(subList(node.getNext(), 0, size - 1));
			return subListNode;
		}
		return subList(node.getNext(), steps - 1, size);
	}
	
	/**
	 * Print this list (output console)
	 * 
	 */
	public void printList() {
		printList(this.head);
	}
	
	private void printList(ListNode<T> node) {
		//case: list is empty
		if(node == null) {
			return;
		}
		//print node
		node.print();
		//print space
		System.out.print(" ");
		//recursive getNext node
		printList(node.getNext());
	}
	
	
	/**
	 *Print reverse list (output: console) 
	 */
	public void printReverseList() {
		printReverseList(this.head);
	}
	
	private void printReverseList(ListNode<T> node) {
		//case: list is empty
		if(node == null) {
			return;
		}
		//recursive getNext node till last node
		printReverseList(node.getNext());
		//print nodes from stack last node -> first node
		node.print();
		//print space
		System.out.print(" ");
	}

	/**
	 * Specifies whether list is empty.
	 * 
	 * @return true, if list is empty, else false
	 */
	public boolean isEmpty() {
		return (size() == 0);
	}

	/**
	 * Empties the list.
	 * 
	 */
	public void clear() {
		this.head = null;
	}
	
	// START sorting algorithms

	/**
	 * Sorts list according to parameter either ascending or descending.
	 * 
	 * @param arg ASC for sorting ascending,
	 * else DESC for sorting descending
	 */
	public void bubblesort(String arg) {
		if(arg.equals(ASC)) {
			this.bubblesort(1);
		}
		if(arg.equals(DESC)) {
			this.bubblesort(-1);
		}
	}

	private void bubblesort(int value) {
		//case: list empty
		if(this.size() == 0) {
			return;
		}
		//sort
		for(int i = 0; i < this.size(); i++) {
			//assumption: list is sorted = true
			boolean sorted = true;
			
			for(int j = 0; j < this.size() - 1 - i; j++) {
				//sort ascending
				if(value == 1) {
					//if value(j) is larger than value(j+1) switch
					if(this.getEntryAtIndexIterativ(j).compareTo(this.getEntryAtIndexIterativ(j+1)) > 0) {
						//switch entries
						T temp = this.getEntryAtIndexIterativ(j);
						this.setEntryAtIndexIterativ(j, this.getEntryAtIndexIterativ((j+1)));
						this.setEntryAtIndexIterativ((j+1), temp);
					}
					//sort descending
				} else if(value == -1) {
					//if value(j) is smaller than value(j+1) switch
					if(this.getEntryAtIndexIterativ(j).compareTo(this.getEntryAtIndexIterativ(j+1)) < 0) {
						//switch entries
						T temp = this.getEntryAtIndexIterativ(j);
						this.setEntryAtIndexIterativ(j, this.getEntryAtIndexIterativ((j+1)));
						this.setEntryAtIndexIterativ((j+1), temp);
					}
				}
			}
			if(sorted) {
				//no changes necessary
				break;
			}
		}
	}

	/**
	 * Sort the current list
	 * 
	 * @return sorted list
	 */
	public LinkedList<T> mergeSort() {
		int length = this.size();
		if(length <= 1) {
			return this;
		}
		LinkedList<T> leftSorted 
			= this.subList(0, length / 2).mergeSort();
		LinkedList<T> rightSorted 
			= this.subList(length / 2, length).mergeSort();
		leftSorted.mergeWith(rightSorted);
		return leftSorted;
	}

	private void mergeWith(LinkedList<T> otherList) {
		//case: list is empty
		if(otherList.isEmpty()) {
			return;
		}
		if(this.isEmpty()) {
			this.head = otherList.head;
			return;
		}
	
		if(otherList.head.getEntry().compareTo(this.head.getEntry()) <= 0) {
			T first = otherList.removeFirst();
			this.mergeWith(otherList);
			this.add(first);
			return;
		}
		T first = this.removeFirst();
		otherList.mergeWith(this);
		otherList.add(first);
		this.head = otherList.head;
	}

	private T removeFirst() {
		if(this.head == null) {
			throw new IndexOutOfBoundsException("empty list");
		}
		T first = this.head.getEntry();
		this.head = this.head.getNext();
		return first;
	}
	
	
}
