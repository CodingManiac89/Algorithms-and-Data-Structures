package ds;

public class DLLNode<T> {
	private DLLNode prev;
	private T data;
	private DLLNode next;
	public DLLNode(DLLNode prev, T data, DLLNode next) {
		this.prev = prev;
		this.data = data;
		this.next = next;
	}
	
	
}
