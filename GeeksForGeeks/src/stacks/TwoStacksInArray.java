package stacks;

public class TwoStacksInArray {
	private int[] arr;
	private int top1;
	private int top2;
	
	public TwoStacksInArray(int size) {
		arr = new int[size];
		top1 = -1;
		top2 = arr.length;
	}
	
	private void push1(int ele) {
		if(top2-top1<1){
			throw new StackOverflowError("Stack1 overflow");
		}
		else{
			top1++;
			arr[top1] = ele; 
		}	

	}
	
	private void push2(int ele){
		if(top2-top1<1){
			throw new StackOverflowError("Stack2 overflow");
		}
		else{
			top2--;
			arr[top2] = ele;
			
		}
	}
	
	private int pop1(){
		int ele=0;
		if(top1==-1){
			throw new RuntimeException("Stack1 underflow");
		}
		else{
			ele = arr[top1];
			top1--;
		}
		return ele;
	}
	
	
	private int pop2(){
		int ele=0;
		if(top2==arr.length){
			throw new RuntimeException("Stack2 underflow");
		}
		else{
			ele = arr[top2];
			top2++;
		}
		return ele;
	}
	
	public static void main(String[] args) {
		TwoStacksInArray stacks  = new TwoStacksInArray(6);
		stacks.push1(1);
		stacks.push2(2);
		stacks.push1(3);
		stacks.push2(4);
		stacks.push1(5);
		stacks.push2(6);
		System.out.println(stacks.pop1());
		System.out.println(stacks.pop2());
		System.out.println(stacks.pop1());
		System.out.println(stacks.pop2());
		System.out.println(stacks.pop1());
		System.out.println(stacks.pop2());
	}
}
