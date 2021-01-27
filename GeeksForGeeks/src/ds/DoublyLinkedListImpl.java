package ds;

import com.siddu.constants.PrintOrder;

public class DoublyLinkedListImpl<Type extends Comparable<Type>>{
	private Node node;
	private PrintOrder order;
	private Node tail;
	private int count;
	public DoublyLinkedListImpl(PrintOrder order) {
		this.order = order;
	}


	private class Node{
		private Type data;
		private Node next;
		private Node prev;

		public Node(Node prev, Type data,Node next) {
			this.prev = prev;
			this.data = data;
			this.next = next;
		}

		@Override
		public String toString() {
			return "Node [prev=" + prev + ", data=" + data + ", next=" + next
					+ "]";
		}
		
		



	}

	public void add(Type data) {
		Node head = getNode();
		if(head == null){
			head = new Node(null, data, null);
			setNode(head);
			setTail(head);
		}

		else{
			Node head2 = head;
			while(head2.next!=null){
				head2 = head2.next;
			}
			head2.next = new Node(head2, data, null);
			setTail(head2.next);
		}
	}
	
	public void addFront(Type data){
		Node head = getNode();
		if(head == null){
			add(data);
		}
		else{
			head.prev = new Node(null, data, head);
			setNode(head.prev);
		}
		
	}
	
	public Type pop(){
		Node head = getNode();
		Type data = head.data;
		Node next = head.next;
		next.prev = null;
		head.next = null;
		setNode(next);
		return data;
	}

	public Node getNode() {
		return node;
	}

	private void setNode(Node node) {
		this.node = node;
	}

	private Node getTail() {
		return tail;
	}

	private void setTail(Node tail) {
		this.tail = tail;
	}

	public void displayList(){
		Node temp=node;
		Node end = tail;
		if(order == PrintOrder.FORWARD){
			while(temp!=null){
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
		
		else{
			while(end!=null){
				System.out.println(end.data);
				end = end.prev;
			}
		}
	}


}
