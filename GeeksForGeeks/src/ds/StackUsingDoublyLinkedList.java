package ds;

import com.siddu.constants.PrintOrder;

public class StackUsingDoublyLinkedList<Type extends Comparable<Type>> {
	private DoublyLinkedListImpl<Type> dll;
	public StackUsingDoublyLinkedList() {
		dll = new DoublyLinkedListImpl<>(PrintOrder.FORWARD);
	}
	
	public void push(Type data) {
		dll.addFront(data);
	}
	
	public Type pop(){
		return dll.pop();
	}
	
	public void printStack(){
		dll.displayList();
	}
	
	public boolean isEmpty(){
		return dll == null;
	}
}
