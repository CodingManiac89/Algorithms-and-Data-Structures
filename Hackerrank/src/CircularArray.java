import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;


public class CircularArray {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        LinkedList<Integer> list = createList(a);
        for(int i=0;i<k;i++){
            rotateArray(list);
        }
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            
            System.out.println(list.get(m));
        }
    }

	private static LinkedList<Integer> createList(int[] a) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int ele:a){
			list.add(ele);
		}
		return list;
	}

	private static void rotateArray(LinkedList<Integer> list) {
		int num = list.getLast();
		list.removeLast();
		list.addFirst(num);
	}
}
