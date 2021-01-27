package test;

import queues.QueueUsingStacks;

public class TestQueueUsingStack {
	public static void main(String[] args) {
		QueueUsingStacks<Integer> q = new QueueUsingStacks<>();
		q.insert(1);
		System.out.println(q.delete());
		q.insert(2);
		q.insert(3);
		System.out.println(q.delete());
		System.out.println(q.delete());
		q.insert(4);
		q.insert(5);
		q.insert(6);
		System.out.println(q.delete());
		System.out.println(q.delete());
		q.insert(7);
		q.insert(8);
		System.out.println(q.delete());
		System.out.println(q.delete());
		System.out.println(q.delete());
	}
}
