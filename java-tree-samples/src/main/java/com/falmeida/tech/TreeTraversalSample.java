package com.falmeida.tech;

public class TreeTraversalSample {
	
	public static void main(String[] args) {
		
		Node root = new Node(1);
		
		root.setLeft(new Node(2));
		
		root.setRight(new Node(3));
		
		root.getLeft().setLeft(new Node(4));
		
		root.getLeft().setRight(new Node(5));
		
		root.getRight().setLeft(new Node(6));
		
		root.getRight().setRight(new Node(7));
		
		printTreeLeafs(root);
		
	}
	
	public static void printTreeLeafs(Node node) {
		
		if(node == null) return;
		
		System.out.print(" -> " + node.getKey());
		
		printTreeLeafs(node.getLeft());
		printTreeLeafs(node.getRight());
		
	}

}
