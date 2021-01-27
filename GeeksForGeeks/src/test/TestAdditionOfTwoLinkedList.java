package test;

import ds.LinkedListImpl;
import lists.AdditionOfTwoLinkedLists;

public class TestAdditionOfTwoLinkedList {
	public static void main(String[] args) {
		AdditionOfTwoLinkedLists al = new AdditionOfTwoLinkedLists();
		LinkedListImpl<Integer> l1 = new LinkedListImpl<>();
		l1.add(9);
		l1.add(9);
		l1.add(9);
		
		LinkedListImpl<Integer> l2 = new LinkedListImpl<>();
		l2.add(9);
		l2.add(9);
		l2.add(9);
		
		al.add(l1, l2);
		al.summedLinkedList.displayLinkedList();
	}
}
