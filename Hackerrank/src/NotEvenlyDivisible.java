
public class NotEvenlyDivisible {
	public static void main(String[] args) {
		int count=0;
		int[] arr = {1,7,2,4};
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				int sum = arr[i]+arr[j];
				if(sum%3!=0){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
