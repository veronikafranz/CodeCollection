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
		
		if(node == null) {
			return new ListNode<E>(value, node);
		}
		
		if(node.getEntry().compareTo(value) > 0) {
			return new ListNode<E>(value, node);
		}
		node.setNext(add(node.getNext(), value));
		return node;
	}

}
