package ds;

public class MinStack<T extends Comparable<T>> extends Stack<T>{

	public MinStack(Class type, int size) {
		super(type, size);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void push(T ele) {
		
		if(this.isEmpty()){
			super.push(ele);
		}
		else{
			T curTop = getTopEle();
			if(ele.compareTo(curTop)<=0){
				super.push(ele);
			}
			else{
				super.push(curTop);
			}
		}
		
		
			
	}
	
	public T getMin(){
		return getTopEle();
	}

}
