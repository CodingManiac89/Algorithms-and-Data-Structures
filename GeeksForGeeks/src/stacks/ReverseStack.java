package stacks;
import ds.Stack;


public class ReverseStack {
	public static void main(String[] args) {
		ReverseStack rs = new ReverseStack();
		Stack<Integer> s = new Stack<>(Integer.class, 4);
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);
		System.out.println("Before reversing");
		printStack(s);
		rs.reverseStack(s);
		System.out.println("After reversing");
		printStack(s);
	}

	private void reverseStack(Stack<Integer> s) {
		if(!s.isEmpty()){
			int ele = s.pop();
			reverseStack(s);
			insertEle(s,ele);
		}
		
		
		
		
	}

private void insertEle(Stack<Integer> s, int ele) {
	if(!s.isEmpty()){
		int old = s.pop();
		insertEle(s, ele);
		s.push(old);
	}
	else{
		s.push(ele);
	}
	
}

private static void printStack(Stack<Integer> s){
	int i=s.getTop();
	while(i>-1){
		System.out.println(s.peek(i));
		i--;
	}
	
 }
}
