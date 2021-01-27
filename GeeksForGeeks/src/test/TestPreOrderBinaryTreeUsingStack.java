package test;

import stacks.PreOrderTraversalBinaryTree;
import ds.StackUsingLinkedList;

public class TestPreOrderBinaryTreeUsingStack {
	public static void main(String[] args) {
		PreOrderTraversalBinaryTree bt = new PreOrderTraversalBinaryTree();
		StackUsingLinkedList<PreOrderTraversalBinaryTree.Node> s = new StackUsingLinkedList<>(); 
		s.push(bt.getTree());
		bt.preOrderUsingStack(s);
	}
}
