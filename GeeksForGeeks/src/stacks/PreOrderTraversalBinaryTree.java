package stacks;

import ds.StackUsingLinkedList;

public class PreOrderTraversalBinaryTree {
	private Node tree;
	
	public class Node implements Comparable<Node>{
		private Node left;
		private int data;
		private Node right;
		public Node(Node left, int data, Node right) {
			super();
			this.left = left;
			this.data = data;
			this.right = right;
		}
		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		
	}
	
	
	public PreOrderTraversalBinaryTree() {
		tree = new Node(null, 2, null);
		tree.right = new Node(null, 4, null);
		tree.right.left = new Node(null, 3, null);
	}
	
	
	public void preOrderUsingRecursion(Node tree){
		if(tree==null){
			return;
		}
		else{
			System.out.println(tree.data);
			preOrderUsingRecursion(tree.left);
			preOrderUsingRecursion(tree.right);
		}
	}
	
	public void preOrderUsingStack(StackUsingLinkedList<Node> s){
		
		while(!s.isEmpty()){
			Node n = s.pop();
			System.out.println(n.data);
			if(n.right!=null){
				s.push(n.right);
			}
			if(n.left!=null){
				s.push(n.left);
			}
		}
		
		
	}


	public Node getTree() {
		return tree;
	}
	
	
}
