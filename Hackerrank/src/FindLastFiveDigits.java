
public class FindLastFiveDigits {
	public static void main(String[] args) {
		long i = 20;
		long num = fact(i);
		
		long numWithoutZeroes= findNumWithoutTrailingZeros((double) num,(double) num/10);
	}
	
	
	private static long findNumWithoutTrailingZeros(double num, double divNum) {
		System.out.println(num+","+divNum);
		return 0;
	}


	public static long fact(long n){
		if(n<1){
			return 1;
		}
		return n*fact(n-1);
	}
	
	
}
