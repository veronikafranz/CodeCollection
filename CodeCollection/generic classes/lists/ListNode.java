package lists;


/**
 * List node for generic lists of type T.
 * 
 * @author veron
 *
 * @param <T>
 */
public class ListNode<T> {
	private T entry;
	private ListNode<T> next;
	
	/**
	 * Create a new generic list node specifying the corresponding value.
	 *
	 * @param value
	 */
	public ListNode(T value) {
		this(value, null);
	}
	
	/**
	 * Create a new generic list node 
	 * specifying the corresponding value and the next node.
	 * 
	 * @param value
	 * @param nextNode
	 */
	public ListNode(T value, ListNode<T> nextNode) {
		this.setEntry(value);
		this.setNext(nextNode);
	}
	
	/**
	 * Specifying the value of the current node.
	 * 
	 * @param value of the list node
	 */
	public void setEntry(T value) {
		this.entry = value;
	}

	/**
	 * Specifying the next node of the current node.
	 * 
	 * @param nextNode
	 */
	public void setNext(ListNode<T> nextNode) {
		this.next = nextNode;
	}
	
	/**
	 * Returns the entry of the current node.
	 * 
	 * @return entry
	 */
	public T getEntry() {
		return this.entry;
	}
	
	/**
	 * Returns the next node of the current node.
	 * 
	 * @return next node
	 */
	public ListNode<T> getNext() {
		return this.next;
	}
	
	/**
	 * Printing the entry of the current node.
	 * 
	 */
	public void print() {
		System.out.println(this.getEntry());
	}
	
}
