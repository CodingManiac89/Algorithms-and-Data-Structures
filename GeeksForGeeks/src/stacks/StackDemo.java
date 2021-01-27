package stacks;
import ds.Stack;


public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>(Integer.class, 5);
		s.push(5);
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);
		
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
}
