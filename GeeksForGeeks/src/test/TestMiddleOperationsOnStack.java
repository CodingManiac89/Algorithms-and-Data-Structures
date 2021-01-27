package test;

import stacks.MiddleElementOperationsStack;

public class TestMiddleOperationsOnStack {
	public static void main(String[] args) {
		MiddleElementOperationsStack<Integer> ms = new MiddleElementOperationsStack<>();
		ms.push(11);
		ms.push(22);
		ms.push(33);
		ms.push(44);
		ms.push(55);
		ms.push(66);
		ms.push(77);
		ms.pop();
		ms.pop();
		System.out.println(ms.getMiddle());
		ms.deleteMiddle();
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		
	}
}
