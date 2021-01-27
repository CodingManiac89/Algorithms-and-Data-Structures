import java.util.AbstractQueue;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.lang.*;




public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int tc = s.nextInt();
		Queue<Integer> q = new LinkedList<>();
		for(int i=0;i<tc;i++){
			int n = s.nextInt();
			int[] arr = new int[n];
			for(int j=0;j<n;j++){
				arr[j] = s.nextInt();
			}

			int k=0;
			int l=1;
			int count=0;
			while(l<arr.length){
				if(arr[k]<arr[l]){
					int m = arr[k];
					arr[k] = arr[l];
					arr[l] = m;
					count++;
				}
				k++;
				l++;
			}

			q.add(count);



		}
		while(!q.isEmpty()){
			System.out.println(q.poll());
		}






	}

}
