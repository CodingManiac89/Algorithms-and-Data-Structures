package lists;

import ds.LinkedListImpl;

public class AdditionOfTwoLinkedLists {
	public LinkedListImpl<Integer> summedLinkedList = new LinkedListImpl<>();
	int sum,carry = 0;
	public void add(LinkedListImpl<Integer> l1, LinkedListImpl<Integer> l2){
		while(!l1.isEmpty() || !l2.isEmpty()){
			int d1 = l1.pop();
			int d2 = l2.pop();
			sum = carry+(d1 + d2);
			carry = (sum > 9) ? 1:0;
			if(sum >= 10){
				sum = sum%10;
			}
			
			summedLinkedList.add(sum);
		}
		if(carry > 0){
			summedLinkedList.add(carry);
		}
	}
	
}
