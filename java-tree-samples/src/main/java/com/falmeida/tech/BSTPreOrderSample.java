package com.falmeida.tech;

public class BSTPreOrderSample {

    Node root; 
  
    BSTPreOrderSample(){ 
        root = null; 
    } 
	
    /* Given a binary tree, print its nodes in preorder*/
    void printPreorder(Node node) 
    { 
        if (node == null) 
            return; 
  
        /* first print data of node */
        System.out.print(node.key + " "); 
  
        /* then recur on left sutree */
        printPreorder(node.left); 
  
        /* now recur on right subtree */
        printPreorder(node.right); 
    } 
    
    void printPreorder()   {     
    	printPreorder(root);  
    }  
    
    public static void main(String[] args){ 
    	
    	BSTPreOrderSample tree = new BSTPreOrderSample(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
  
        System.out.println("\nPreorder traversal of binary tree is "); 
        tree.printPreorder();
  
    } 
    
}


