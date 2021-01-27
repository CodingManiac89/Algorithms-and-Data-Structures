package stacks;

import java.util.Arrays;

import ds.Stack;

public class StockSpanProblem {
	public static void main(String[] args) {
		int[] arr = {100, 60,70,65, 80, 85};
		int[] res = new int[arr.length];
		Stack<Integer> s = new Stack<>(Integer.class, arr.length);
		for(int i=0;i<arr.length;i++){
			int count=1;
			calculateSpan(s,res,arr[i],i,count);
			s.push(arr[i]);
		}
		
		for(int i:res){
			System.out.println(i);
		}
		
	}
	
	public static void calculateSpan(Stack<Integer> s, int[] result, int ele,int index, int count){
		result[index] = count;
		if(!s.isEmpty() && ele > s.getTop()){
			int old = s.pop();
			count++;
			
			calculateSpan(s, result, ele, index,count);
			s.push(old);
		}
		
	}
	
	
}
