package test;

import ds.BinaryHeap;

public class TestBinaryHeap {
	public static void main(String[] args) {
		BinaryHeap bh = new BinaryHeap(5);
		bh.insertKey(5);
		bh.insertKey(2);
		bh.insertKey(1);
		bh.insertKey(4);
		bh.insertKey(3);
		System.out.println(bh.getMin());
	}
	
}
