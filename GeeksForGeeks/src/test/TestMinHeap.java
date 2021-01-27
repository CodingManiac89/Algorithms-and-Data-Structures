package test;

import ds.MinHeap;

public class TestMinHeap {
	
	public static void main(String[] args) {
		MinHeap mh = new MinHeap(4);
		mh.insert(4);
		mh.insert(3);
		mh.insert(2);
		mh.insert(1);
		
		mh.displayHeap();
	}
}
