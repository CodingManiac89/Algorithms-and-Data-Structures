package stacks;
import ds.Stack;


public class CheckForBalancedParanthesis {
	
	public static void main(String[] args) {
		char[] par = {'[','{','}',']'};
		Stack<Character> expr = new Stack<>(Character.class,4);
		boolean balanced=true;
		for(char c:par){
			if(c=='}' || c=='}'){
				Character op = expr.pop();
				if(op != '{' && c == '}'){
					balanced = false;
				}
				else if(op != '[' && c == ']'){
					balanced = false;
				}
			}
			else{
				expr.push(c);
			}
		}
		
		System.out.println("The paranthesis balanced:"+balanced);
	}
}
