
public class FindFactors {
	public static void main(String[] args) {
		int[] arr = {16,32,96};
		int num = 96;
		for(int i:arr){
			if(num%i==0){
				System.out.println(i);
			}
		}
	}
}
