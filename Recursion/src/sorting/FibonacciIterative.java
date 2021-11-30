package recursion;

import java.math.BigInteger;

public class FibonacciIterative {
	public static void main(String[] args) {
		generateFibonacciSeries(100);
	}

	private static void generateFibonacciSeries(int range) {
		BigInteger left = new BigInteger("1");
		BigInteger right = new BigInteger("1");
		BigInteger sum=new BigInteger("0");
		for(int i=0;i<range;i++) {
			sum = left.add(right);
			right = left;
			left = sum;
			
			System.out.println(sum);
			
			
			
		}
		
	}
}
