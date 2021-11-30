package recursion;

public class FibonacciRecursion {
	public static void main(String[] args) {
		fibonacciRecursion(0,1,0,0,10);
	}

	private static void fibonacciRecursion(int left, int right, int sum, int iter, int max) {
		if(iter >= max) {
			return;
		}
		System.out.println(sum);
		sum = left + right;
		right = left;
		left = sum;
		iter++;
		
		fibonacciRecursion(left, right, sum, iter, max);
	}
}
