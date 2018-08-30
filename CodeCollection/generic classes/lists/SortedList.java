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
	
	//TODO size()
	
	//TODO isEmpty()
	
	//TODO clear()
	
	//TODO removeValue

}
