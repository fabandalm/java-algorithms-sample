package com.falmeida.tech;

public class BSTInOrderSample {

    Node root; 
  
    BSTInOrderSample(){ 
        root = null; 
    } 
	
    void printInorder(Node node){ 
        if (node == null) 
            return; 
  
        /* first recur on left child */
        printInorder(node.left); 
  
        /* then print the data of node */
        System.out.print(node.key + " "); 
  
        /* now recur on right child */
        printInorder(node.right); 
    } 
    
    void printInorder()    {     
    	printInorder(root);   
    } 
    
    public static void main(String[] args){ 
    	
    	BSTInOrderSample tree = new BSTInOrderSample(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
  
        System.out.println("\nInorder traversal of binary tree is "); 
        tree.printInorder(); 
  
    } 
    
}


