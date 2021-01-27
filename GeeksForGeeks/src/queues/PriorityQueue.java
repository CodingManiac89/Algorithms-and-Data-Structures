package queues;

import exceptions.QueueEmptyException;

public class PriorityQueue<T> {
	private Node queueHeader;
	
	private class Node{
		private T data;
		private int priority;
		private Node next;
		private Node prev;
		public Node(PriorityQueue<T>.Node prev, T data, int priority,
				PriorityQueue<T>.Node next) {
			super();
			this.prev = prev;
			this.data = data;
			this.priority = priority;
			this.next = next;
		}
		
		
	}
	
	public void insert(T data,int priority){
		if(queueHeader == null){
			queueHeader = new Node(null, data, priority, null);
		}
		else{
			while(priority < queueHeader.priority  && queueHeader!=null){
				PriorityQueue<T>.Node node = deletePriority();
				insert(node.data,node.priority);
			}
			
			Node head2 = queueHeader;
			while(head2.next!=null){
				head2 = head2.next;
			}
			head2.next = new Node(head2, data, priority, null);
		}
	}
	
	public T delete(){
		if(queueHeader==null){
			throw new QueueEmptyException();
		}
		Node temp = queueHeader.next;
		T data = queueHeader.data;
		temp.prev = null;
		queueHeader.next = null;
		queueHeader = temp;
		return data;
	}
	
	private PriorityQueue<T>.Node deletePriority(){
		if(queueHeader==null){
			throw new QueueEmptyException();
		}
		Node deletedNode = queueHeader;
		Node temp = queueHeader.next;
		if(temp!=null){
			int priority = queueHeader.priority;
			temp.prev = null;
			queueHeader.next = null;
			queueHeader = temp;
		}

		return deletedNode;
	}
	
	
}
