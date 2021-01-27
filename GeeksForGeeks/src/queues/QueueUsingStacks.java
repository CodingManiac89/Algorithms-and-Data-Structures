package queues;

import ds.StackUsingLinkedList;
import exceptions.QueueEmptyException;

public class QueueUsingStacks<T extends Comparable<T>> {
	StackUsingLinkedList<T> s1 = new StackUsingLinkedList<>();
	StackUsingLinkedList<T> s2 = new StackUsingLinkedList<>();
	
	
	public void insert(T data){
		s2.push(data);
	}
	
	public T delete(){
		if(s1.isEmpty() && s2.isEmpty()){
			throw new QueueEmptyException();
		}
		makeDeleteComplex();
		s2.printStack();
		T ele = s2.pop();
		s1.push(ele);
		makeDeleteComplex();
		return s1.pop();
	}

	private void makeDeleteComplex() {
		if(!s2.isEmpty()){
			T ele = s2.pop();
			makeDeleteComplex();
			insertInReverse(ele);
		}
		
	}

	private void insertInReverse(T ele) {
		if(!s2.isEmpty()){
			T old = s2.pop();
			insertInReverse(ele);
			s2.push(old);
		}
		else{
			s2.push(ele);
		}
		
	}
}
