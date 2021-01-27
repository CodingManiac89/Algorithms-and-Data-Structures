package ds;

import java.lang.reflect.Array;

public class Stack<T> {
	private T[] arr;
	private int top=-1;
	
	@SuppressWarnings("unchecked")
	public Stack(Class type, int size) {
		arr = (T[]) Array.newInstance(type, size);
	}
	
	public void push(T ele){
		if(top == arr.length-1){
			System.out.println("Stack overflow");
		}
		else{
			top++;
			arr[top]= ele;
		}
	}
	
	public T pop(){
		T ele = null;
		if(top==-1){
			System.out.println("Stack empty");
		}
		else{
			ele = arr[top];
			top--;
		}
		return ele;
	}
	
	public T getTopElement(){
		return arr[top];
	}
	
	public boolean isEmpty(){
		return top==-1;
	}
	
	public boolean isFull(){
		return top == arr.length-1;
	}
	
	public void resetTop(){
		top = arr.length-1;
	}
	
	public T getTop(){
		return arr[top];
	}
	
	public T getTopEle(){
		return peek(top);
	}
	
	public T peek(int pos){
		return arr[pos];
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		int i=top;
		while(i>-1){
			sb.append(" ");
			sb.append(arr[i]);
			sb.append(" ");
			i--;
		}
		return sb.toString();
	}
}
