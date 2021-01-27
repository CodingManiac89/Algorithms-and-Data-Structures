package ds;

import java.lang.reflect.Array;

import exceptions.QueueEmptyException;
import exceptions.QueueOverflowException;

public class Queue<T> {
	private T[] arr;
	private int front=-1;
	private int rear = -1;
	
	@SuppressWarnings("unchecked")
	public Queue(Class type,int size) {
		arr = (T[]) Array.newInstance(type, size);
	}
	
	public void insert(T ele){
		if(front>rear){
			throw new QueueOverflowException();
		}
		else if(rear == arr.length-1){
			rear = 0;
			arr[rear]=ele;
		}
		else{
			rear++;
			arr[rear] = ele;
		}
		
	}
	
	public T delete(){
		if(front == rear){
			throw new QueueEmptyException();
		}
		front++;
		T ele = arr[front];
		
		return ele;
	}
	
	public T peek(int index){
		return arr[index];
	}
	
	public void resetQueue(){
		front=-1;
	}
	
	public boolean isEmpty(){
		return front == rear;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		while(front != rear){
			sb.append(" ");
			sb.append(this.delete());
			sb.append(" ");
		}
		this.resetQueue();
		return sb.toString();
	}
	
}
