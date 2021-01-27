package stacks;

import ds.DLLNode;

public class MiddleElementOperationsStack<T> {
	private DLLNode<T> dll;
	private DLLNode<T> mid;
	private int count=0;
	
	
	private class DLLNode<T> {
		private DLLNode prev;
		private T data;
		private DLLNode next;
		public DLLNode(DLLNode prev, T data, DLLNode next) {
			this.prev = prev;
			this.data = data;
			this.next = next;
		}
		
		
	}

	
	public void push(T data){
		if(dll == null){
			dll = new DLLNode<>(null,data,null);
			mid = dll;
			count++;
		}
		else{
			DLLNode<T> temp = dll;
			temp.prev = new DLLNode<T>(null, data, temp);
			dll = temp.prev;
			count++;
			
			if(count % 2!=0){
				mid = mid.prev;
			}
		}
	}
	
	public T pop(){
		T data;
		if(dll.next==null && dll.prev==null){
			data = dll.data;
			dll = null;
		}
		else{
			DLLNode temp = dll.next;
			data = dll.data;
			temp.prev =null;
			dll.next = null;
			
			dll = temp;
			count--;
			if(count%2==0 && mid!=null){
				mid = mid.next;
			}
		
		}
		
			return data;
	}
	
	public T getMiddle(){
		return mid.data;
	}
	
	public void deleteMiddle(){
		DLLNode prev = mid.prev;
		DLLNode next = mid.next;
		prev.next = next;
		next.prev = prev;
		mid.prev = null;
		mid.next = null;
		
	}
}
