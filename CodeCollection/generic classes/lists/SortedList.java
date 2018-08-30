package lists;

public class SortedList <E extends Comparable<E>> {
	
	private ListNode<E> head;
	
	public SortedList() {
		this.head = null;
	}
	
	public void add(E entry) {
		this.head = add(this.head, entry);
	}
	
	private ListNode<E> add(ListNode<E> node, E entry){
		//case: is empty
		if(node == null) {
			return new ListNode<E>(entry, node);
		}
		//case: node entry bigger than value
		if(node.getEntry().compareTo(entry) > 0) {
			return new ListNode<E>(entry, node);
		}
		//set next + add recursive
		node.setNext(add(node.getNext(), entry));
		return node;
	}
	
	public void removeEntry(E entry){
		this.head = removeEntry(this.head, entry);
	}
	
	private ListNode<E> removeEntry(ListNode<E> node, E entry){
		//case: list empty
		if(node == null) {
			return null;
		}
		//case: value found
		if(node.getEntry().compareTo(entry) == 0) {
			return node.getNext();
		}
		node.setNext(removeEntry(node.getNext(), entry));
		return node;
	}

	public boolean containsEntry(E entry) {
		return containsValue(this.head, entry);
	}
	
	private boolean containsValue(ListNode<E> node, E entry) {
		//case: empty list
		if(node == null) {
			return false;
		}
		//case: value found
		if(node.getEntry().compareTo(entry) == 0) {
			return true;
		}
		//case: value not found, check next
		return containsValue(node.getNext(), entry);
	}
	
	public int size() {
		return size(this.head);
	}
	
	private int size(ListNode<E> node) {
		int size = 0;
		//case: list empty or last node reached
		if(this.head == null) {
			return size;
		}
		//case: recursive get Next (+ 1 for current node)
		return size(node.getNext()) + 1;		
	}
	
	public void printSortedList() {
		printSortedList(this.head);
	}
	
	private void printSortedList(ListNode<E> node) {
		//case: list is empty
		if(node == null) {
			return;
		}
		//print current node's entry
		node.print();
		//space
		System.out.print(" ");
		//recursive next node
		printSortedList(node.getNext());
	}
	
	public void printSortedListReverse() {
		printSortedListReverse(this.head);
	}
	
	private void printSortedListReverse(ListNode<E> node) {
		//case: list empty
		if(node == null) {
			return;
		}
		//get next recursive (stack)
		printSortedListReverse(node.getNext());
		//print node
		node.print();
		System.out.print(" ");
	}
	
	public boolean isEmpty() {
		return (size() == 0);
	}
	
	public void clear() {
		this.head = null;
	}
}
