package test;

import java.util.PriorityQueue;

import stacks.StackUsingQueue;
import ds.Queue;

public class TestStackUsingQueues {
	public static void main(String[] args) {
		StackUsingQueue<Integer> q = new StackUsingQueue<>();
		q.push(1);
		q.push(2);
		q.push(3);
		q.push(4);
		q.push(5);
		q.push(6);
		q.push(7);
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());

	}


}
