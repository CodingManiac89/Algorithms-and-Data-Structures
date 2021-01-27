package test;

import ds.QueueUsingLinkedList;
import stacks.DFSGraph;

public class TestDFSOfGraph {
	public static void main(String[] args) {
		DFSGraph dfsg = new DFSGraph(5);
		dfsg.addEdge(1, 0);
	    dfsg.addEdge(0, 2);
	    dfsg.addEdge(2, 1);
	    dfsg.addEdge(0, 3);
	    dfsg.addEdge(3, 4);
	    dfsg.addEdge(4, 0);
		/*dfsg.addEdge(0, 1);
		dfsg.addEdge(0, 2);
		dfsg.addEdge(1, 2);
		dfsg.addEdge(2, 0);
		dfsg.addEdge(2, 3);
		dfsg.addEdge(3, 3);
*/
		//dfsg.dfs();
		//dfsg.displayGraph();
		/*boolean[] v = new boolean[5];
		dfsg.dfsUsingRecursion(0, v);*/
		/*QueueUsingLinkedList<Integer> q = new QueueUsingLinkedList<>();
		q.insert(2);
		boolean[] v = new boolean[5];
		dfsg.bfsUsingRecursion(q, v);*/
	    boolean[] v = new boolean[5];
		dfsg.dfsUsingRecursion(0, v);
	    System.out.println(dfsg.isCyclic(0, v));
	}
}

