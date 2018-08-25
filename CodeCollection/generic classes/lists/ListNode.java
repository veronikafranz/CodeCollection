package lists;

public class ListNode<T> {
	private T entry;
	private ListNode<T> next;
	
	public ListNode(T value) {
		this(value, null);
	}
	
	public ListNode(T value, ListNode<T> nextNode) {
		this.setEntry(value);
		this.setNext(nextNode);
	}
	
	public void setEntry(T value) {
		this.entry = value;
	}

	public void setNext(ListNode<T> nextNode) {
		this.next = nextNode;
	}
	
	public T getEntry() {
		return this.entry;
	}
	
	public ListNode<T> getNext() {
		return this.next;
	}
	
}
