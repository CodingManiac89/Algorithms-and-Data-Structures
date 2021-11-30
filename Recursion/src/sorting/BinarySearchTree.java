package trees;

import java.util.Scanner;

public class HeightOfTree {
	public static int height(Node root) {
        int height=0;
        int maxHeight=0;
        return findHeight(height,root, maxHeight);
    }
    
    public static int findHeight(int height,Node tree, int maxHeight){
        if(tree.left!=null){
            height++;
            maxHeight = findHeight(height,tree.left,maxHeight);
        }
        if(tree.right!=null){
            height++;
            maxHeight = findHeight(height,tree.right,maxHeight);
        }
            if(maxHeight < height){
                maxHeight = height;
                height--;
                
                return maxHeight;
            }
            else{
            	height--;
                //System.out.println(maxHeight);
                return maxHeight;
            }
            
        
    }
    
    public static void main(String[] args) {
         Node root = null;
         root = insert(root,25);
         insert(root,20);
         insert(root,36);
         insert(root,10);
         insert(root,22);
         insert(root,30);
         insert(root,40);
         insert(root,5);
         insert(root,12);
         insert(root,28);
         insert(root,38);
         insert(root,48);
         //System.out.println(root);
         //inOrderTraversal(root);
         postOrderTraversal(root);
	}
    
    
    public static Node insert(Node root, int data) {
        if(root==null) {
        	root = new Node(data);
        }
        if(data < root.data) {
        	 root.left = insert(root.left,data);
        }
        if(data > root.data) {
        	root.right = insert(root.right,data);
        }
        return root;
    }
    
    
    public static void inOrderTraversal(Node root) {
    	if(root==null) {
    		return;
    	}
    	
    	inOrderTraversal(root.left);
    	System.out.println(root.data);
    	inOrderTraversal(root.right);
    	
    }
    
    
    public static void postOrderTraversal(Node root) {
    	if(root==null) {
    		return;
    	}
    	
    	postOrderTraversal(root.left);
    	postOrderTraversal(root.right);
    	
    	System.out.println(root.data);
    }

}

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }

	@Override
	public String toString() {
		return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
	}
    
    

	
    
    
}
