package exceptions;

public class HeapFullException extends RuntimeException {
	public HeapFullException() {
		super("Heap is full");
	}
}
