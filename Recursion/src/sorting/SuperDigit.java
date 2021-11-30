package recursion;

import java.math.BigInteger;

public class SuperDigit {
	
	public static void main(String[] args) {
		superDigit("345", 10);
	}
	
	public static int superDigit(String n, int k) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<k;i++){
			sb.append(n);
		}
		BigInteger num = findSuperDigit(new BigInteger(sb.toString()));
		return num.intValue();
	}

	public static BigInteger findSuperDigit(BigInteger num){
		if(num.compareTo(BigInteger.valueOf(10)) < 0){
			return num;
		}
		String numStr = String.valueOf(num);
		BigInteger sum = new BigInteger("0");
		for(int i=0;i<numStr.length();i++){
			sum = sum.add(new BigInteger(new Character(numStr.charAt(i)).toString()));
		}
		return findSuperDigit(sum);
	}
}
