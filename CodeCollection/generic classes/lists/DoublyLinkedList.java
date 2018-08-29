package lists;

/**
 * Generic doubly linked list of type <T>.
 * 
 * Each doubly linked list has a first node, the head, and a last node, the tail.
 * Each node is linked to a previous and a next node.
 * 
 * @author veronika franz
 *
 * @param <T> generic type parameter
 */
public class DoublyLinkedList<T> {
	
	private DoublyLinkedListNode<T> head;
	private DoublyLinkedListNode<T> tail;
	
	/**
	 * Create new doubly linked list.
	 * 
	 */
	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	/**
	 * Add a new value to the queue of entries.
	 * 
	 * @param value
	 */
	public void enqueue(T value) {
		DoublyLinkedListNode<T> node = new DoublyLinkedListNode<T>(value, this.tail);
		if(this.tail != null) {
			this.tail.setNext(node);
		}
		this.tail = node;
		if(this.head == null) {
			this.head = node;
		}
	}
	
	/**
	 * Remove the first entry from the queue of entries.
	 * 
	 * @return removed entry
	 */
	public T dequeue() {
		if(this.head == null) {
			return null;
		}
		T value = this.head.getEntry();
		this.head = this.head.getNext();
		return value;
	}

}
