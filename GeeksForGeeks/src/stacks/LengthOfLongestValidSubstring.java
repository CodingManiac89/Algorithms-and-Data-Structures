package stacks;

import ds.Stack;

public class LengthOfLongestValidSubstring {
	public int getLengthOfLongestValidParanthesis(char[] str){
		Stack<Character> sc = new Stack<>(Character.class, str.length);
		int count=0;
		for(char c:str){
			if(sc.isEmpty()){
				sc.push(c);
			}
			else if(c==')'){
				char pc = sc.pop();
				if(pc!='('){
					break;
				}
				else{
					count+=2;
				}
			}
			else{
				sc.push(c);
			}
			
			
		}
		
		return count;
	}
}
