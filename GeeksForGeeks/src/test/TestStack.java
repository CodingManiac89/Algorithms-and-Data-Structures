package test;

import ds.Stack;

public class TestStack {
	
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>(Integer.class,3);
		s.push(1);
		s.push(2);
		s.push(3);
		
		System.out.println(s.pop());
		s.push(4);
		System.out.println(s);
	}
	
	
	
}
