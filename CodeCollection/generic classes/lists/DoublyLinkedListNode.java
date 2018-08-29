package lists;

/**
 * Doubly linked list node of type <T> for generic doubly linked lists. 
 * In Doubly linked lists an entry of type <T> is specified for each node.
 * Furthermore a previous and a next node, which each node is linked to, is specified.
 *   
 * @author veron
 *
 * @param <T> generic type parameter
 */
public class DoublyLinkedListNode<T> {
	private T entry;
	private DoublyLinkedListNode<T> next;
	private DoublyLinkedListNode<T> prev;
	
	/**
	 * Create new list node with specified entry and previous node.
	 * 
	 * @param entry
	 * @param prevNode
	 */
	DoublyLinkedListNode(T entry, DoublyLinkedListNode<T> prevNode) {
		this.entry = entry;
		this.prev = prevNode;
		this.next = null;
	}
	
	/**
	 * Set next node of current list node.
	 * 
	 * @param nextNode
	 */
	public void setNext(DoublyLinkedListNode<T> nextNode) {
		this.next = nextNode;
	}
	
	/**
	 * Set prevoius node of current list node.
	 * 
	 * @param prevNode
	 */
	public void setPrev(DoublyLinkedListNode<T> prevNode) {
		this.prev = prevNode;
	}
	
	/**
	 * Returns entry of current node.
	 * 
	 * @return entry
	 */
	T getEntry() {
		return this.entry;
	}
	
	/**
	 * Returns next node of current node.
	 * 
	 * @return next node
	 */
	DoublyLinkedListNode<T> getNext() {
		return this.next;
	}
	
	/**
	 * Returns previous node of current node.
	 * 
	 * @return previous node
	 */
	DoublyLinkedListNode<T> getPrevNode() {
		return this.prev;
	}
}
