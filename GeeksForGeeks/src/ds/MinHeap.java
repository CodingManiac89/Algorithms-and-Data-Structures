package ds;

import java.util.Arrays;

import exceptions.HeapFullException;

public class MinHeap {
	private int[] heap;
	private int capacity;
	private int heapSize = 0;
	public MinHeap(int capacity) {
		this.capacity = capacity;
		heap = new int[capacity];
		Arrays.fill(heap,-1);
	}
	
	public void insert(int key){
		if(heapSize == capacity){
			throw new HeapFullException();
		}
		heapSize++;
		int i = heapSize-1;
		heap[i] = key;
		while(i!=0 && key < heap[getParent(i)]){
			swap(i,getParent(i));
			i = getParent(i);
		}
	}
	
	private void swap(int i, int parent) {
		int temp = heap[i];
		heap[i] = heap[parent];
		heap[parent] = temp;
		
	}

	public int getParent(int childIndex){
		return (childIndex-1)/2;
	}
	
	public int getLChild(int parentIndex){
		return 2*parentIndex+1;
	}
	
	public int getRChild(int parentIndex){
		return 2*parentIndex+2;
	}
	
	public void displayHeap(){
		int parent=0;
		if(getLChild(parent) < heapSize){
			System.out.println(heap[getLChild(parent)]);
		}
		System.out.println(heap[getRChild(parent)]);
		parent++;
	}
}
