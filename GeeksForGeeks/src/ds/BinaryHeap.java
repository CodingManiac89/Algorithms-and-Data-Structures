package ds;

public class BinaryHeap {
	private int[] heap;
	private int heapPtr=0;
	
	public BinaryHeap(int size) {
		this.heap = new int[size];
	}
	
	
	private int getLChildIndex(int parentIndex){
		return (2*parentIndex)+1;
	}
	
	private int getRChildIndex(int parentIndex){
		return (2*parentIndex)+2;
	}
	
	private int getParent(int childIndex){
		return heap[childIndex/2];
	}
	
	public void insertKey(int k){
		int ptr = heapPtr;
		heap[ptr]=k;
		ptr++;
		int parent = getParent(heapPtr);
		if(parent>k && heapPtr!=0){
			swap(parent,k);
		}
	}

	private void swap(int parent, int k) {
		int temp = parent;
		parent = k;
		k=temp;
		
	}
	
	private void minHeapify(){
		for(int i=0;i<heap.length;i++){
			if(getLChildIndex(i)>= heap.length || getRChildIndex(i)>=heap.length){
				break;
			}
			if(heap[i] > heap[getLChildIndex(i)] ){
				swap(heap[i],heap[getLChildIndex(i)]);
			}
			if(heap[i] > heap[getRChildIndex(i)]){
				swap(heap[i],heap[getRChildIndex(i)]);
			}
		}
	}
	
	public int getMin(){
		minHeapify();
		return heap[0];
	}
}
