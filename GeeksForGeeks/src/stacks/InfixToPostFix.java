package stacks;

import ds.Stack;

public class InfixToPostFix {
	public String infixToPostFix(String expr){
		Stack<Character> s = new Stack<>(Character.class, expr.length());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<expr.length();i++){
			if(isOperator(expr.charAt(i))){
				s.push(expr.charAt(i));
			}
			else{
				sb.append(expr.charAt(i));
			}
		}
		while(!s.isEmpty()){
			sb.append(s.pop());
		}
		
		return sb.toString();
	}
	
	
	
	private boolean isOperator(char c){
		return (c=='+' || c=='-' || c=='*' || c=='/' || c=='(' || c==')' || c=='^')?true:false;
	}
}
