package test;

import ds.StackUsingDoublyLinkedList;
import ds.StackUsingLinkedList;

public class TestStackUsingDoublyLinkedList {
	public static void main(String[] args) {
		StackUsingDoublyLinkedList<Integer> s = new StackUsingDoublyLinkedList<>();
		
		s.push(1);
		s.push(2);
		s.push(3);
		
		s.printStack();
		System.out.println(s.pop());
		System.out.println(s.pop());
		s.printStack();
		s.push(4);
		s.printStack();
	}
}
