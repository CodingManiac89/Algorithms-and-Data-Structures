package stacks;

import java.util.ArrayList;
import java.util.List;

import ds.QueueUsingLinkedList;
import ds.StackUsingLinkedList;
public class DFSGraph{
	int vertices;
	ArrayList adjEdges[];

	public DFSGraph(int vertices) {
		this.vertices = vertices;
		adjEdges = new ArrayList[vertices];
	}

	public void addEdge(int v, int e){
		if(adjEdges[v]==null){
			adjEdges[v] = new ArrayList<>();
		}
		adjEdges[v].add(e);
	}


	public void dfs(){
		StackUsingLinkedList<Integer> s = new StackUsingLinkedList<>();
		boolean[] visited = new boolean[vertices];
		s.push(0);
		visited[0]=true;
		while(!s.isEmpty()){
			int vertex  = s.pop();
			System.out.println(vertex);

			for(Object ve:adjEdges[vertex]){
				int ev = (Integer)ve;
				if(!visited[ev]){
					s.push(ev);
					visited[ev] = true;
				}
			}
		}
	}
	
	public void dfsUsingRecursion(int vertex, boolean[] visited){
		if(visited[vertex]==true){
			return;
		}
		visited[vertex]=true;
		System.out.println(vertex);
		for(int ver=adjEdges[vertex].size()-1;ver >= 0 ;ver--){
			int vtx = (int) adjEdges[vertex].get(ver);
			dfsUsingRecursion(vtx, visited);
		}
	}
	
	
	public void bfsUsingRecursion(QueueUsingLinkedList<Integer> queue, boolean[] visited){
		if(queue.isEmpty()){
			return;
		}
		int v = queue.delete();
		
		visited[v]=true;
		for(int ver=0;ver<adjEdges[v].size() ;ver++){
			int vtx = (int) adjEdges[v].get(ver);
			if(!visited[vtx]){
				queue.insert(vtx);
			}	
		}
		System.out.println(v);
		bfsUsingRecursion(queue, visited);
	}

	

	

	public void displayGraph(){
		for(int i=0;i<adjEdges.length;i++){
			System.out.println("Vertex is:"+i);
			for(int j=0;j<adjEdges[i].size();j++){
				System.out.println("Edges are:"+i+"->"+adjEdges[i].get(j)+",");
			}
			System.out.println("\n\n");


		}
	}
	
	public boolean isCyclic(int vertex, boolean[] visited){
		if(visited[vertex]==true){
			return false;
		}
		visited[vertex]=true;
		System.out.println(vertex);
		for(int ver=adjEdges[vertex].size()-1;ver >= 0 ;ver--){
			int vtx = (int) adjEdges[vertex].get(ver);
			dfsUsingRecursion(vtx, visited);
		}
		return true;
	}
}
