package stacks;

import ds.Stack;
import ds.StackUsingLinkedList;

public class TowersOfHanoiii {
	
	public static void main(String[] args) {
		StackUsingLinkedList<Integer> tower1 = new StackUsingLinkedList<>();
		StackUsingLinkedList<Integer> tower2 = new StackUsingLinkedList<>();
		StackUsingLinkedList<Integer> tower3 = new StackUsingLinkedList<>();
		
		tower1.push(11);
		tower1.push(10);
		tower1.push(9);
		tower1.push(8);
		tower1.push(7);
		tower1.push(6);
		tower1.push(4);
		tower1.push(3);
		tower1.push(2);
		tower1.push(1);
		
		moveToTowers(tower1,tower2,tower3);
		
		tower1.printStack();
		tower3.printStack();
	}

	private static void moveToTowers(StackUsingLinkedList<Integer> tower1,
			StackUsingLinkedList<Integer> tower2,
			StackUsingLinkedList<Integer> tower3) {
		
		tower3.push(tower1.pop());
		while(!tower1.isEmpty()){
			tower2.push(tower1.pop());
		}
		
		tower1.push(tower3.pop());
		
		while(!tower2.isEmpty()){
			tower3.push(tower2.pop());
		}
		
		tower3.push(tower1.pop());
	}
}
