package test;

import queues.PriorityQueue;

public class TestPriorityQueue {
	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.insert("Job1", 3);
		pq.insert("Job2", 2);
		pq.insert("Job3", 1);
		
		System.out.println(pq.delete());
	}
}
