
public class DoublySorted {
	static class Node{
		int data;
		Node prev;
		Node next;
		@Override
		public String toString() {
			return "Node [data=" + data + ", prev=" + prev + ", next=" + next
					+ "]";
		}
		
		
	}
	
	
	
	Node SortedInsert(Node head,int data) {
		  Node temp = head;
		  if(data < temp.data){
		      temp.prev = new Node();
		      temp.prev.data = data;
		      temp.prev.prev = null;
		      temp.prev.next = temp;
		      head = temp.prev;
		      
		  }
		    
		  else{
		      while(temp!=null && data > temp.data){
		          temp = temp.next;
		      }
		      Node cur = temp.prev;
		      temp.prev = new Node();
		      temp.prev.data = data;
		      temp.prev.prev = cur;
		      cur.next = temp.prev;
		      temp.prev.next = temp;
		      
		  }
		  return head;
		}
	
	public static void main(String[] args) {
		Node head = new Node();
		head.prev = null;
		head.data=1;
		head.next = new Node();
		head.next.data = 3;
		head.next.prev = head;
		
		DoublySorted ds = new DoublySorted();
		System.out.println(ds.SortedInsert(head, 2));
	}
}
