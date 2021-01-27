package stacks;
import ds.Stack;


public class SortedInsertInStack {
	public static void main(String[] args) {
		SortedInsertInStack si = new SortedInsertInStack();
		Stack<Integer> s = new Stack<>(Integer.class, 5);
		s.push(30);
		s.push(-5);
		s.push(18);
		s.push(14);
		s.push(-3);
	
		
		System.out.println("Before reversing");
		printStack(s);
		si.sortStack(s);
		System.out.println("After reversing");
		printStack(s);
	}

	private void sortStack(Stack<Integer> s) {
		if(!s.isEmpty()){
			int ele = s.pop();
			sortStack(s);
			insertInSortedOrder(s,ele);
		}
		
	}

	private void insertInSortedOrder(Stack<Integer> s, int ele) {
		if(!s.isEmpty()){
			int old = s.pop();
			
			if(ele > old){
				s.push(old);
				s.push(ele);
				
			}
			else if(old > ele){
				insertInSortedOrder(s, ele);
				s.push(old);
			}
			
			
			
		}
		else{
			s.push(ele);
		}
		
	}

	private static void printStack(Stack<Integer> s) {
		int i = s.getTop();
		while(i>-1){
			System.out.println(s.peek(i));
			i--;
		}
		
	}
}
