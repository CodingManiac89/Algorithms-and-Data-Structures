package stacks;
import ds.Stack;


public class SortStack {
	public static void main(String[] args) { 
		int[]  arr = {5,3,4,2,1};
		Stack<Integer> s = new Stack<>(Integer.class, 5);
		s.push(arr[0]);
		
		for(int i:arr){
			int ele = s.pop();
			if(i<ele){
				s.push(i);
				
			}
			else{
				s.push(ele);
			}
			
		}
		
		while(!s.isEmpty()){
			System.out.println(s.pop());
		}
		
	}
}
