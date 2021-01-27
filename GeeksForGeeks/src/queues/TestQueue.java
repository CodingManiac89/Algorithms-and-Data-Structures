package queues;

import ds.Queue;
import ds.QueueUsingLinkedList;
import ds.Stack;

public class TestQueue {
	public static void main(String[] args) {
		QueueUsingLinkedList<Integer> q = new QueueUsingLinkedList<>();
		q.insert(1);
		q.insert(2);
		q.insert(3);
		
		q.displayQueue();
		
		q.delete();
		q.delete();
		q.displayQueue();
		q.insert(4);
		q.insert(5);
		
		q.displayQueue();
		
	}
}
