package ds;

import ds.LinkedListImpl;

public class StackUsingLinkedList<T extends Comparable<T>> {
	private LinkedListImpl<T> list;
	
	public StackUsingLinkedList() {
		list = new LinkedListImpl<>();
	}
	
	public void push(T ele){
		list.addFirst(ele);
	}
	
	public T pop(){
		return list.pop();
	}
	
	public T getTop(){
		return list.getElementAtIndex(0);
	}
	
	public boolean isEmpty(){
		return list.isEmpty();
	}
	
	
	public void printStack() {
		list.displayLinkedList();
	}
}
