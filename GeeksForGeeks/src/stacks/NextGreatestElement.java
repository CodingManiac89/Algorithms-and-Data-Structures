package stacks;
import ds.Stack;


public class NextGreatestElement {
	public static void main(String[] args) {
		int[] arr = {4,5,2,25};
		Stack<Integer> st = new Stack<>(Integer.class, arr.length);

		st.push(arr[0]);
		for(int i=1;i<arr.length;i++){
			int next = arr[i];

			if(!st.isEmpty()){
				int cur = st.pop();

				while(cur < next){
					System.out.println(cur+"--->"+next);
					if(st.isEmpty()){
						break;
					}
					cur = st.pop();

				}
				if(cur>next){
					st.push(cur);
				}

				
			}
			st.push(next);


		}
	}
}
