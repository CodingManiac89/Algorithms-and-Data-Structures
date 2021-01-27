package test;

import ds.MinStack;
import ds.Stack;

public class TestMinStack {
	public static void main(String[] args) {
		MinStack<Integer> ms = new MinStack<>(Integer.class, 4);
		ms.push(10);
		ms.push(20);
		ms.push(30);
		System.out.println(ms.getMin());
		ms.push(5);
		System.out.println(ms.getMin());
		ms.pop();
		System.out.println(ms.getMin());
	}
	
}
