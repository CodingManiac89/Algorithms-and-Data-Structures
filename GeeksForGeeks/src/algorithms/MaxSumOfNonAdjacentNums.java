package algorithms;

public class MaxSumOfNonAdjacentNums {
	public static int getMaxNonAdjacentSum(int[] arr){
		int max=0;
		for(int i=0;i<arr.length;i++){
			int sum = 0;
			for(int j=i+1;j<arr.length;j++){
				
				if(j-i>1){
					sum = sum+arr[i]+arr[j];
				}
			}
			if(max<sum)
			max = sum;
		}
		return max;
	}
	
	public static void main(String[] args) {
		int arr[] = {5, 5, 10, 100, 10, 5};
		System.out.println(getMaxNonAdjacentSum(arr));
	}
}
