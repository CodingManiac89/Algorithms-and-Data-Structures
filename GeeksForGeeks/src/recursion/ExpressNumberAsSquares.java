package recursion;

public class ExpressNumberAsSquares {
	private void expressNumberAsPower(int num,int pow,int start,String powers){
		if(start==num){
			System.out.println(powers);
		}
		else{
			int sum=0;
			sum = (int) (sum + Math.pow(start, pow));
			powers = powers+" "+sum+"^"+pow;
			expressNumberAsPower(num, pow, sum, powers);
		}
	}
	
	
	public static void main(String[] args) {
		ExpressNumberAsSquares ob  = new ExpressNumberAsSquares();
		ob.expressNumberAsPower(9, 2, 0, "");
	}
}
