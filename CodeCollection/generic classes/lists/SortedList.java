package lists;

public class SortedList <E extends Comparable<E>> {
	
	private ListNode<E> head;
	
	public SortedList() {
		this.head = null;
	}
	
	public void add(E value) {
		this.head = add(this.head, value);
	}
	
	private ListNode<E> add(ListNode<E> node, E value){
		//case: is empty
		if(node == null) {
			return new ListNode<E>(value, node);
		}
		//case: node entry bigger than value
		if(node.getEntry().compareTo(value) > 0) {
			return new ListNode<E>(value, node);
		}
		//set next + add recursive
		node.setNext(add(node.getNext(), value));
		return node;
	}
	
	public boolean containsValue(E value) {
		return containsValue(this.head, value);
	}
	
	private boolean containsValue(ListNode<E> node, E value) {
		//case: empty list
		if(node == null) {
			return false;
		}
		//case: value found
		if(node.getEntry().compareTo(value) == 0) {
			return true;
		}
		//case: value not found, check next
		return containsValue(node.getNext(), value);
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
	
	public boolean isEmpty() {
		
		return (size() == 0);
	}
	
	public void clear() {
		this.head = null;
	}
	
	//TODO removeValue

}
