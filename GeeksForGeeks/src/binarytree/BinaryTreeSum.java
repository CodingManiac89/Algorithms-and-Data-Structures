package binarytree;

public class BinaryTreeSum {
	private Node tree;
	private class Node{
		int data;
		Node left;
		Node right;
	}
	
	public BinaryTreeSum() {
		this.tree = new Node();
		tree.data=1;
		tree.left = new Node();
		tree.left.data = 2;
		tree.right = new Node();
		tree.right.data = 3;
		
		tree.left.left = new Node();
		tree.left.left.data = 4;
	}
	
	
	public void inorderTraversal(Node root){
		if(root==null){
			return;
		}
		inorderTraversal(root.left);
		System.out.println(root.data);
		inorderTraversal(root.right);
	}
	
	public int inorderSumInRoot(Node root){
		if(root==null){
			return 0;
		}
		else
			return root.data = root.data+inorderSumInRoot(root.left)+inorderSumInRoot(root.right);
	}
	
	
	public static void main(String[] args) {
		BinaryTreeSum bs = new BinaryTreeSum();
		bs.inorderSumInRoot(bs.tree);
		bs.inorderTraversal(bs.tree);
	}
	
}
