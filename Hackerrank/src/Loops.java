import java.util.Scanner;


public class Loops {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int space=n;
		for(int i=0;i<n;i++){
			System.out.printf("%"+space+"s","");
			for(int j=0;j<i;j++){
				System.out.print("#");
			}
			space--;
			System.out.println("");

		}
	}
}
