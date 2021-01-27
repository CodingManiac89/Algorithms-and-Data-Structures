package lists;


public class DetectAndRemoveLoopInLinkedList {
	Node head;
	private class Node{
		private int data;
		private Node next;
		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
	
	public void removeLoopNode(){
		Node loopNode = getLoopNode();
		Node temp;
		Node headNode = head;
		while(true){
			temp = loopNode;
			while(temp.next!=headNode && temp.next != loopNode){
				temp = temp.next;
			}
			
			if(temp.next==headNode){
				break;
			}
			headNode = headNode.next;
		}
		temp.next = null;
		
	}
	
	private Node getLoopNode(){
		Node loopNode=null;
		
		Node slow = head.next;
		Node fast = head.next.next;
		while(fast.next!=null){
			if(slow == fast){
				loopNode = fast;
				break;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		return loopNode;
	}
	
	
	public DetectAndRemoveLoopInLinkedList() {
		head = new Node(1, null);
		head.next = new Node(2, null);
		head.next.next = new Node(3, null);
		head.next.next.next = head.next;
	}
}
