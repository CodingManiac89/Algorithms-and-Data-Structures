package test;

import ds.StackUsingLinkedList;



public class TestStackUsingLinkedList {
	public static void main(String[] args) {
		StackUsingLinkedList<Integer> s = new StackUsingLinkedList<>();
		
		s.push(1);
		s.push(2);
		s.push(3);
		
		s.printStack();
		System.out.println(s.pop());
		System.out.println(s.pop());
		s.printStack();
		s.push(4);
		s.printStack();
		s.pop();
		s.printStack();
		s.pop();
		
	}
}
