package ds;

public class QueueUsingLinkedList<T extends Comparable<T>> {
	private LinkedListImpl<T> list;
	
	public QueueUsingLinkedList() {
		list = new LinkedListImpl<>();
	}
	
	public void insert(T ele){
		list.add(ele);
	}
	
	public T delete(){
		return list.pop();
	}
	
	public boolean isEmpty(){
		return list.isEmpty();
	}
	
	public T peek(){
		return list.peek();
	}
	
	
	public void displayQueue(){
		list.displayLinkedList();
	}
}
