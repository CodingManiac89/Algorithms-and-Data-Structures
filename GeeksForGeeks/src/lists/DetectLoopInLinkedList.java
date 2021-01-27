package lists;

public class DetectLoopInLinkedList {
	Node head;
	private class Node{
		private int data;
		private Node next;
		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
	
	public boolean isLoopPresent(){
		boolean isLoopPresent = false;
		
		Node slow = head.next;
		Node fast = head.next.next;
		while(fast.next!=null){
			if(slow == fast){
				System.out.println(slow.data);
				isLoopPresent = true;
				break;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		return isLoopPresent;
	}
	
	
	public DetectLoopInLinkedList() {
		head = new Node(50,null);
	    head.next = new Node(20,null);
	    head.next.next = new Node(15,null);
	    head.next.next.next = new Node(4,null);
	    head.next.next.next.next = new Node(10,null);
	 
	    /* Create a loop for testing */
	    head.next.next.next.next.next = head.next.next;
	}
	
	
	
}
