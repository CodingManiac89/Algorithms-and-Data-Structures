package stacks;

import ds.QueueUsingLinkedList;
import ds.StackUsingLinkedList;
import exceptions.StackEmptyException;

public class StackUsingQueue<T extends Comparable<T>> extends StackUsingLinkedList<T>{
	private QueueUsingLinkedList<T> q1;
	private QueueUsingLinkedList<T> q2;
	public StackUsingQueue() {
		q1 = new QueueUsingLinkedList<>();
		q2 = new QueueUsingLinkedList<>();
	}

	public void push(T ele){
		q2.insert(ele);
	}

	public T pop(){
		if(q1.isEmpty() && q2.isEmpty()){
			throw new StackEmptyException();
		}
		
		makePopExpensive();
		T ele = q2.delete();
		q1.insert(ele);
		makePopExpensive();
		return q1.delete();

	}

	private void makePopExpensive() {
		if(!q2.isEmpty()){
			T old = q2.delete();
			makePopExpensive();
			q2.insert(old);
		}
		
	}

}
