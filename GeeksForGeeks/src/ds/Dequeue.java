package ds;

public class Dequeue<T> {
	private DLLNode<T> head;
	private DLLNode<T> tail;
	private class DLLNode<T>{
		private DLLNode prev;
		private T data;
		private DLLNode next;
		
	}
}
